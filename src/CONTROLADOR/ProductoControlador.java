package CONTROLADOR;

import DATOS.OracleHelper;
import MODELO.Producto;
import java.sql.*;
import java.util.ArrayList;

public class ProductoControlador {
    OracleHelper con = new OracleHelper();
    Connection cn = con.conectar();

    // INSERTAR
    public String agregar(Producto p){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpGrabarProducto(?,?,?,?)}");
            cs.setInt(1, p.getId());
            cs.setString(2, p.getNombre());
            cs.setDouble(3, p.getPrecio());
            cs.registerOutParameter(4, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(4);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // ELIMINAR
    public String eliminar(int id){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpEliminarProducto(?,?)}");
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
    public String modificar(Producto p){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpModificarProducto(?,?,?,?)}");
            cs.setInt(1, p.getId());
            cs.setString(2, p.getNombre());
            cs.setDouble(3, p.getPrecio());
            cs.registerOutParameter(4, Types.VARCHAR);
            cs.execute();
            rpta = cs.getString(4);
        }catch(Exception e){
            rpta = e.getMessage();
        }
        return rpta;
    }

    // LISTAR
    public ArrayList<Producto> listar(){
        ArrayList<Producto> lista = new ArrayList<>();
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM PRODUCTO");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Producto p = new Producto(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3)
                );
                lista.add(p);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}