package REPORTES;

import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

public class ReporteFactura {

    public void GenerarFactura(int idVenta) {

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Document doc = new Document();

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            cn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//10.164.61.135:1521/FREE",
                "system",
                "oracle"
            );

            PdfWriter.getInstance(doc,
                new FileOutputStream("factura_" + idVenta + ".pdf"));

            doc.open();

            Font titulo = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            Paragraph t = new Paragraph("FACTURA DE VENTA", titulo);
            t.setAlignment(Element.ALIGN_CENTER);
            doc.add(t);
            doc.add(new Paragraph(" "));

            ps = cn.prepareStatement(
                "SELECT p.IDPEDIDO, c.NOMBRE, p.FECHA_PEDIDO, p.TOTAL " +
                "FROM PEDIDO p JOIN CLIENTES c ON p.IDCLIENTE = c.IDCLIENTE " +
                "WHERE p.IDPEDIDO = ?"
            );

            ps.setInt(1, idVenta);
            rs = ps.executeQuery();

            if (rs.next()) {
                doc.add(new Paragraph("N° Venta: " + rs.getString(1)));
                doc.add(new Paragraph("Cliente: " + rs.getString(2)));
                doc.add(new Paragraph("Fecha: " + rs.getString(3)));
                doc.add(new Paragraph(" "));
            }

            PdfPTable tabla = new PdfPTable(4);

            tabla.addCell("Producto");
            tabla.addCell("Cantidad");
            tabla.addCell("Precio");
            tabla.addCell("Subtotal");

            ps = cn.prepareStatement(
                "SELECT IDPRODUCTO, CANTIDAD, PRECIO_UNITARIO, " +
                "(CANTIDAD * PRECIO_UNITARIO) " +
                "FROM DETALLEPEDIDO WHERE IDPEDIDO = ?"
            );

            ps.setInt(1, idVenta);
            rs = ps.executeQuery();

            while (rs.next()) {
                tabla.addCell(rs.getString(1));
                tabla.addCell(rs.getString(2));
                tabla.addCell(rs.getString(3));
                tabla.addCell(rs.getString(4));
            }

            doc.add(tabla);
            doc.add(new Paragraph(" "));

            ps = cn.prepareStatement(
                "SELECT TOTAL FROM PEDIDO WHERE IDPEDIDO = ?"
            );

            ps.setInt(1, idVenta);
            rs = ps.executeQuery();

            if (rs.next()) {
                doc.add(new Paragraph("TOTAL A PAGAR: " + rs.getString(1)));
            }

            doc.close();
            cn.close();

            System.out.println("Factura generada");
doc.close();
cn.close();

java.awt.Desktop.getDesktop().open(
    new java.io.File("factura_" + idVenta + ".pdf")
);

System.out.println("Factura generada");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
