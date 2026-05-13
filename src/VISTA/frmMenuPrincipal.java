package VISTA;

import REPORTES.ReporteClientes;
import REPORTES.ReporteEmpleados;
import REPORTES.ReporteFactura;
import REPORTES.ReporteProductosmasVencidos;
import REPORTES.ReporteStockdeProductos;
import REPORTES.ReportesCategoria;
import REPORTES.ReportesProducto;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import REPORTES.ReporteVentas;
import java.awt.HeadlessException;
import java.io.IOException;

public class frmMenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName());
public frmMenuPrincipal() {
    initComponents(); } 

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnFactura = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientesFrecu = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnCategoriaaa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnPago = new javax.swing.JButton();
        btnSucursal = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 102, 0));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario: ADMIN | Rol: ADMINISTRADOR | Estado: CONECTADO (ORACLE)");

        jButton18.setBackground(new java.awt.Color(102, 102, 102));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("SALIR");
        jButton18.addActionListener(this::jButton18ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 461, Short.MAX_VALUE)
                .addComponent(jButton18)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton18))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 970, 60));

        btnProducto.setBackground(new java.awt.Color(204, 204, 204));
        btnProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PPAS-removebg-preview.png"))); // NOI18N
        btnProducto.setText("PRODUCTOS");
        btnProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnProducto.addActionListener(this::btnProductoActionPerformed);
        getContentPane().add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 300, 110));

        btnCategorias.setBackground(new java.awt.Color(204, 204, 204));
        btnCategorias.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/CATEGORIA (1).png"))); // NOI18N
        btnCategorias.setText("CATEGORIA  ");
        btnCategorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCategorias.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCategorias.addActionListener(this::btnCategoriasActionPerformed);
        getContentPane().add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 300, 110));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("   REPORTES");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnFactura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setText("FACTURA");
        btnFactura.setContentAreaFilled(false);
        btnFactura.addActionListener(this::btnFacturaActionPerformed);

        btnVentas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("PEDIDO");
        btnVentas.setContentAreaFilled(false);
        btnVentas.addActionListener(this::btnVentasActionPerformed);

        btnClientesFrecu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClientesFrecu.setForeground(new java.awt.Color(255, 255, 255));
        btnClientesFrecu.setText("CLIENTES ");
        btnClientesFrecu.setContentAreaFilled(false);
        btnClientesFrecu.addActionListener(this::btnClientesFrecuActionPerformed);

        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText(" EMPLEADOS");
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.addActionListener(this::btnEmpleadosActionPerformed);

        btnStock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStock.setForeground(new java.awt.Color(255, 255, 255));
        btnStock.setText("PROMOCION");
        btnStock.setContentAreaFilled(false);
        btnStock.addActionListener(this::btnStockActionPerformed);

        btnProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("PRODUCTOS");
        btnProductos.setContentAreaFilled(false);
        btnProductos.addActionListener(this::btnProductosActionPerformed);

        btnCategoriaaa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCategoriaaa.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoriaaa.setText("CATEGORIA");
        btnCategoriaaa.setContentAreaFilled(false);
        btnCategoriaaa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaaa.addActionListener(this::btnCategoriaaaActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(btnClientesFrecu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCategoriaaa)
                            .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 2, Short.MAX_VALUE)))
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnClientesFrecu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoriaaa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 580));

        jPanel5.setBackground(new java.awt.Color(204, 102, 0));

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton15.setText("TECNICO");
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(this::jButton15ActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("USUARIO");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("ADMINISTRADOR");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANUALES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addGap(92, 92, 92)
                .addComponent(jButton2)
                .addGap(63, 63, 63))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jLabel4))
                    .addComponent(filler1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 970, 40));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SISTEMA DE GESTION EMPRESARIAL-McDonald's");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));

        jPanel7.setBackground(new java.awt.Color(255, 204, 51));
        jPanel7.setForeground(new java.awt.Color(255, 153, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("BIENVENIDOS AL PANEL DE CONTROL");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -40, -1, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 770, 60));

        btnCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cliente.png"))); // NOI18N
        btnCliente.setText("CLIENTE   ");
        btnCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCliente.addActionListener(this::btnClienteActionPerformed);
        getContentPane().add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 300, 110));

        btnPago.setBackground(new java.awt.Color(204, 204, 204));
        btnPago.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/FICHA-removebg-preview (1).png"))); // NOI18N
        btnPago.setText("METODO DE PAGO");
        btnPago.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPago.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnPago.addActionListener(this::btnPagoActionPerformed);
        getContentPane().add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 300, 110));

        btnSucursal.setBackground(new java.awt.Color(204, 204, 204));
        btnSucursal.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/sucursal.png"))); // NOI18N
        btnSucursal.setText("SUCURSALES  ");
        btnSucursal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSucursal.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnSucursal.addActionListener(this::btnSucursalActionPerformed);
        getContentPane().add(btnSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 300, 110));

        btnProveedores.setBackground(new java.awt.Color(204, 204, 204));
        btnProveedores.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/proveedores.png"))); // NOI18N
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnProveedores.addActionListener(this::btnProveedoresActionPerformed);
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 300, 110));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/McDonald's. 6.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 770, 470));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 50));

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
ReporteEmpleados rep = new ReporteEmpleados();
rep.ReporteEmpleados();                          // Cierra el menú actual (opcional)        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
System.exit(0);      
    }//GEN-LAST:event_jButton18ActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
    new ReporteFactura().GenerarFactura(1);
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
try {
    // 1. Llamamos a la clase del reporte que ya creaste
    ReporteVentas objetoReporte = new ReporteVentas();
    
    // 2. Ejecutamos el método para generar el PDF
   objetoReporte.VentasPorFecha();
    
    JOptionPane.showMessageDialog(null, "Generando Reporte... revise su carpeta del proyecto");
} catch (HeadlessException e) {
    JOptionPane.showMessageDialog(null, "Error al invocar el reporte: " + e.getMessage());
}                           // Cierra el menú actual (opcional)        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnClientesFrecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesFrecuActionPerformed
new ReporteClientes().ReporteClientes();
    }//GEN-LAST:event_btnClientesFrecuActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
ReporteStockdeProductos rep = new ReporteStockdeProductos();
rep.StockProductos();// Cierra el menú actual (opcional)        // TODO add your handling code here:
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
ReportesProducto rep = new ReportesProducto();
rep.GenerarReporte();// Cierra el menú actual (opcional)        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnCategoriaaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaaaActionPerformed
ReportesCategoria rep = new ReportesCategoria();
rep.GenerarReporte();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCategoriaaaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
VISTA.frmProducto mntcaProducto = new VISTA.frmProducto();
    
    
    mntcaProducto.setVisible(true);     
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
    VISTA.frmCliente mntcaCliente = new VISTA.frmCliente();
    
    
    mntcaCliente.setVisible(true); 
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
VISTA.frmProveedor mntcaProveedor = new VISTA.frmProveedor();
    
    
    mntcaProveedor.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalActionPerformed
VISTA.frmSucursal mntcaSucursal = new VISTA.frmSucursal();
    
    
    mntcaSucursal.setVisible(true)
            ;// TODO add your handling code here:
    }//GEN-LAST:event_btnSucursalActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_btnPagoActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
      VISTA.frmCategoria mntcaCategoria = new VISTA.frmCategoria();
    
    
    mntcaCategoria.setVisible(true); 
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            java.io.File path = new java.io.File("src/MANUALES/MANUAL DE ADMINISTRADOR.pdf");
            java.awt.Desktop.getDesktop().open(path);
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "No se encontró el manual de administrador.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            java.io.File path = new java.io.File("src/MANUALES/MANUAL DE USUARIOS.pdf");
            java.awt.Desktop.getDesktop().open(path);
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "No se encontró el manual de usuario.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            // Abre el archivo PDF directamente desde tu escritorio
            java.io.File path = new java.io.File("C:\\Users\\MARIELA\\Desktop\\MANUAL TÉCNICO.pdf");
            java.awt.Desktop.getDesktop().open(path);
        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "No se encontró el manual en el escritorio. Verifica el nombre.");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new frmMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategoriaaa;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnClientesFrecu;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnSucursal;
    private javax.swing.JButton btnVentas;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables


   
    }
