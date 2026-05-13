package REPORTES;

import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;

public class ReporteStockdeProductos { // Puedes renombrar la clase a ReportePromociones si gustas

    public void StockProductos() { // Nombre del método según tu estructura
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Document doc = new Document();
        String nombreArchivo = "reporte_promociones.pdf";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            cn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//10.164.61.135:1521/FREE",
                    "system",
                    "oracle"
            );

            PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
            doc.open();

            // 1. AGREGAR LOGO
            try {
                java.net.URL logoUrl = getClass().getResource("/imagenes/mac.png");
                if (logoUrl != null) {
                    Image logo = Image.getInstance(logoUrl);
                    logo.scaleToFit(80, 80);
                    logo.setAlignment(Element.ALIGN_CENTER);
                    doc.add(logo);
                }
            } catch (Exception e) {
                System.out.println("Logo no encontrado");
            }

            // Título
            Font titulo = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            Paragraph t = new Paragraph("Reporte de Promociones Vigentes", titulo);
            t.setAlignment(Element.ALIGN_CENTER);
            doc.add(t);
            doc.add(new Paragraph(" "));

            // 2. CONSULTA SQL (Ajustada a tu imagen)
            // Seleccionamos Nombre, Descuento, Fecha Inicio y Fecha Fin
            String sql = "SELECT NOMBRE, DESCUENTO, FECHA_INICIO, FECHA_FIN FROM PROMOCION ORDER BY FECHA_FIN ASC";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            // Tabla de 4 columnas
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            
            // Encabezados de la tabla
            tabla.addCell("Promoción");
            tabla.addCell("Descuento (%)");
            tabla.addCell("Fecha Inicio");
            tabla.addCell("Fecha Fin");

            boolean haydatos = false;
            while (rs.next()) {
                haydatos = true;
                tabla.addCell(rs.getString("NOMBRE"));
                tabla.addCell(rs.getString("DESCUENTO"));
                tabla.addCell(rs.getString("FECHA_INICIO"));
                tabla.addCell(rs.getString("FECHA_FIN"));
            }

            if (haydatos) {
                doc.add(tabla);
            } else {
                doc.add(new Paragraph("No hay promociones registradas."));
            }

            // Cierre de procesos
            doc.close();
            cn.close();

            // 3. VENTANA EMERGENTE
            JOptionPane.showMessageDialog(null, "¡Reporte de Promociones generado con éxito!");

            // 4. ABRIR AUTOMÁTICAMENTE
            File path = new File(nombreArchivo);
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(path);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar reporte: " + e.getMessage());
            e.printStackTrace();
        }
    }
}