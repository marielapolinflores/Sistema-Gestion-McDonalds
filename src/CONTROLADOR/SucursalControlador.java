package CONTROLADOR;
import DATOS.OracleHelper;
import MODELO.Sucursal;
import java.sql.*;
import java.util.ArrayList;

public class SucursalControlador {

    OracleHelper con = new OracleHelper();
    Connection cn = con.conectar();

    // INSERTAR
    public String agregar(Sucursal s){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpGrabarSucursal(?,?,?,?,?)}");
            cs.setInt(1, s.getIdSucursal());
            cs.setString(2, s.getNombre());
            cs.setString(3, s.getDireccion());
            cs.setString(4, s.getCiudad());
            cs.registerOutParameter(5, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(5);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // ELIMINAR
    public String eliminar(int id){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpEliminarSucursal(?,?)}");
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
    public String modificar(Sucursal s){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpModificarSucursal(?,?,?,?,?)}");
            cs.setInt(1, s.getIdSucursal());
            cs.setString(2, s.getNombre());
            cs.setString(3, s.getDireccion());
            cs.setString(4, s.getCiudad());
            cs.registerOutParameter(5, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(5);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // LISTAR
    public ArrayList<Sucursal> listar(){
        ArrayList<Sucursal> lista = new ArrayList<>();
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM SUCURSAL");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Sucursal s = new Sucursal(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                );
                lista.add(s);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
  