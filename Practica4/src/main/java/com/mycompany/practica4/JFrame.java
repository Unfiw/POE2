/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author marco
 */
public class JFrame extends javax.swing.JFrame {

   public static Reciclaje reciclaje[] = new Reciclaje[20];
   public static String tipo;
   public static String nombre;
   public static double cantidad;
   public static double peso;
   public static int cont = 0;
   
    public JFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        labelElemento.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        labelElemento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        labelTitle.setText("RECICLAJE");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        labelTipo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        labelTipo.setText("Tipo");
        jPanel1.add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        labelNombre.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        labelNombre.setText("Nombre");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        labelPeso.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        labelPeso.setText("Peso");
        jPanel1.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        labelCantidad.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        labelCantidad.setText("Cantidad");
        jPanel1.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        txtTipo.setText("Ingrese el tipo de desecho");
        txtTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTipoMouseClicked(evt);
            }
        });
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 270, -1));

        txtNombre.setText("Ingrese el nombre de desecho");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 270, -1));

        txtCantidad.setText("Inserta la cantidad de desechos a depositar");
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadMouseClicked(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        txtPeso.setText("Inserta el peso del desecho en gramos");
        txtPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPesoMouseClicked(evt);
            }
        });
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        labelElemento.setText("El elemento no existe");
        jPanel1.add(labelElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
        txtTipo.setText("");
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i< reciclaje.length; i++){
            
            if(txtTipo.getText().equals(reciclaje[i].getTipo()) || txtNombre.getText().equals(reciclaje[i].getNombre())  || txtCantidad.getText().equals(Double.toString(reciclaje[i].getCantidad()))  || txtPeso.getText().equals(Double.toString(reciclaje[i].getPeso()))){
                txtTipo.setText(reciclaje[i].getTipo());
                txtNombre.setText(reciclaje[i].getNombre());
                txtCantidad.setText(Double.toString(reciclaje[i].getCantidad()));
                txtPeso.setText(Double.toString(reciclaje[i].getPeso()));
                labelElemento.setVisible(false);
            } 
            else if(i > reciclaje.le){
                labelElemento.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_txtPesoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        tipo = txtTipo.getText();
        nombre = txtNombre.getText();
        cantidad = Integer.parseInt(txtCantidad.getText());
        peso = Integer.parseInt(txtPeso.getText());
        
        reciclaje[cont] = new Reciclaje(tipo, nombre, cantidad, peso);
        cont++;
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtTipo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPeso.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoMouseClicked
        // TODO add your handling code here:
        txtTipo.setText("");
    }//GEN-LAST:event_txtTipoMouseClicked

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseClicked
        // TODO add your handling code here:
        txtCantidad.setText("");
    }//GEN-LAST:event_txtCantidadMouseClicked

    private void txtPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesoMouseClicked
        // TODO add your handling code here:
        txtPeso.setText("");
    }//GEN-LAST:event_txtPesoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < reciclaje.length; i++){
            if(txtTipo.getText().equals(reciclaje[i].getTipo()) || txtNombre.getText().equals(reciclaje[i].getNombre())  || txtCantidad.getText().equals(Double.toString(reciclaje[i].getCantidad()))  || txtPeso.getText().equals(Double.toString(reciclaje[i].getPeso()))){
                
                reciclaje[i] = reciclaje[i+1];
                reciclaje[cont] = null;
                labelElemento.setVisible(true);
                     } else{
               // labelElemento.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelElemento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
