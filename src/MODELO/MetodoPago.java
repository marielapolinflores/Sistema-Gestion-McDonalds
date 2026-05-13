package MODELO;

public class MetodoPago {
    private int idMetodo;
    private String tipoPago;

    public MetodoPago(int idMetodo) {
        this.idMetodo = idMetodo;
    }
    
     public MetodoPago(String tipoPago) {
         this.tipoPago = tipoPago;
     }

    public MetodoPago(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getIdMetodo(){
        return idMetodo; 
    }
    
    public String getTipoPago(){ 
        return tipoPago; 
    }

    public void setIdMetodo(int idMetodo){ 
        this.idMetodo = idMetodo; 
    }
    
    public void setTipoPago(String tipoPago){ 
        this.tipoPago = tipoPago; 
    }
}

