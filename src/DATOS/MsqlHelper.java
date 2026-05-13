
package DATOS;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MsqlHelper { 


    public static Connection conectar() { 
        Connection conect = null;
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://192.168.1.50:3306/mcdonalds_peru"; 
            String user = "MacDonalds"; 
            String pass = "159753";     

            conect = DriverManager.getConnection(url, user, pass);
            System.out.println("✔ Conexión Exitosa a MySQL en VM");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "✘ Error de Conexión MySQL: " + e.getMessage());
        }
        return conect;
    }
}
