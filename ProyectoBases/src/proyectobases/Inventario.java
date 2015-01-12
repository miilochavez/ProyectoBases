/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobases;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CltControl
 */
public class Inventario extends javax.swing.JFrame {

    public String productName = "";
    public String cantidad = "";
    public String precio = "";
    public String direccion = "";
    public String fecha = "";
    public String almacenamiento = "";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/proyecto";
    static final String USER = "root";
    static final String PASS = "admin1234";
    /**
     * Creates new form Anadir
     */
    public Inventario() {
        initComponents();
        initComponentsPersonalized();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnQuitar = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        lMessage1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        lMessage2 = new javax.swing.JLabel();
        BtnAgregar1 = new javax.swing.JButton();
        BtnModificar1 = new javax.swing.JButton();
        BtnQuitar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jLabel3.setText("jLabel3");

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnQuitar.setText("Quitar");
        BtnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitarActionPerformed(evt);
            }
        });

        lMessage.setForeground(new java.awt.Color(204, 0, 0));

        lMessage1.setForeground(new java.awt.Color(204, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad:");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del producto:");

        jLabel6.setText("Precio:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Añadir un producto");

        jLabel5.setText("Lugar de adquisicion:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha de compra:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Almacenamiento:");

        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField6FocusLost(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        lMessage2.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addComponent(jTextField3))
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnAgregar1.setText("Agregar");
        BtnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregar1ActionPerformed(evt);
            }
        });

        BtnModificar1.setText("Modificar");
        BtnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificar1ActionPerformed(evt);
            }
        });

        BtnQuitar1.setText("Quitar");
        BtnQuitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitar1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(BtnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(79, 79, 79)
                .addComponent(BtnQuitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnQuitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregar1))
                .addGap(65, 65, 65)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Lugar de adquisición", "Fecha de compra", "Otros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaInventario);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Inventario");

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsPersonalized(){
        jTextField1.setDocument(new JTextFieldLimit(15));  // Nombre del producto
        jTextField2.setDocument(new JTextFieldLimit(5));  // Cantidad
        jTextField3.setDocument(new JTextFieldLimit(7));  // Precio
        jTextField4.setDocument(new JTextFieldLimit(20));  // Lugar de adquisicion
        jTextField5.setDocument(new JTextFieldLimit(10));  // Fecha de compra
        jTextField6.setDocument(new JTextFieldLimit(20));  // Descripcion (Almacenamiento..)
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        productName = evt.getActionCommand();
        jTextField1.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateProductName(productName)){
           System.out.println( "Valid input.  Thank you." );
           jTextField1.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        cantidad = evt.getActionCommand();
        jTextField2.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateCantidad(cantidad)){
           jTextField2.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BtnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregar1ActionPerformed
        // TODO add your handling code here:
        String string = "";
        //String.c
        if (!ValidateInputEmpleado.validateProductName(productName)){
            //JOptionPane.showMessageDialog(null,  "Nombre fuera de los limites, maximo 20 caracteres.");
            string = string + "Nombre fuera de los limites, maximo 20 caracteres.\n";
        } if (!ValidateInputEmpleado.validateCantidad(cantidad)){ 
            //JOptionPane.showMessageDialog(null, "Cantidad fuera de los limites, maximo 3 digitos.");
            string = string + "Cantidad fuera de los limites, maximo 3 digitos.\n";
        } if (!ValidateInputEmpleado.validatePrecio(precio)){ 
            string = string + "Precio fuera de los limites, maximo 3 digitos enteros y 2 decimales.\n";
        } if (!ValidateInputEmpleado.validateAddress(direccion)){
            string = string + "Direccion fuera de los limites, maximo 40 caracteres.\n";
        } if (!ValidateInputEmpleado.validateFecha(fecha)){
            string = string + "Fecha incorrecta.\n";
        } if (!ValidateInputEmpleado.validateDescripcion(almacenamiento)){
            string = string + "Descripcion incorrecta.\n";
        } 
                
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "INSERT INTO Material" + 
                    "(`idproducto`, `nombre`, `cantidad`, `precio`, `fechacompra`, `descripcion`, `idproveedor`)" +
                    "VALUES (NULL, '" + jTextField1.getText() + "','" +
                    Integer.parseInt(jTextField2.getText()) + "','" +
                    Float.parseFloat(jTextField3.getText()) + "'," +
                    "NULL, NULL, NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Whahooooooooo!");
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }

        if (string.equals("")) {
            string = string + "Exito! Sus datos se han guardado";
        }
        
       
         if (string.equals("")){
            string = string + "Exito! Sus datos se han guardado";
        }
         if (string.equals("Exito! Sus datos se han guardado")){
            DefaultTableModel model = (DefaultTableModel) TablaInventario.getModel();
            model.addRow(new Object[]{jTextField1.getText(), Integer.parseInt(jTextField2.getText()), Float.parseFloat(jTextField3.getText()), 
                                      jTextField4.getText(), jTextField5.getText(), jTextField6.getText()});
        } 
      JOptionPane.showMessageDialog(null, string, "Inventario",JOptionPane.NO_OPTION);
    }//GEN-LAST:event_BtnAgregar1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        /*jTextField1.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateLastName(lastName)){
           System.out.println( "Valid input.  Thank you." );
           jTextField1.setForeground(java.awt.Color.BLACK);
        }*/
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        precio = evt.getActionCommand();
        jTextField3.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validatePrecio(precio)){
           jTextField3.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        direccion = evt.getActionCommand();
        jTextField4.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateAddress(direccion)){
           jTextField4.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        fecha = evt.getActionCommand();
        jTextField5.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateFecha(fecha)){
           jTextField5.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6FocusLost

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        almacenamiento = evt.getActionCommand();
        jTextField5.setForeground(java.awt.Color.RED);
        if (ValidateInputEmpleado.validateDescripcion(almacenamiento)){
           jTextField5.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
      
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitarActionPerformed
        // TODO add your handling code here:
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) TablaInventario.getModel();
        if (TablaInventario.getSelectedRow()==-1){
            if(TablaInventario.getRowCount()==0){
                lMessage.setText("Table is Empty");
            }else{
                lMessage.setText("You must select a product");
            }
        }else{
            model.removeRow(TablaInventario.getSelectedRow());
        }

    }//GEN-LAST:event_BtnQuitarActionPerformed

    private void BtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificar1ActionPerformed
        // TODO add your handling code here:
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) TablaInventario.getModel();
        if (TablaInventario.getSelectedRow()==-1){
            if(TablaInventario.getRowCount()==0){
                lMessage.setText("Table is Empty");
            }else{
                lMessage.setText("You must select a product");
            }
        }else{
            model.setValueAt(jTextField1.getText(), TablaInventario.getSelectedRow(), 0);
            model.setValueAt(Integer.parseInt(jTextField2.getText()), TablaInventario.getSelectedRow(), 1);
            model.setValueAt(Float.parseFloat(jTextField3.getText()), TablaInventario.getSelectedRow(), 2);
            model.setValueAt(jTextField4.getText(), TablaInventario.getSelectedRow(), 3);
            model.setValueAt(jTextField5.getText(), TablaInventario.getSelectedRow(), 4);
            model.setValueAt(jTextField6.getText(), TablaInventario.getSelectedRow(), 5);
        }

        /*if (!jTextFieldNombre.getText().trim().equals("")){
            model.addRow(new Object[]{jTextFieldNombre.getText(), jTextFieldCant.getText(), jTextFieldPrecio.getText()});
        } else {
            lMessage.setText("El nombre no puede quedar en blanco");
        }*/
    }//GEN-LAST:event_BtnModificar1ActionPerformed

    private void BtnQuitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitar1ActionPerformed
        // TODO add your handling code here:
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) TablaInventario.getModel();
        if (TablaInventario.getSelectedRow()==-1){
            if(TablaInventario.getRowCount()==0){
                lMessage.setText("Table is Empty");
            }else{
                lMessage.setText("You must select a product");
            }
        }else{
            model.removeRow(TablaInventario.getSelectedRow());
        }

    }//GEN-LAST:event_BtnQuitar1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAgregar1;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificar1;
    private javax.swing.JButton BtnQuitar;
    private javax.swing.JButton BtnQuitar1;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lMessage;
    private javax.swing.JLabel lMessage1;
    private javax.swing.JLabel lMessage2;
    // End of variables declaration//GEN-END:variables
}
