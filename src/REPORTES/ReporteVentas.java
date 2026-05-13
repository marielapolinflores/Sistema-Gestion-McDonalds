package REPORTES;

import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;

public class ReporteVentas {

    public void VentasPorFecha() {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Document doc = new Document();
        String nombreArchivo = "ventas_por_fecha.pdf";

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
            Paragraph t = new Paragraph("Reporte de Ventas por Fecha", titulo);
            t.setAlignment(Element.ALIGN_CENTER);
            doc.add(t);
            doc.add(new Paragraph(" "));

            // 2. CONSULTA CORREGIDA SEGÚN TU IMAGEN (Tabla: PEDIDO)
            String sql = "SELECT FECHA_PEDIDO, SUM(TOTAL) FROM PEDIDO GROUP BY FECHA_PEDIDO ORDER BY FECHA_PEDIDO";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(100);
            tabla.addCell("Fecha del Pedido");
            tabla.addCell("Total Recaudado");

            boolean haydatos = false;
            while (rs.next()) {
                haydatos = true;
                tabla.addCell(rs.getString(1)); // FECHA_PEDIDO
                tabla.addCell(rs.getString(2)); // SUM(TOTAL)
            }

            if (haydatos) {
                doc.add(tabla);
            } else {
                doc.add(new Paragraph("No hay pedidos registrados en la base de datos."));
            }

            // Cierre de flujos
            doc.close();
            cn.close();

            // 3. VENTANA EMERGENTE
            JOptionPane.showMessageDialog(null, "¡Reporte de Ventas generado con éxito!");

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