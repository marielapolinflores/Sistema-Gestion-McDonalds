package REPORTES;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream; 

public class ReporteClientes {
    public void ReporteClientes(){
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
            new FileOutputStream("reporte_clientes.pdf"));

        doc.open();

        Font titulo = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD);
        Paragraph t = new Paragraph("Reporte de Clientes", titulo);
        t.setAlignment(Element.ALIGN_CENTER);
        doc.add(t);
        doc.add(new Paragraph(" "));

        PdfPTable tabla = new PdfPTable(3);
        tabla.setWidthPercentage(100);
        tabla.setHeaderRows(1);
        tabla.setSplitLate(false);

        tabla.addCell("ID");
        tabla.addCell("Nombre");
        tabla.addCell("Email");

        ps = cn.prepareStatement("SELECT IDCLIENTE, NOMBRE, EMAIL FROM CLIENTES ORDER BY IDCLIENTE");
        rs = ps.executeQuery();

        boolean haydatos = false;

        while(rs.next()){
            haydatos = true;
            tabla.addCell(rs.getString(1));
            tabla.addCell(rs.getString(2));
            tabla.addCell(rs.getString(3));
        }

        if(haydatos){
            doc.add(tabla);
        } else {
            doc.add(new Paragraph("No hay clientes disponibles"));
        }

        doc.close();
        cn.close();
 if (java.awt.Desktop.isDesktopSupported()) {
    java.awt.Desktop.getDesktop().open(
        new java.io.File("reporte_clientes.pdf")
    );
}

System.out.println("Reporte de clientes generado");
    } catch(Exception e){
        e.printStackTrace();
    }
}
    
}