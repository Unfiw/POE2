package com.mycompany.practica7;

import java.awt.event.KeyEvent;

public class libroRegistrar extends javax.swing.JFrame {
    
    public static String nombre;
    public static String autor;
    public static String editorial;
    public static int cantidadPaginas;

    public static Menu menu;
    public static Pila pila;
    
    public libroRegistrar(Pila pila, Menu menu) {
        initComponents();
        this.setLocationRelativeTo(null);
        libroRegistrar.pila = pila;
        libroRegistrar.menu = menu;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        labelEditorial = new javax.swing.JLabel();
        labelNumeroPaginas = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtNumeroPaginas = new javax.swing.JTextField();
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

        labelAutor.setText("Autor");
        jPanel1.add(labelAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        labelEditorial.setText("Editorial");
        jPanel1.add(labelEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        labelNumeroPaginas.setText("Numero de paginas");
        jPanel1.add(labelNumeroPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 150, -1));

        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, -1));

        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialKeyTyped(evt);
            }
        });
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, -1));

        txtNumeroPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroPaginasKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 130, -1));

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
        jPanel1.add(labelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
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
        autor = txtAutor.getText();
        editorial = txtEditorial.getText();
        cantidadPaginas = Integer.parseInt(txtNumeroPaginas.getText());
        
        pila.push(nombre, autor, editorial, cantidadPaginas);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        pila.pop();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNumeroPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPaginasKeyTyped
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
            if(txtNumeroPaginas.getText().length() >= tam && caracter != KeyEvent.VK_ENTER){
                getToolkit().beep();
                evt.consume();
                labelMensaje.setText("Maximo 4 digitos");
                labelMensaje.setVisible(true);
            }
    }//GEN-LAST:event_txtNumeroPaginasKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int tam = 10;
        char caracter = evt.getKeyChar();
        labelMensaje.setText(" ");
        
        if(caracter == KeyEvent.VK_ENTER){
            btnEliminar.requestFocus();
        }else{
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
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
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
    }//GEN-LAST:event_txtAutorKeyTyped

    private void txtEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyTyped
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
    }//GEN-LAST:event_txtEditorialKeyTyped

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
            java.util.logging.Logger.getLogger(libroRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(libroRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(libroRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(libroRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new libroRegistrar(pila, menu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelEditorial;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNumeroPaginas;
    private javax.swing.JLabel labelRegistrar;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroPaginas;
    // End of variables declaration//GEN-END:variables
}
