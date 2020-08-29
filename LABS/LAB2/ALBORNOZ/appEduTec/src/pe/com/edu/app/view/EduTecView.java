
package pe.com.edu.app.view;

import javax.swing.JOptionPane;
import pe.com.edu.app.Services.EduTecService;
import pe.com.edu.app.dto.EduTecDto;


public class EduTecView extends javax.swing.JFrame {

  
    public EduTecView() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNota01 = new javax.swing.JTextField();
        txtNota02 = new javax.swing.JTextField();
        txtNota03 = new javax.swing.JTextField();
        txtNota04 = new javax.swing.JTextField();
        txtNota05 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboCnatNota = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnProcesar = new javax.swing.JToggleButton();
        btnNuevo = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(0, 204, 204))); // NOI18N

        jLabel1.setText("Nota01:");

        jLabel2.setText("Nota02:");

        jLabel3.setText("Nota03:");

        jLabel4.setText("Nota04:");

        jLabel5.setText("Nota05:");

        txtNota01.setText("0.0");
        txtNota01.setEnabled(false);

        txtNota02.setText("0.0");
        txtNota02.setEnabled(false);

        txtNota03.setText("0.0");
        txtNota03.setEnabled(false);

        txtNota04.setText("0.0");
        txtNota04.setEnabled(false);

        txtNota05.setText("0.0");
        txtNota05.setEnabled(false);
        txtNota05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota05ActionPerformed(evt);
            }
        });

        jLabel7.setText("PROMEDIAR");

        cboCnatNota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2 Notas", "3 Notas", "4 Notas", "5 Notas" }));
        cboCnatNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCnatNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNota02, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txtNota03)
                    .addComponent(txtNota04)
                    .addComponent(txtNota05)
                    .addComponent(txtNota01)
                    .addComponent(cboCnatNota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboCnatNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNota01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNota02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNota03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNota04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNota05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(0, 204, 204))); // NOI18N

        btnProcesar.setText("Procesar");
        btnProcesar.setEnabled(false);
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setEnabled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 24), new java.awt.Color(0, 153, 153))); // NOI18N

        jLabel6.setText("Promedio de notas:");

        txtPromedio.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPromedio)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        //variables 
       double num1,num2,num3,num4,num5;
       EduTecDto dto=new EduTecDto();
       //datos
       num1=Double.parseDouble(txtNota01.getText());
       num2=Double.parseDouble(txtNota02.getText());
       num3=Double.parseDouble(txtNota03.getText());
       num4=Double.parseDouble(txtNota04.getText());
       num5=Double.parseDouble(txtNota05.getText());
       //proceso
       dto.setNum1(num1);
       dto.setNum2(num2);
       dto.setNum3(num3);
       dto.setNum4(num4);
       dto.setNum5(num5);
       EduTecService eduser=new EduTecService();
       //Salidas por seleccion
       String combo=(String)cboCnatNota.getSelectedItem();
       if(combo.equals("2 Notas")){
           dto=eduser.Calculo2(dto);
           //salida          
           txtPromedio.setText(""+to2Dec(dto.getResultado()));
       }
       if(combo.equals("3 Notas")){
           dto=eduser.Calculo3(dto);
           //salida
           txtPromedio.setText(""+to2Dec(dto.getResultado()));
       }
       if(combo.equals("4 Notas")){
            dto=eduser.Calculo4(dto);
            //salida
           txtPromedio.setText(""+to2Dec(dto.getResultado()));
       }
       if(combo.equals("5 Notas")){
           dto=eduser.Calculo5(dto);
           //salida
           txtPromedio.setText(""+to2Dec(dto.getResultado()));
       }
       
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void txtNota05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota05ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtNota01.setText("0.0");
        txtNota02.setText("0.0");
        txtNota03.setText("0.0");
        txtNota04.setText("0.0");
        txtNota05.setText("0.0");
        txtNota01.setEnabled(false);
        txtNota02.setEnabled(false);
        txtNota03.setEnabled(false);
        txtNota04.setEnabled(false);
        txtNota05.setEnabled(false);
        txtPromedio.setText("0.0");
        btnNuevo.setEnabled(false);
        btnProcesar.setEnabled(false);
        cboCnatNota.setSelectedIndex(0);
        cboCnatNota.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboCnatNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCnatNotaActionPerformed
        // TODO add your handling code here:
        String valorCbo=(String)cboCnatNota.getSelectedItem();
        if(valorCbo.equals("2 Notas")){
            txtNota01.setEnabled(true);
            txtNota02.setEnabled(true);
            txtNota03.setEnabled(false);
            txtNota04.setEnabled(false);
            txtNota05.setEnabled(false);
            btnProcesar.setEnabled(true);
            btnNuevo.setEnabled(true);
            cboCnatNota.setEnabled(false);
        }
        if(valorCbo.equals("3 Notas")){
            txtNota01.setEnabled(true);
            txtNota02.setEnabled(true);
            txtNota03.setEnabled(true);
            txtNota04.setEnabled(false);
            txtNota05.setEnabled(false);
            btnProcesar.setEnabled(true);
            btnNuevo.setEnabled(true);
            cboCnatNota.setEnabled(false);
        }
        if(valorCbo.equals("4 Notas")){
            txtNota01.setEnabled(true);
            txtNota02.setEnabled(true);
            txtNota03.setEnabled(true);
            txtNota04.setEnabled(true);
            txtNota05.setEnabled(false);
            btnProcesar.setEnabled(true);
            btnNuevo.setEnabled(true);
            cboCnatNota.setEnabled(false);
        }
        if(valorCbo.equals("5 Notas")){
            txtNota01.setEnabled(true);
            txtNota02.setEnabled(true);
            txtNota03.setEnabled(true);
            txtNota04.setEnabled(true);
            txtNota05.setEnabled(true);
            btnProcesar.setEnabled(true);
            btnNuevo.setEnabled(true);
            cboCnatNota.setEnabled(false);
        }
          if(valorCbo.equals("Seleccionar")){
            txtNota01.setEnabled(false);
            txtNota02.setEnabled(false);
            txtNota03.setEnabled(false);
            txtNota04.setEnabled(false);
            txtNota05.setEnabled(false);
            btnProcesar.setEnabled(false);
            btnNuevo.setEnabled(false);
            cboCnatNota.setEnabled(false);
        }
    }//GEN-LAST:event_cboCnatNotaActionPerformed

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
            java.util.logging.Logger.getLogger(EduTecView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduTecView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduTecView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduTecView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduTecView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnNuevo;
    private javax.swing.JToggleButton btnProcesar;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JComboBox<String> cboCnatNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtNota01;
    private javax.swing.JTextField txtNota02;
    private javax.swing.JTextField txtNota03;
    private javax.swing.JTextField txtNota04;
    private javax.swing.JTextField txtNota05;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
private double to2Dec(double valor){
		valor *= 100;
		valor = Math.round(valor);
		valor /= 100;
		return valor;
	}
}
