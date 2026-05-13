package VISTA;
import CONTROLADOR.SucursalControlador;
import MODELO.Sucursal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmSucursal extends javax.swing.JFrame {
    
    SucursalControlador control = new SucursalControlador();
    
    public frmSucursal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO SUCURSAL");

        jLabel2.setText("ID SUCURSAL:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("DIRECCION:");

        jLabel5.setText("CIUDAD:");

        btnnuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(this::btnnuevoActionPerformed);

        btnguardar.setBackground(new java.awt.Color(51, 204, 0));
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(this::btnguardarActionPerformed);

        btnmodificar.setBackground(new java.awt.Color(0, 51, 255));
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(this::btnmodificarActionPerformed);

        btneliminar.setBackground(new java.awt.Color(255, 0, 0));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(this::btneliminarActionPerformed);

        txtid.addActionListener(this::txtidActionPerformed);

        txtnombre.addActionListener(this::txtnombreActionPerformed);

        txtdireccion.addActionListener(this::txtdireccionActionPerformed);

        txtciudad.addActionListener(this::txtciudadActionPerformed);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID SUCURSAL", "NOMBRE", "DIRECCION", "CIUDAD"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnguardar)
                .addGap(62, 62, 62)
                .addComponent(btnmodificar)
                .addGap(48, 48, 48)
                .addComponent(btneliminar)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtciudad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnguardar)
                            .addComponent(btnmodificar)
                            .addComponent(btneliminar)))
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtciudadActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        txtid.setText("");
        txtnombre.setText("");
        txtdireccion.setText("");
        txtciudad.setText("");
        txtid.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try{
            int id = Integer.parseInt(txtid.getText());
            String nombre = txtnombre.getText();
            String direccion = txtdireccion.getText();
            String ciudad = txtciudad.getText();

            Sucursal s = new Sucursal(id, nombre, direccion, ciudad);
            String rpta = control.agregar(s);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try{
            int id = Integer.parseInt(txtid.getText());
            String nombre = txtnombre.getText();
            String direccion = txtdireccion.getText();
            String ciudad = txtciudad.getText();

            Sucursal s = new Sucursal(id, nombre, direccion, ciudad);
            String rpta = control.modificar(s);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try{
            int id = Integer.parseInt(txtid.getText());
            String rpta = control.eliminar(id);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(() -> new frmSucursal().setVisible(true));
    }
    
    public void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("CIUDAD");

        for(Sucursal s : control.listar()){
            modelo.addRow(new Object[]{
                s.getIdSucursal(),
                s.getNombre(),
                s.getDireccion(),
                s.getCiudad()
            });
        }

        tabla.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
