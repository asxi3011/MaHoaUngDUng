/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ceasar;

import java.util.Objects;

/**
 *
 * @author buile
 */
public class CesearForm extends javax.swing.JFrame {

    /**
     * Creates new form Cesear
     */
    public CesearForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEncryption = new javax.swing.JButton();
        lblKeyEncryption = new javax.swing.JLabel();
        txtKeyEncryption = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tareaEcryption = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tereaDecryption = new javax.swing.JTextArea();
        btnDecryption = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtKeyDecryption = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEncryption.setText("Encryption");
        btnEncryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptionActionPerformed(evt);
            }
        });

        lblKeyEncryption.setText("Key");

        txtKeyEncryption.setName("txtKeyEncryption"); // NOI18N

        tareaEcryption.setColumns(20);
        tareaEcryption.setRows(5);
        jScrollPane1.setViewportView(tareaEcryption);

        tereaDecryption.setColumns(20);
        tereaDecryption.setRows(5);
        jScrollPane2.setViewportView(tereaDecryption);

        btnDecryption.setText("Decryption");
        btnDecryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptionActionPerformed(evt);
            }
        });

        jLabel2.setText("Key");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblKeyEncryption)
                        .addGap(30, 30, 30)
                        .addComponent(txtKeyEncryption, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKeyDecryption)
                        .addGap(3, 3, 3))
                    .addComponent(btnEncryption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecryption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKeyEncryption)
                            .addComponent(txtKeyEncryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEncryption)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKeyDecryption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDecryption)
                        .addGap(43, 43, 43))))
        );

        txtKeyEncryption.getAccessibleContext().setAccessibleName("txtKeyEncryption");
        txtKeyEncryption.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptionActionPerformed

        int keyEncryption = Integer.parseInt(txtKeyEncryption.getText());
        String plainText = tareaEcryption.getText();
        String cipherText = encryption(plainText, keyEncryption);
        tereaDecryption.setText(cipherText);
    }//GEN-LAST:event_btnEncryptionActionPerformed

    private void btnDecryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptionActionPerformed
        int keyDecryption = Integer.parseInt(txtKeyDecryption.getText());
        String cipherText = tereaDecryption.getText();
        String plainText = decryption(cipherText, keyDecryption);
        tareaEcryption.setText(plainText);
    }//GEN-LAST:event_btnDecryptionActionPerformed
    
    private String encryption(String plainText, int key){
        // Encry: (i+k)mod 26 
        //already check work well
        String[] plainTextArr = plainText.split("");
        String cipherText = "";
        for(int counter = 0; counter < plainTextArr.length; counter++){
            for(int index = 0; index < alphabet.length; ){
              if(Objects.equals(alphabet[index], plainTextArr[counter])){
                  System.out.println(alphabet[index]);
                  int indexPlainText = index;
                  int indexCipherText = (indexPlainText + key) - 26 >= 0 ? (indexPlainText + key)- 26:(indexPlainText + key);
                  cipherText += alphabet[indexCipherText];
              }
              index++;
           }
        }
        return cipherText;
    }
    
    private String decryption(String cipherText, int key){
        // Encry: (i-k)mod 26 
        String[] cipherTextArr = cipherText.split("");
        String plainText = "";
        for(int counter = 0; counter < cipherTextArr.length; counter++){
            for(int index = 0; index < alphabet.length; ){
              if(Objects.equals(alphabet[index], cipherTextArr[counter])){
                  int indexCipherText = index;
                  int indexPlainText = (indexCipherText - key) < 0 ? 26+(indexCipherText - key):(indexCipherText - key) ;
                  plainText += alphabet[indexPlainText];
              }
              index++;
           }
        }
        return plainText;
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
           
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CesearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CesearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CesearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CesearForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CesearForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecryption;
    private javax.swing.JButton btnEncryption;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblKeyEncryption;
    private javax.swing.JTextArea tareaEcryption;
    private javax.swing.JTextArea tereaDecryption;
    private javax.swing.JTextField txtKeyDecryption;
    private javax.swing.JTextField txtKeyEncryption;
    // End of variables declaration//GEN-END:variables
    private String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    

}
