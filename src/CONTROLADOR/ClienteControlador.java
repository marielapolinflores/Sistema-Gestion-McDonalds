package CONTROLADOR;
import DATOS.OracleHelper;
import MODELO.Cliente;
import java.sql.*;
import java.util.ArrayList;

public class ClienteControlador {

    OracleHelper con = new OracleHelper();
    Connection cn = con.conectar();

    public ClienteControlador() {
    }

    // INSERTAR
    public String agregar(Cliente c){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpGrabarCliente(?,?,?)}");
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
            CallableStatement cs = cn.prepareCall("{call SpEliminarCliente(?,?)}");
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
    public String modificar(Cliente c){
        String rpta="";
        try{
            CallableStatement cs = cn.prepareCall("{call SpModificarCliente(?,?,?)}");
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
    public ArrayList<Cliente> listar(){
        ArrayList<Cliente> lista = new ArrayList<>();
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM CLIENTE");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Cliente c = new Cliente(
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

