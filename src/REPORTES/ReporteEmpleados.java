package REPORTES;

import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;

public class ReporteEmpleados {

    public void ReporteEmpleados() {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Document doc = new Document();
        String nombreArchivo = "reporte_empleados.pdf";

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
            Paragraph t = new Paragraph("Reporte de Empleados", titulo);
            t.setAlignment(Element.ALIGN_CENTER);
            doc.add(t);
            doc.add(new Paragraph(" "));

            // 2. CONSULTA SQL CORREGIDA (Según tu imagen: IDEMPLEADO, NOMBRE, IDSUCURSAL)
            String sql = "SELECT IDEMPLEADO, NOMBRE, IDSUCURSAL FROM EMPLEADO ORDER BY IDEMPLEADO";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            PdfPTable tabla = new PdfPTable(3);
            tabla.setWidthPercentage(100);
            
            // Encabezados
            tabla.addCell("ID Empleado");
            tabla.addCell("Nombre Completo");
            tabla.addCell("ID Sucursal");

            boolean haydatos = false;
            while (rs.next()) {
                haydatos = true;
                tabla.addCell(rs.getString("IDEMPLEADO"));
                tabla.addCell(rs.getString("NOMBRE"));
                tabla.addCell(rs.getString("IDSUCURSAL"));
            }

            if (haydatos) {
                doc.add(tabla);
            } else {
                doc.add(new Paragraph("No hay empleados registrados en el sistema."));
            }

            // Cierre de flujos
            doc.close();
            cn.close();

            // 3. VENTANA EMERGENTE
            JOptionPane.showMessageDialog(null, "¡Reporte de Empleados generado con éxito!");

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