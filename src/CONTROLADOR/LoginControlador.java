package CONTROLADOR;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.Types;
import DATOS.OracleHelper; // Importamos tu clase de conexión
import javax.swing.JOptionPane;

public class LoginControlador {

    // Método para validar el usuario usando el Procedimiento Almacenado
    public boolean validarIngreso(String id, String clave) {
        boolean loginExitoso = false;
        Connection cn = OracleHelper.conectar(); // Usamos tu OracleHelper

        if (cn != null) {
            try {
                // Llamamos al procedimiento que creamos en Oracle
                String sql = "{call login_usuario(?, ?, ?)}";
                CallableStatement cs = cn.prepareCall(sql);

                // Parámetros de entrada
                cs.setString(1, id);
                cs.setString(2, clave);

                // Parámetro de salida (el resultado del COUNT)
                cs.registerOutParameter(3, Types.INTEGER);

                cs.execute();

                // Si el procedimiento devuelve más de 0, los datos existen
                int resultado = cs.getInt(3);
                if (resultado > 0) {
                    loginExitoso = true;
                }

                cs.close();
                cn.close();

            } catch (Exception e) {
                System.out.println("Error en la validación: " + e.getMessage());
            }
        }
        return loginExitoso;
    }
}