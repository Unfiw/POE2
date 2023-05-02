package com.mycompany.practica7;

import java.awt.event.KeyEvent;

public class prestamoRegistrar extends javax.swing.JFrame {
    
    public static  String banco;
    public static  String tipoPrestamo;
    public static  String intereses;
    public static  int cantidad;

    public static Menu menu;
    public static Pila pila;
    
    public prestamoRegistrar(Pila pila, Menu menu) {
        initComponents();
        this.setLocationRelativeTo(null);
        prestamoRegistrar.pila = pila;
        prestamoRegistrar.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelTipoPrestamo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreBanco = new javax.swing.JTextField();
        txtTipoPrestamo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtIntereses = new javax.swing.JTextField();
        labelRegistrar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        labelMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre banco");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        labelTipoPrestamo.setText("Tipo de prestamo");
        jPanel1.add(labelTipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel4.setText("Intereses");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtNombreBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreBancoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, -1));

        txtTipoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoPrestamoActionPerformed(evt);
            }
        });
        txtTipoPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoPrestamoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 150, -1));

        txtIntereses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresesKeyTyped(evt);
            }
        });
        jPanel1.add(txtIntereses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, -1));

        labelRegistrar.setText("Registro");
        jPanel1.add(labelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));
        jPanel1.add(labelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoPrestamoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menu.setVisible(true);
        Menu.txtMostrar.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        banco = txtNombreBanco.getText();
        tipoPrestamo = txtTipoPrestamo.getText();
        intereses = txtIntereses.getText();
        cantidad = Integer.parseInt(txtCantidad.getText());
        
        pila.push(banco, tipoPrestamo, intereses, cantidad);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        pila.pop();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
 
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
       int tam = 4;
        char caracter = evt.getKeyChar();
        labelMensaje.setText(" ");
        
        if(caracter == KeyEvent.VK_ENTER){
            btnAgregar.requestFocus();
        }
            if(!Character.isDigit(caracter)){
                getToolkit().beep();
                evt.consume();
                labelMensaje.setText("Solo numeros");
                labelMensaje.setVisible(true);
            }
            if(txtCantidad.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
                getToolkit().beep();
                evt.consume();
                labelMensaje.setText("Maximo 4 digitos");
                labelMensaje.setVisible(true);
            }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtNombreBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBancoKeyTyped
         int tam = 10;
        char caracter = evt.getKeyChar();
        labelMensaje.setText(" ");
        
        if(caracter == KeyEvent.VK_ENTER){
            btnAgregar.requestFocus();
        }
        if(!Character.isLetter(caracter)){
            getToolkit().beep();
            evt.consume();
            labelMensaje.setText("Solo letras");
            labelMensaje.setVisible(true);
        }
        if(txtNombreBanco.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
            getToolkit().beep();
            evt.consume();
            labelMensaje.setText("Maximo 10 digitos");
            labelMensaje.setVisible(true);
        }
    }//GEN-LAST:event_txtNombreBancoKeyTyped

    private void txtTipoPrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoPrestamoKeyTyped
         int tam = 10;
        char caracter = evt.getKeyChar();
        labelMensaje.setText(" ");
        
        if(caracter == KeyEvent.VK_ENTER){
            btnAgregar.requestFocus();
        }
        if(!Character.isLetter(caracter)){
            getToolkit().beep();
            evt.consume();
            labelMensaje.setText("Solo letras");
            labelMensaje.setVisible(true);
        }
        if(txtTipoPrestamo.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
            getToolkit().beep();
            evt.consume();
            labelMensaje.setText("Maximo 10 digitos");
            labelMensaje.setVisible(true);
        }
    }//GEN-LAST:event_txtTipoPrestamoKeyTyped

    private void txtInteresesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresesKeyTyped
         int tam = 10;
        char caracter = evt.getKeyChar();
        labelMensaje.setText(" ");
        
        if(caracter == KeyEvent.VK_ENTER){
            btnAgregar.requestFocus();
        }
        if(!Character.isLetter(caracter)){
            getToolkit().beep();
            evt.consume();
            labelMensaje.setText("Solo letras");
            labelMensaje.setVisible(true);
        }
        if(txtIntereses.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
            getToolkit().beep();
            evt.consume();
            labelMensaje.setText("Maximo 10 digitos");
            labelMensaje.setVisible(true);
        }
    }//GEN-LAST:event_txtInteresesKeyTyped

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
            java.util.logging.Logger.getLogger(prestamoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prestamoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prestamoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prestamoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prestamoRegistrar(pila, menu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelRegistrar;
    private javax.swing.JLabel labelTipoPrestamo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIntereses;
    private javax.swing.JTextField txtNombreBanco;
    private javax.swing.JTextField txtTipoPrestamo;
    // End of variables declaration//GEN-END:variables
}
