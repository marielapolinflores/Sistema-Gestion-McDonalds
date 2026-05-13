package CONTROLADOR;

import DATOS.OracleHelper;
import MODELO.Proveedor;
import java.sql.*;
import java.util.ArrayList;

public class ProveedorControlador {
    OracleHelper con = new OracleHelper();
    Connection cn = con.conectar();

    // INSERTAR
    public String agregar(Proveedor p){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpGrabarProveedor(?,?,?,?,?)}");
            cs.setInt(1, p.getId());
            cs.setString(2, p.getNombre());
            cs.setString(3, p.getTelefono());
            cs.setString(4, p.getDireccion());
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
            CallableStatement cs = cn.prepareCall("{call SpEliminarProveedor(?,?)}");
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
    public String modificar(Proveedor p){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpModificarProveedor(?,?,?,?,?)}");
            cs.setInt(1, p.getId());
            cs.setString(2, p.getNombre());
            cs.setString(3, p.getTelefono());
            cs.setString(4, p.getDireccion());
            cs.registerOutParameter(5, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(5);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // LISTAR
    public ArrayList<Proveedor> listar(){
        ArrayList<Proveedor> lista = new ArrayList<>();
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM PROVEEDOR");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Proveedor p = new Proveedor(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                );
                lista.add(p);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}