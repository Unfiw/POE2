package com.mycompany.practica7;

public class Menu extends javax.swing.JFrame {

    public static Ingreso ingreso;
    //public static Pila pila = new Pila();
    public static Pila pilaAlumno = new Pila();
     public static Pila pilaLibro = new Pila();
    public static Pila pilaPrestamo = new Pila();
    
    public Menu(Ingreso ingreso) {
        //txtMostrar.setText("");
        initComponents();
        this.setLocationRelativeTo(null);
        Menu.ingreso = ingreso;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        itemAlumnoRegistrar = new javax.swing.JMenuItem();
        itemAlumnoMostrar = new javax.swing.JMenuItem();
        menuLibro = new javax.swing.JMenu();
        itemLibroRegistrar = new javax.swing.JMenuItem();
        itemLibroMostrar = new javax.swing.JMenuItem();
        menuPrestamo = new javax.swing.JMenu();
        itemPrestamoRegistrar = new javax.swing.JMenuItem();
        itemPrestamoMostrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 220));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        menuAlumno.setText("Alumno");
        menuAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlumnoMouseClicked(evt);
            }
        });

        itemAlumnoRegistrar.setText("Registrar");
        itemAlumnoRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemAlumnoRegistrarMouseClicked(evt);
            }
        });
        itemAlumnoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlumnoRegistrarActionPerformed(evt);
            }
        });
        menuAlumno.add(itemAlumnoRegistrar);

        itemAlumnoMostrar.setText("Mostrar");
        itemAlumnoMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemAlumnoMostrarMouseClicked(evt);
            }
        });
        itemAlumnoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlumnoMostrarActionPerformed(evt);
            }
        });
        menuAlumno.add(itemAlumnoMostrar);

        jMenuBar1.add(menuAlumno);

        menuLibro.setText("Libro");

        itemLibroRegistrar.setText("Registrar");
        itemLibroRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLibroRegistrarActionPerformed(evt);
            }
        });
        menuLibro.add(itemLibroRegistrar);

        itemLibroMostrar.setText("Mostrar");
        itemLibroMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLibroMostrarActionPerformed(evt);
            }
        });
        menuLibro.add(itemLibroMostrar);

        jMenuBar1.add(menuLibro);

        menuPrestamo.setText("Prestamo");

        itemPrestamoRegistrar.setText("Registrar");
        itemPrestamoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrestamoRegistrarActionPerformed(evt);
            }
        });
        menuPrestamo.add(itemPrestamoRegistrar);

        itemPrestamoMostrar.setText("Mostrar");
        itemPrestamoMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrestamoMostrarActionPerformed(evt);
            }
        });
        menuPrestamo.add(itemPrestamoMostrar);

        jMenuBar1.add(menuPrestamo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAlumnoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlumnoRegistrarActionPerformed
       
       alumnoRegistrar alumnoReg = new alumnoRegistrar(pilaAlumno, this);
       //pila = pilaAlumno;
       alumnoReg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_itemAlumnoRegistrarActionPerformed

    private void menuAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlumnoMouseClicked
        
    }//GEN-LAST:event_menuAlumnoMouseClicked

    private void itemAlumnoMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAlumnoMostrarMouseClicked
        
    }//GEN-LAST:event_itemAlumnoMostrarMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ingreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void itemAlumnoRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAlumnoRegistrarMouseClicked
    }//GEN-LAST:event_itemAlumnoRegistrarMouseClicked

    private void itemAlumnoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlumnoMostrarActionPerformed
        
        Nodo aux = pilaAlumno.pila;
        txtMostrar.setText("");
        
         if (pilaAlumno.pila == null) {
             //txtMostrar.append("");
             txtMostrar.append("La pila esta vacia");
        }else{
             while(aux != null){
                 txtMostrar.append("Nombre: "+aux.getValor1() + "\n " + "Apellido: "+aux.getValor2() + "\n " + "Semestre: "+aux.getValor3() + "\n " + "Id: "+aux.getValor4()+ "\n ");
                 aux = aux.getSiguiente();
             }
         }
    }//GEN-LAST:event_itemAlumnoMostrarActionPerformed

    private void itemLibroMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLibroMostrarActionPerformed
        
        Nodo aux = pilaLibro.pila;
        txtMostrar.setText("");
        
         if (pilaLibro.pila == null) {
             //txtMostrar.append("");
             txtMostrar.append("La pila esta vacia");
        }else{
             while(aux != null){
                 txtMostrar.append("Nombre: "+aux.getValor1() +"\n " + "Autor: "+aux.getValor2() + "\n " + "Editorial: "+aux.getValor3() + "\n " + "Numero de paginas: "+aux.getValor4() +"\n " );
                 aux = aux.getSiguiente();
             }
         }
    }//GEN-LAST:event_itemLibroMostrarActionPerformed

    private void itemPrestamoMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrestamoMostrarActionPerformed
        
        Nodo aux = pilaPrestamo.pila;
        txtMostrar.setText("");
        
         if (pilaPrestamo.pila == null) {
             //txtMostrar.append("");
             txtMostrar.append("La pila esta vacia");
        }else{
             while(aux != null){
                 txtMostrar.append("Banco: "+aux.getValor1() +  "\n " + "Tipo de prestamo: "+aux.getValor2() + "\n " + "Intereses: "+aux.getValor3() + "\n " + "Cantidad: "+aux.getValor4() + "\n ");
                 aux = aux.getSiguiente();
             }
         }
    }//GEN-LAST:event_itemPrestamoMostrarActionPerformed

    private void itemLibroRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLibroRegistrarActionPerformed
        
        libroRegistrar libroReg = new libroRegistrar(pilaLibro, this);
        //pila = pilaLibro;
       libroReg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_itemLibroRegistrarActionPerformed

    private void itemPrestamoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrestamoRegistrarActionPerformed
       
        prestamoRegistrar prestamoReg = new prestamoRegistrar(pilaPrestamo, this);
        //pila = pilaPrestamo;
       prestamoReg.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_itemPrestamoRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtMostrar.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
                new Menu(ingreso).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenuItem itemAlumnoMostrar;
    private javax.swing.JMenuItem itemAlumnoRegistrar;
    private javax.swing.JMenuItem itemLibroMostrar;
    private javax.swing.JMenuItem itemLibroRegistrar;
    private javax.swing.JMenuItem itemPrestamoMostrar;
    private javax.swing.JMenuItem itemPrestamoRegistrar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuLibro;
    private javax.swing.JMenu menuPrestamo;
    public static javax.swing.JTextArea txtMostrar;
    // End of variables declaration//GEN-END:variables
}
