package DATOS;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class OracleHelper {
    
    // Al agregar 'static', permites que PagoControlador lo use directamente
    public static Connection conectar() { 
        Connection conect = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conect = DriverManager.getConnection(
                "jdbc:oracle:thin:@//192.168.1.50:1521/ORCL", 
                "MacDonalds", 
                "159753"
            );
            System.out.println("✔ Conexión Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "✘ Error de Conexión: " + e.getMessage());
        }
        return conect;
    }
}