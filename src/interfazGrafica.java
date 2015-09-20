
import java.awt.Component;
import java.util.LinkedList;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhon
 */
public class interfazGrafica extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGrafica
     */
    public interfazGrafica() {

        initComponents();
        setLocationRelativeTo(null);
        if (rbOpcion1.isSelected() == false && rbOpcion2.isSelected() == false) {
            rbOpcion1.setSelected(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        bgOpciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCajaDatos = new javax.swing.JTextField();
        btnIngresarDatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAMostrar = new javax.swing.JTextArea();
        lblVerCantidad = new javax.swing.JLabel();
        rbOpcion1 = new javax.swing.JRadioButton();
        rbOpcion2 = new javax.swing.JRadioButton();
        txtcajaDatos2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCajaFrecuencia = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mITablaDeFrecuenciaDeDatos = new javax.swing.JMenu();
        mIPromedio = new javax.swing.JMenuItem();
        mITablaDeLimitesRealesDeClase = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("METODOS ESTADISTICOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));
        jPanel1.add(txtCajaDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 640, 30));

        btnIngresarDatos.setText("INGRESAR DATOS");
        btnIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 190, 30));

        jLabel2.setText("NOTA: (Ingrese los datos separados por una coma \",\" y los numeros decimales usando el caracter  Punto \".\" Ej: 4.5  )");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 670, -1));

        jLabel3.setText("LISTA DE DATOS INGRESADOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        tAMostrar.setEditable(false);
        tAMostrar.setColumns(20);
        tAMostrar.setRows(5);
        jScrollPane1.setViewportView(tAMostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 530, 120));

        lblVerCantidad.setText("HAY 0 DATOS INGRESADOS ACTUALMENTE");
        jPanel1.add(lblVerCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 280, 30));

        bgOpciones.add(rbOpcion1);
        rbOpcion1.setText("Opcion 1");
        jPanel1.add(rbOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        bgOpciones.add(rbOpcion2);
        rbOpcion2.setText("Opcion 2");
        jPanel1.add(rbOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel1.add(txtcajaDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 60, 30));

        jLabel5.setText("DATO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, -1));

        jLabel6.setText("FRECUENCIA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));
        jPanel1.add(txtCajaFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 60, 30));

        jMenu2.setText("Menu");

        mITablaDeFrecuenciaDeDatos.setText("Opciones");

        mIPromedio.setText("Promedio");
        mIPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIPromedioActionPerformed(evt);
            }
        });
        mITablaDeFrecuenciaDeDatos.add(mIPromedio);

        mITablaDeLimitesRealesDeClase.setText("Tabla De Frecuencia De Datos");
        mITablaDeLimitesRealesDeClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mITablaDeLimitesRealesDeClaseActionPerformed(evt);
            }
        });
        mITablaDeFrecuenciaDeDatos.add(mITablaDeLimitesRealesDeClase);

        jMenuItem2.setText("Tabla De Limites Reales De Clase");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mITablaDeFrecuenciaDeDatos.add(jMenuItem2);

        jMenu2.add(mITablaDeFrecuenciaDeDatos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarDatosActionPerformed
        if (rbOpcion1.isSelected() == true) {

            try {
                if (txtCajaDatos.getText().split(" ").length > 0) {

                    String cont[] = txtCajaDatos.getText().split(",");
                    txtCajaDatos.setText("");
                    //validar que lo que entre sea un double
                    for (int i = 0; i < cont.length; i++) {
                        Datos.añadirDato(Double.parseDouble(cont[i]));
                    }

                    Datos.ordenar();
                    Datos.mostrarDatos();
                    tAMostrar.setText("");
                    for (int j = 0; j < Datos.listaDatos.size(); j++) {
                        tAMostrar.append(j + 1 + ":  " + Datos.listaDatos.get(j));
                        if (j < Datos.listaDatos.size() - 1) {
                            tAMostrar.append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS SATISFACTORIAMENTE :)");

                    lblVerCantidad.setText("");
                    lblVerCantidad.setText("HAY UN TOTAL DE : " + Datos.listaDatos.size() + " DATOS");

                } else {
                    JOptionPane.showMessageDialog(this, " HA OCURRIDO UN ERROR AL INGRESAR LOS DATOS EN LA OPCION 1");;
                    txtCajaDatos.setText("");
                    txtCajaFrecuencia.setText("");
                    txtcajaDatos2.setText("");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " HA OCURRIDO UN ERROR AL INGRESAR LOS DATOS EN LA OPCION 1");
                txtCajaDatos.setText("");
                txtCajaFrecuencia.setText("");
                txtcajaDatos2.setText("");
            }

        } else {
            try {

                if (txtcajaDatos2.getText().split(" ").length > 0 && txtCajaFrecuencia.getText().split(" ").length > 0) {
                    //INGRESANDO DATOS POR SEGUNDA OPCION
                    String s[] = txtcajaDatos2.getText().split(" ");
                    String frecu = txtCajaFrecuencia.getText();
                    txtcajaDatos2.setText("");
                    txtCajaFrecuencia.setText("");
                    String s2 = "";

                    for (int i = 0; i < s.length; i++) {
                        s2 = s2 + s[i];
                    }
                    String sr[] = s2.split(",");
                    for (int k = 0; k < sr.length; k++) {

                        for (int z = 0; z < Integer.parseInt(frecu); z++) {
                            Datos.añadirDato(Double.parseDouble(sr[k]));
                        }

                    }

                    Datos.ordenar();

                    lblVerCantidad.setText("");
                    lblVerCantidad.setText("HAY UN TOTAL DE : " + Datos.listaDatos.size() + " DATOS");
                    //MOSTRAMOS LOS DATOS
                    Datos.mostrarDatos();
                    tAMostrar.setText("");
                    for (int j = 0; j < Datos.listaDatos.size(); j++) {
                        tAMostrar.append(j + 1 + ":  " + Datos.listaDatos.get(j));
                        if (j < Datos.listaDatos.size() - 1) {
                            tAMostrar.append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(this, "DATOS GUARDADOS SATISFACTORIAMENTE :)");
                } else {

                    JOptionPane.showMessageDialog(this, "ERROR LA LA CAJA DE DATOS EN LA OPCION 2 O LA CAJA DE FRECUENCIA SE ENCUENTRA VACIA");
                    txtCajaDatos.setText("");
                    txtCajaFrecuencia.setText("");
                    txtcajaDatos2.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " HA OCURRIDO UN ERROR AL INGRESAR LOS DATOS EN LA OPCION 2");
                txtCajaDatos.setText("");
                txtCajaFrecuencia.setText("");
                txtcajaDatos2.setText("");
            }
        }
    }//GEN-LAST:event_btnIngresarDatosActionPerformed

    private void mIPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIPromedioActionPerformed

        new Promedio(this, true).setVisible(true);
    }//GEN-LAST:event_mIPromedioActionPerformed

    private void mITablaDeLimitesRealesDeClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mITablaDeLimitesRealesDeClaseActionPerformed
         new TablaDeFrecuenciaDeDatos(this, true).setVisible(true);
    }//GEN-LAST:event_mITablaDeLimitesRealesDeClaseActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TablaDeLimitesRealesDeClase(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOpciones;
    private javax.swing.JButton btnIngresarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVerCantidad;
    private javax.swing.JMenuItem mIPromedio;
    private javax.swing.JMenu mITablaDeFrecuenciaDeDatos;
    private javax.swing.JMenuItem mITablaDeLimitesRealesDeClase;
    private javax.swing.JRadioButton rbOpcion1;
    private javax.swing.JRadioButton rbOpcion2;
    private javax.swing.JTextArea tAMostrar;
    private javax.swing.JTextField txtCajaDatos;
    private javax.swing.JTextField txtCajaFrecuencia;
    private javax.swing.JTextField txtcajaDatos2;
    // End of variables declaration//GEN-END:variables
}
