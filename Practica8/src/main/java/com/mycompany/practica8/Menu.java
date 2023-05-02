package com.mycompany.practica8;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    public static  int valorPila;
    public static int valorCola;
    public static Pila pila = new Pila();
    public static Cola cola = new Cola();

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        menuPila = new javax.swing.JMenu();
        miAgregarPila = new javax.swing.JMenuItem();
        miImprimirPila = new javax.swing.JMenuItem();
        miEliminarPila = new javax.swing.JMenuItem();
        menuCola = new javax.swing.JMenu();
        miAgregarCola = new javax.swing.JMenuItem();
        miImprmirCola = new javax.swing.JMenuItem();
        miEliminarCola = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 280));

        menuPila.setText("Pila");

        miAgregarPila.setText("Agregar");
        miAgregarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarPilaActionPerformed(evt);
            }
        });
        menuPila.add(miAgregarPila);

        miImprimirPila.setText("Imprimir");
        miImprimirPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miImprimirPilaActionPerformed(evt);
            }
        });
        menuPila.add(miImprimirPila);

        miEliminarPila.setText("Eliminar");
        miEliminarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarPilaActionPerformed(evt);
            }
        });
        menuPila.add(miEliminarPila);

        menu.add(menuPila);

        menuCola.setText("Cola");

        miAgregarCola.setText("Agregar");
        miAgregarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgregarColaActionPerformed(evt);
            }
        });
        menuCola.add(miAgregarCola);

        miImprmirCola.setText("Imprimir");
        miImprmirCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miImprmirColaActionPerformed(evt);
            }
        });
        menuCola.add(miImprmirCola);

        miEliminarCola.setText("Eliminar");
        miEliminarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarColaActionPerformed(evt);
            }
        });
        menuCola.add(miEliminarCola);

        menu.add(menuCola);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAgregarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarPilaActionPerformed
        
        valorPila =  Integer.parseInt(JOptionPane.showInputDialog("Inserta un valor"));
        pila.push(valorPila);
        
    }//GEN-LAST:event_miAgregarPilaActionPerformed

    private void miImprimirPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miImprimirPilaActionPerformed
        Nodo aux = pila.pila;
        txtMostrar.setText("");
        
         if (pila.pila == null) {
             //txtMostrar.append("");
             JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }else{
             while(aux != null){
                 JOptionPane.showMessageDialog(null,"Valor: "+aux.getValor() );
                 txtMostrar.append("Valor: "+aux.getValor() + "\n " );
                 aux = aux.getSiguiente();
             }
         }
    }//GEN-LAST:event_miImprimirPilaActionPerformed

    private void miEliminarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarPilaActionPerformed
        pila.pop();
    }//GEN-LAST:event_miEliminarPilaActionPerformed

    private void miAgregarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgregarColaActionPerformed
        valorCola = Integer.parseInt(JOptionPane.showInputDialog("Inserta un valor"));
        cola.encolar(valorCola);
    }//GEN-LAST:event_miAgregarColaActionPerformed

    private void miImprmirColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miImprmirColaActionPerformed
        Nodo aux = cola.cola;
        txtMostrar.setText("");
        
         if (cola.cola == null) {
             //txtMostrar.append("");
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }else{
             while(aux != null){
                 JOptionPane.showMessageDialog(null,"Valor: "+aux.getValor()  );
                 txtMostrar.append("Valor: "+aux.getValor() + "\n " );
                 aux = aux.getSiguiente();
             }
         }
    }//GEN-LAST:event_miImprmirColaActionPerformed

    private void miEliminarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarColaActionPerformed
        cola.desencolar();
    }//GEN-LAST:event_miEliminarColaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuCola;
    private javax.swing.JMenu menuPila;
    private javax.swing.JMenuItem miAgregarCola;
    private javax.swing.JMenuItem miAgregarPila;
    private javax.swing.JMenuItem miEliminarCola;
    private javax.swing.JMenuItem miEliminarPila;
    private javax.swing.JMenuItem miImprimirPila;
    private javax.swing.JMenuItem miImprmirCola;
    private javax.swing.JTextArea txtMostrar;
    // End of variables declaration//GEN-END:variables
}
