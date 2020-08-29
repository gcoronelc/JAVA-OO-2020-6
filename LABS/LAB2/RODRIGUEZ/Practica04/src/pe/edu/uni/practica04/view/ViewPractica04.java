package pe.edu.uni.practica04.view;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import pe.edu.uni.practica04.service.ServicePractica04;

public class ViewPractica04 extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("#.00");
    
    public ViewPractica04() {
        initComponents();
        txtNum1.setVisible(false);
        txtNum2.setVisible(false);
        txtNum3.setVisible(false);
        txtNum4.setVisible(false);
        txtNum5.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        btnCalcular.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNum4 = new javax.swing.JTextField();
        txtNum3 = new javax.swing.JTextField();
        cbxCantNum = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        txtNum5 = new javax.swing.JTextField();
        lbl5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Libreria EduTec");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cbxCantNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "2", "3", "4", "5" }));
        cbxCantNum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCantNumItemStateChanged(evt);
            }
        });

        jLabel7.setText("Cantidad de Numeros");

        lbl1.setText("Numero 1");

        lbl2.setText("Numero 2");

        lbl3.setText("Numero 3");
        lbl3.setOpaque(true);

        lbl4.setText("Numero 4");
        lbl4.setOpaque(true);

        lbl5.setText("Numero 5");
        lbl5.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl5)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(cbxCantNum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lbl1)
                            .addGap(18, 18, 18)
                            .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCantNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txtNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txtNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5)
                    .addComponent(txtNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("PROMEDIO");

        txtPromedio.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        int cant;
        double n1, n2, n3, n4, n5;
        double promedio;
        cant = cbxCantNum.getSelectedIndex() + 1;
        
        switch (cant) {
            case 2: {
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                ServicePractica04 srv = new ServicePractica04(n1, n2);
                promedio = srv.getPromedio();
                break;
            }
            case 3: {
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                n3 = Double.parseDouble(txtNum3.getText());
                ServicePractica04 srv = new ServicePractica04(n1, n2, n3);
                promedio = srv.getPromedio();
                break;
            }
            case 4: {
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                n3 = Double.parseDouble(txtNum3.getText());
                n4 = Double.parseDouble(txtNum4.getText());
                ServicePractica04 srv = new ServicePractica04(n1, n2, n3, n4);
                promedio = srv.getPromedio();
                break;
            }
            default: {
                n1 = Double.parseDouble(txtNum1.getText());
                n2 = Double.parseDouble(txtNum2.getText());
                n3 = Double.parseDouble(txtNum3.getText());
                n4 = Double.parseDouble(txtNum4.getText());
                n5 = Double.parseDouble(txtNum5.getText());
                ServicePractica04 srv = new ServicePractica04(n1, n2, n3, n4, n5);
                promedio = srv.getPromedio();
                break;
            }
        }

        txtPromedio.setText(String.valueOf(df.format(promedio)));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbxCantNumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCantNumItemStateChanged

        int cantNum = cbxCantNum.getSelectedIndex() + 1;

        switch (cantNum) {
            case 1: {
                txtNum1.setVisible(false);
                txtNum2.setVisible(false);
                txtNum3.setVisible(false);
                txtNum4.setVisible(false);
                txtNum5.setVisible(false);
                lbl1.setVisible(false);
                lbl2.setVisible(false);
                lbl3.setVisible(false);
                lbl4.setVisible(false);
                lbl5.setVisible(false);
                btnCalcular.setEnabled(false);
                break;
            }
            case 2: {
                txtNum1.setVisible(true);
                txtNum2.setVisible(true);
                txtNum3.setVisible(false);
                txtNum4.setVisible(false);
                txtNum5.setVisible(false);
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(false);
                lbl4.setVisible(false);
                lbl5.setVisible(false);
                btnCalcular.setEnabled(true);
                txtNum1.requestFocus();
                break;
            }
            case 3: {
                txtNum1.setVisible(true);
                txtNum2.setVisible(true);
                txtNum3.setVisible(true);
                txtNum4.setVisible(false);
                txtNum5.setVisible(false);
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lbl4.setVisible(false);
                lbl5.setVisible(false);
                btnCalcular.setEnabled(true);
                txtNum1.requestFocus();
                break;
            }
            case 4: {
                txtNum1.setVisible(true);
                txtNum2.setVisible(true);
                txtNum3.setVisible(true);
                txtNum4.setVisible(true);
                txtNum5.setVisible(false);
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lbl4.setVisible(true);
                lbl5.setVisible(false);
                btnCalcular.setEnabled(true);
                txtNum1.requestFocus();
                break;
            }
            default: {
                txtNum1.setVisible(true);
                txtNum2.setVisible(true);
                txtNum3.setVisible(true);
                txtNum4.setVisible(true);
                txtNum5.setVisible(true);
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lbl4.setVisible(true);
                lbl5.setVisible(true);
                btnCalcular.setEnabled(true);
                txtNum1.requestFocus();
                break;
            }

        }
        
        limpiar();

    }//GEN-LAST:event_cbxCantNumItemStateChanged

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiar();
        cbxCantNum.setSelectedIndex(0);
        btnCalcular.setEnabled(false);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed

    public void limpiar(){
        txtNum1.setText("");
        txtNum2.setText("");
        txtNum3.setText("");
        txtNum4.setText("");
        txtNum5.setText("");
        txtPromedio.setText("");
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPractica04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPractica04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPractica04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPractica04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPractica04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxCantNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    private javax.swing.JTextField txtNum4;
    private javax.swing.JTextField txtNum5;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
