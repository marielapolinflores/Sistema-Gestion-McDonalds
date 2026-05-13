package CONTROLADOR;

import DATOS.OracleHelper;
import MODELO.MetodoPago;
import java.sql.*;
import java.util.ArrayList;

public class MetodoPagoControlador {

    OracleHelper con = new OracleHelper();
    Connection cn = con.conectar();

    // INSERTAR
    public String agregar(MetodoPago m){
        String rpta = "";
        try{
            CallableStatement cs = cn.prepareCall("{call SpGrabarMetodoPago(?,?,?)}");
            cs.setInt(1, m.getIdMetodo());
            cs.setString(2, m.getTipoPago());
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(3);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // ELIMINAR
    public String eliminar(int id){
        String rpta = "";
        try{
            CallableStatement cs = cn.prepareCall("{call SpEliminarMetodoPago(?,?)}");
            cs.setInt(1, id);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(2);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // MODIFICAR
    public String modificar(MetodoPago m){
        String rpta = "";
        try{
            CallableStatement cs = cn.prepareCall("{call SpModificarMetodoPago(?,?,?)}");
            cs.setInt(1, m.getIdMetodo());
            cs.setString(2, m.getTipoPago());
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(3);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // LISTAR
    public ArrayList<MetodoPago> listar(){
        ArrayList<MetodoPago> lista = new ArrayList<>();
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM METODO_PAGO");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                MetodoPago m = new MetodoPago(
                    rs.getInt(1),
                    rs.getString(2)
                );
                lista.add(m);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}

