
package pe.edu.uni.EduTec.view;

import javax.swing.JOptionPane;

import pe.edu.uni.EduTec.service.EduTecService;




public class EduTecView extends javax.swing.JFrame {

    String indice;
    public EduTecView() {
        initComponents();
        limpiarCampos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboNumero = new javax.swing.JComboBox<>();
        pnlDatos = new javax.swing.JPanel();
        lblN1 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        lblN2 = new javax.swing.JLabel();
        txtN3 = new javax.swing.JTextField();
        lblN3 = new javax.swing.JLabel();
        txtN4 = new javax.swing.JTextField();
        lblN4 = new javax.swing.JLabel();
        lblN5 = new javax.swing.JLabel();
        txtN5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnProcesar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduTec");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("EduTec");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad de números:");

        cboNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboNumero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2", "3", "4", "5" }));
        cboNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        lblN1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblN1.setText("Número 1:");

        txtN1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblN2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblN2.setText("Número 2:");

        txtN3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblN3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblN3.setText("Número 3:");

        txtN4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblN4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblN4.setText("Número 4:");

        lblN5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblN5.setText("Número 5:");

        txtN5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblN4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtN4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlDatosLayout.createSequentialGroup()
                            .addComponent(lblN3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDatosLayout.createSequentialGroup()
                            .addComponent(lblN2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDatosLayout.createSequentialGroup()
                            .addComponent(lblN1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addComponent(lblN5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtN5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN1)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN2)
                    .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN3)
                    .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN4)
                    .addComponent(txtN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN5)
                    .addComponent(txtN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnProcesar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(204, 51, 0));
        btnProcesar.setText("Procesar");
        btnProcesar.setEnabled(false);
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(204, 51, 0));
        btnNuevo.setText("Nuevo");
        btnNuevo.setEnabled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 51, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Promedio:");

        txtPromedio.setEditable(false);
        txtPromedio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPromedio.setForeground(new java.awt.Color(51, 51, 255));
        txtPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNumeroActionPerformed
        
        
        indice=cboNumero.getSelectedItem().toString();
        limpiarCampos();
        verCampos(indice);
        
    }//GEN-LAST:event_cboNumeroActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        double n1,n2,n3,n4,n5,prom=0;
        EduTecService ets=new EduTecService();
        switch(indice)
        {
            case "2":
                try
                {
                    Validacion.validarCampo(txtN1, "Ingrese primer numero");
                    Validacion.validarSiEsNumero(txtN1, "Solo numeros");
                    Validacion.validarCampo(txtN2, "Ingrese segundo numero");
                    Validacion.validarSiEsNumero(txtN2, "Solo numeros");
                    n1=Double.parseDouble(txtN1.getText());
                    n2=Double.parseDouble(txtN2.getText());
                    prom=ets.calcularPromedio(n1,n2);
                    txtPromedio.setText(String.valueOf(prom));
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
            case "3":
                try
                {
                    Validacion.validarCampo(txtN1, "Ingrese primer numero");
                    Validacion.validarSiEsNumero(txtN1, "Solo numeros");
                    Validacion.validarCampo(txtN2, "Ingrese segundo numero");
                    Validacion.validarSiEsNumero(txtN2, "Solo numeros");
                    Validacion.validarCampo(txtN3, "Ingrese tercer numero");
                    Validacion.validarSiEsNumero(txtN3, "Solo numeros");
                    n1=Double.parseDouble(txtN1.getText());
                    n2=Double.parseDouble(txtN2.getText());
                    n3=Double.parseDouble(txtN3.getText());
                    prom=Validacion.redondear(ets.calcularPromedio(n1,n2,n3));
                    txtPromedio.setText(String.valueOf(prom));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
            case "4":
                try
                {
                    Validacion.validarCampo(txtN1, "Ingrese primer numero");
                    Validacion.validarSiEsNumero(txtN1, "Solo numeros");
                    Validacion.validarCampo(txtN2, "Ingrese segundo numero");
                    Validacion.validarSiEsNumero(txtN2, "Solo numeros");
                    Validacion.validarCampo(txtN3, "Ingrese tercer numero");
                    Validacion.validarSiEsNumero(txtN3, "Solo numeros");
                    Validacion.validarCampo(txtN4, "Ingrese cuarto numero");
                    Validacion.validarSiEsNumero(txtN4, "Solo numeros");
                    n1=Double.parseDouble(txtN1.getText());
                    n2=Double.parseDouble(txtN2.getText());
                    n3=Double.parseDouble(txtN3.getText());
                    n4=Double.parseDouble(txtN4.getText());
                    prom=Validacion.redondear(ets.calcularPromedio(n1,n2,n3,n4));
                    txtPromedio.setText(String.valueOf(prom));
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
                break;
            case "5":
                
                try
                {
                    Validacion.validarCampo(txtN1, "Ingrese primer numero");
                    Validacion.validarSiEsNumero(txtN1, "Solo numeros");
                    Validacion.validarCampo(txtN2, "Ingrese segundo numero");
                    Validacion.validarSiEsNumero(txtN2, "Solo numeros");
                    Validacion.validarCampo(txtN3, "Ingrese tercer numero");
                    Validacion.validarSiEsNumero(txtN3, "Solo numeros");
                    Validacion.validarCampo(txtN4, "Ingrese cuarto numero");
                    Validacion.validarSiEsNumero(txtN4, "Solo numeros");
                    Validacion.validarCampo(txtN5, "Ingrese quinto numero");
                    Validacion.validarSiEsNumero(txtN5, "Solo numeros");
                    n1=Double.parseDouble(txtN1.getText());
                    n2=Double.parseDouble(txtN2.getText());
                    n3=Double.parseDouble(txtN3.getText());
                    n4=Double.parseDouble(txtN4.getText());
                    n5=Double.parseDouble(txtN5.getText());
                    prom=Validacion.redondear(ets.calcularPromedio(n1,n2,n3,n4,n5));
                    txtPromedio.setText(String.valueOf(prom));
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
                break;
        }
        
        
        btnNuevo.setEnabled(true);
        cboNumero.setEnabled(false);
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        cboNumero.setSelectedIndex(0);
        cboNumero.setEnabled(true);
        limpiarTexto();
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    private void limpiarTexto()
    {
        txtN1.setText("");
        txtN2.setText("");
        txtN3.setText("");
        txtN4.setText("");
        txtN5.setText("");
        txtPromedio.setText("");
        txtN1.requestFocus();
    }
    private void verCampos(String cant)
    {
        switch(cant)
        {
            case "2":
                lblN1.setVisible(true);
                txtN1.setVisible(true);
                lblN2.setVisible(true);
                txtN2.setVisible(true);
                btnProcesar.setEnabled(true);
                break;
            case "3":
                txtN1.setVisible(true);
                lblN1.setVisible(true);
                txtN2.setVisible(true);
                lblN2.setVisible(true);
                txtN3.setVisible(true);
                lblN3.setVisible(true);
                btnProcesar.setEnabled(true);
                break;
            case "4":
                txtN1.setVisible(true);
                lblN1.setVisible(true);
                txtN2.setVisible(true);
                lblN2.setVisible(true);
                txtN3.setVisible(true);
                lblN3.setVisible(true);
                txtN4.setVisible(true);
                lblN4.setVisible(true);
                btnProcesar.setEnabled(true);
                break;
            case "5":
                txtN1.setVisible(true);
                lblN1.setVisible(true);
                txtN2.setVisible(true);
                lblN2.setVisible(true);
                txtN3.setVisible(true);
                lblN3.setVisible(true);
                txtN4.setVisible(true);
                lblN4.setVisible(true);
                txtN5.setVisible(true);
                lblN5.setVisible(true);
                btnProcesar.setEnabled(true);
                break;
            default:
                limpiarCampos();
                btnProcesar.setEnabled(false);
                
        }
    }
    private void limpiarCampos()
    {
        lblN1.setVisible(false);
        lblN2.setVisible(false);
        lblN3.setVisible(false);
        lblN4.setVisible(false);
        lblN5.setVisible(false);
        txtN1.setVisible(false);
        txtN2.setVisible(false);
        txtN3.setVisible(false);
        txtN4.setVisible(false);
        txtN5.setVisible(false);
    }
    
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
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblN1;
    private javax.swing.JLabel lblN2;
    private javax.swing.JLabel lblN3;
    private javax.swing.JLabel lblN4;
    private javax.swing.JLabel lblN5;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtN3;
    private javax.swing.JTextField txtN4;
    private javax.swing.JTextField txtN5;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
