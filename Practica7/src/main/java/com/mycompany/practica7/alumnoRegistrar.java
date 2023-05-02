package com.mycompany.practica7;

import java.awt.event.KeyEvent;

public class alumnoRegistrar extends javax.swing.JFrame {

   public static Pila pila;
   public static Menu menu;
   public static String nombre;
   public static String apellido;
   public static String semestre;
   public static int id;
   
    public alumnoRegistrar(Pila pila, Menu menu) {
        initComponents();
        this.setLocationRelativeTo(null);
        alumnoRegistrar.menu = menu;
        alumnoRegistrar.pila = pila;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelSemestre = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        labelRegistrar = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        labelMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setText("Nombre");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        labelApellido.setText("Apellido");
        jPanel1.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        labelSemestre.setText("Semestre");
        jPanel1.add(labelSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        labelId.setText("Id");
        jPanel1.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 70, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, -1));

        txtSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemestreKeyTyped(evt);
            }
        });
        jPanel1.add(txtSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 130, -1));

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
        jPanel1.add(labelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menu.setVisible(true);
        Menu.txtMostrar.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        semestre = txtSemestre.getText();
        id = Integer.parseInt(txtId.getText());
        
        pila.push(nombre, apellido, semestre, id);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        pila.pop();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
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
            if(txtId.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
                getToolkit().beep();
                evt.consume();
                labelMensaje.setText("Maximo 4 digitos");
                labelMensaje.setVisible(true);
            }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
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
        if(txtNombre.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
            getToolkit().beep();
            evt.consume();
            labelMensaje.setText("Maximo 10 digitos");
            labelMensaje.setVisible(true);
        }
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
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
            if(txtNombre.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
                getToolkit().beep();
                evt.consume();
                labelMensaje.setText("Maximo 10 digitos");
                labelMensaje.setVisible(true);
            }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemestreKeyTyped
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
            if(txtNombre.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
                getToolkit().beep();
                evt.consume();
                labelMensaje.setText("Maximo 10 digitos");
                labelMensaje.setVisible(true);
            }
    }//GEN-LAST:event_txtSemestreKeyTyped

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
            java.util.logging.Logger.getLogger(alumnoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alumnoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alumnoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alumnoRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new alumnoRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRegistrar;
    private javax.swing.JLabel labelSemestre;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}
