package MODELO;
public class Cliente {
    private int id;
    private String nombre;

    public Cliente(int id) {
        this.id = id;
    }
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
