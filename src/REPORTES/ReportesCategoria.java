package REPORTES;

import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;

public class ReportesCategoria {

    public void GenerarReporte() {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Document doc = new Document();
        String nombreArchivo = "reporte_categoria.pdf";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            cn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//10.164.61.135:1521/FREE",
                    "system",
                    "oracle"
            );

            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();

            // 1. AGREGAR LOGO DESDE PAQUETE IMAGENES
            try {
                java.net.URL logoUrl = getClass().getResource("/imagenes/mac.png");
                if (logoUrl != null) {
                    Image logo = Image.getInstance(logoUrl);
                    logo.scaleToFit(80, 80);
                    logo.setAlignment(Element.ALIGN_CENTER);
                    doc.add(logo);
                }
            } catch (Exception e) {
                System.out.println("Logo no encontrado, continuando...");
            }

            // Título
            Font titulo = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            Paragraph t = new Paragraph("Reporte de Categorías", titulo);
            t.setAlignment(Element.ALIGN_CENTER);
            doc.add(t);
            doc.add(new Paragraph(" "));

            // 2. CONSULTA CORREGIDA (ORDER BY IDCATEGORIA)
            ps = cn.prepareStatement("SELECT IDCATEGORIA, NOMBRE FROM categoria ORDER BY IDCATEGORIA");
            rs = ps.executeQuery();

            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(100);
            tabla.addCell("ID CATEGORÍA");
            tabla.addCell("NOMBRE");

            boolean haydatos = false;
            while (rs.next()) {
                haydatos = true;
                tabla.addCell(rs.getString("IDCATEGORIA"));
                tabla.addCell(rs.getString("NOMBRE"));
            }

            if (haydatos) {
                doc.add(tabla);
            } else {
                doc.add(new Paragraph("No hay categorías disponibles"));
            }

            // IMPORTANTE: Cerrar antes de abrir el archivo
            doc.close();
            cn.close();

            // 3. VENTANA EMERGENTE
            JOptionPane.showMessageDialog(null, "¡Reporte de Categorías generado con éxito!");

            // 4. ABRIR AUTOMÁTICAMENTE
            File path = new File(nombreArchivo);
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(path);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}