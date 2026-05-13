package VISTA;
import CONTROLADOR.ClienteControlador;
import MODELO.Cliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCliente extends javax.swing.JFrame {
    
    ClienteControlador control = new ClienteControlador();

    public frmCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO CLIENTE");

        jLabel2.setText("ID:");

        jLabel3.setText("NOMBRE:");

        btnnuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(this::btnnuevoActionPerformed);

        btnguardar.setBackground(new java.awt.Color(0, 153, 51));
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(this::btnguardarActionPerformed);

        btnmodificar.setBackground(new java.awt.Color(0, 51, 204));
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(this::btnmodificarActionPerformed);

        btneliminar.setBackground(new java.awt.Color(255, 51, 0));
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(this::btneliminarActionPerformed);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        txtid.addActionListener(this::txtidActionPerformed);

        txtnombre.addActionListener(this::txtnombreActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(149, 149, 149))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnnuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnguardar)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmodificar)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
    try{
            int id = Integer.parseInt(txtid.getText());
            String nombre = txtnombre.getText();

            Cliente c = new Cliente(id, nombre);
            String rpta = control.modificar(c);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        txtid.setText("");
        txtnombre.setText("");
        txtid.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        try{
            int id = Integer.parseInt(txtid.getText());
            String nombre = txtnombre.getText();

            Cliente c = new Cliente(id, nombre);
            String rpta = control.agregar(c);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new frmCliente().setVisible(true));
    }
    
    public void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");

        for(Cliente c : control.listar()){
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre()
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

}