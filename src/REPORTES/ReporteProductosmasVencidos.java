package REPORTES;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

public class ReporteProductosmasVencidos {
    
    public void ProductosMasVendidos(){
    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Document doc = new Document();

    try {
        Class.forName("oracle.jdbc.OracleDriver");
        cn = DriverManager.getConnection(
            "jdbc:oracle:thin:@//10.164.61.135:1521/FREE",
            "system","oracle");

        PdfWriter.getInstance(doc,
            new FileOutputStream("productos_mas_vendidos.pdf"));

        doc.open();

        Font titulo = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD);
        Paragraph t = new Paragraph("Productos Más Vendidos", titulo);
        t.setAlignment(Element.ALIGN_CENTER);
        doc.add(t);
        doc.add(new Paragraph(" "));

        PdfPTable tabla = new PdfPTable(2);
        tabla.setWidthPercentage(100);
        tabla.setHeaderRows(1);
        tabla.setSplitLate(false);

        tabla.addCell("Producto");
        tabla.addCell("Cantidad");

        ps = cn.prepareStatement(
            "SELECT p.nombre, SUM(d.cantidad) total " +
            "FROM detalle_venta d JOIN productos p ON d.id_producto = p.id " +
            "GROUP BY p.nombre ORDER BY total DESC");

        rs = ps.executeQuery();

        boolean haydatos = false;

        while(rs.next()){
            haydatos = true;
            tabla.addCell(rs.getString(1));
            tabla.addCell(rs.getString(2));
        }

        if(haydatos){
            doc.add(tabla);
        } else {
            doc.add(new Paragraph("No hay datos disponibles"));
        }

        doc.close();
        cn.close();

    } catch(Exception e){
        e.printStackTrace();
    }
}
}