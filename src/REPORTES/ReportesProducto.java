package REPORTES;
import java.sql.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import com.itextpdf.text.Image;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.File;

public class ReportesProducto {
   public void GenerarReporte() {
    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Document doc = new Document();
    String nombreArchivo = "reporte_productos.pdf"; // Guardamos el nombre en una variable

    try {
        Class.forName("oracle.jdbc.OracleDriver");
        cn = DriverManager.getConnection(
            "jdbc:oracle:thin:@//10.164.61.135:1521/FREE",
            "system",
            "oracle"
        );

        PdfWriter.getInstance(doc, new FileOutputStream(nombreArchivo));
        doc.open();

        // 1. AGREGAR EL LOGO (Asegúrate de tener la imagen en la carpeta de tu proyecto)
        try {
            Image logo = Image.getInstance("/IMAGENES/mac.png"); // Nombre de tu archivo de imagen
            logo.scaleToFit(100, 100); // Ajustar tamaño
            logo.setAlignment(Element.ALIGN_CENTER);
            doc.add(logo);
        } catch (Exception e) {
            System.out.println("No se encontró el logo, continuando sin imagen...");
        }

        // Título del reporte
        Font titulo = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
        Paragraph t = new Paragraph("Reporte de Productos", titulo);
        t.setAlignment(Element.ALIGN_CENTER);
        doc.add(t);
        doc.add(new Paragraph(" "));

        // Consulta SQL
        ps = cn.prepareStatement("SELECT IDPRODUCTO, NOMBRE, PRECIO FROM producto ORDER BY IDPRODUCTO");
        rs = ps.executeQuery();

        PdfPTable tabla = new PdfPTable(3);
        tabla.setWidthPercentage(100);
        tabla.addCell("ID");
        tabla.addCell("Nombre");
        tabla.addCell("Precio");

        boolean haydatos = false;
        while (rs.next()) {
            haydatos = true;
            tabla.addCell(rs.getString(1));
            tabla.addCell(rs.getString(2));
            tabla.addCell(rs.getString(3));
        }

        if (haydatos) {
            doc.add(tabla);
        } else {
            doc.add(new Paragraph("No hay productos disponibles"));
        }

        doc.close(); // Cerramos el documento para que se guarde en el disco
        cn.close();

        // 2. VENTANA EMERGENTE
        javax.swing.JOptionPane.showMessageDialog(null, "¡Reporte generado con éxito!");

        // 3. ABRIR EL PDF AUTOMÁTICAMENTE
        java.io.File path = new java.io.File(nombreArchivo);
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop.getDesktop().open(path);
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error al generar reporte: " + e.getMessage());
        e.printStackTrace();
    }
}}