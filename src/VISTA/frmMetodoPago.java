package VISTA;
import CONTROLADOR.MetodoPagoControlador;
import MODELO.MetodoPago;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmMetodoPago extends javax.swing.JFrame {

    MetodoPagoControlador control = new MetodoPagoControlador();
   
    public frmMetodoPago() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtid = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnnuevo = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID METODO:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("TIPO DE PAGO:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("MANTENIMIENTO METODO DE PAGO");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID METODO", "TIPO DE PAGO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnnuevo.setBackground(new java.awt.Color(204, 204, 204));
        btnnuevo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnmodificar.setBackground(new java.awt.Color(51, 51, 255));
        btnmodificar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(255, 51, 51));
        btnsalir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(51, 153, 0));
        btnguardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnnuevo)
                                .addGap(142, 142, 142)
                                .addComponent(btnmodificar)
                                .addGap(28, 28, 28)
                                .addComponent(btnsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnguardar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txttipo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnguardar)
                        .addComponent(btnsalir)
                        .addComponent(btnmodificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        txtid.setText("");
        txttipo.setText("");
        txtid.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(txtid.getText());
            String tipo = txttipo.getText();

            MetodoPago m = new MetodoPago(id, tipo);
            String rpta = control.modificar(m);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(txtid.getText());
            String rpta = control.eliminar(id);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(txtid.getText());
            String tipo = txttipo.getText();

            MetodoPago m = new MetodoPago(id, tipo);
            String rpta = control.agregar(m);
            JOptionPane.showMessageDialog(null, rpta);
            cargarTabla();

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El ID debe ser número");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new frmMetodoPago().setVisible(true));
    }
    
    public void cargarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID METODO");
        modelo.addColumn("TIPO DE PAGO");

        for(MetodoPago m : control.listar()){
            modelo.addRow(new Object[]{
                m.getIdMetodo(),
                m.getTipoPago()
            });
        }

        tabla.setModel(modelo);
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables

}
