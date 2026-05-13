package CONTROLADOR;
import DATOS.OracleHelper;
import MODELO.Categoria;
import java.sql.*;
import java.util.ArrayList;
public class CategoriaControlador {
 OracleHelper con = new OracleHelper();
    Connection cn = con.conectar();

    // INSERTAR
    public String agregar(Categoria c){
    String rpta="";
    try{
        CallableStatement cs = cn.prepareCall("{call SpGrabarCategoria(?,?,?)}");
        cs.setInt(1, c.getId());
        cs.setString(2, c.getNombre());
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
    String rpta="";
    try{
        CallableStatement cs = cn.prepareCall("{call SpEliminarCategoria(?,?)}");
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
   public String modificar(Categoria c){
    String rpta="";
    try{
        CallableStatement cs = cn.prepareCall("{call SpModificarCategoria(?,?,?)}");
        cs.setInt(1, c.getId());
        cs.setString(2, c.getNombre());
        cs.registerOutParameter(3, Types.VARCHAR);
        cs.execute();
        rpta = cs.getString(3);
    }catch(Exception e){
        rpta = e.getMessage();
    }
    return rpta;
}
    // LISTAR
    public ArrayList<Categoria> listar(){
        ArrayList<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM CATEGORIA");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Categoria c = new Categoria(
                    rs.getInt(1),
                    rs.getString(2)
                );
                lista.add(c);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
