package Telas;

public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrarAdm = new javax.swing.JButton();
        entrarFuncionario = new javax.swing.JButton();
        bemVindo = new javax.swing.JLabel();
        entrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        entrarAdm.setText("Entrar como administrador");
        entrarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarAdmActionPerformed(evt);
            }
        });

        entrarFuncionario.setText("Entrar como funcionário");
        entrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarFuncionarioActionPerformed(evt);
            }
        });

        bemVindo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        bemVindo.setText("Bem vindo(a)!");

        entrarUsuario.setText("Entrar como usuário");
        entrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bemVindo)
                    .addComponent(entrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(bemVindo)
                .addGap(50, 50, 50)
                .addComponent(entrarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarAdmActionPerformed
        
        FormGerenciaAdm formGerenciaAdm = new FormGerenciaAdm();

        formGerenciaAdm.setTitle("Administrador");
        formGerenciaAdm.setLocationRelativeTo(null);// no centro
        formGerenciaAdm.setResizable(false); // retira o botão maximizar
        formGerenciaAdm.setVisible(true); // mostra a janela
    }//GEN-LAST:event_entrarAdmActionPerformed

    private void entrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarFuncionarioActionPerformed
        
        FormGerenciaFuncionario formGerenciaFuncionario = new FormGerenciaFuncionario();

        formGerenciaFuncionario.setTitle("Funcionário");
        formGerenciaFuncionario.setLocationRelativeTo(null);// no centro
        formGerenciaFuncionario.setResizable(false); // retira o botão maximizar
        formGerenciaFuncionario.setVisible(true); // mostra a janela
    }//GEN-LAST:event_entrarFuncionarioActionPerformed

    private void entrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarUsuarioActionPerformed
        
        FormGerenciaUsuario formGerenciaUsuario = new FormGerenciaUsuario();

        formGerenciaUsuario.setTitle("Usuário");
        formGerenciaUsuario.setLocationRelativeTo(null);// no centro
        formGerenciaUsuario.setResizable(false); // retira o botão maximizar
        formGerenciaUsuario.setVisible(true); // mostra a janela
    }//GEN-LAST:event_entrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormMain tela;
                tela = new FormMain();    
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemVindo;
    private javax.swing.JButton entrarAdm;
    private javax.swing.JButton entrarFuncionario;
    private javax.swing.JButton entrarUsuario;
    // End of variables declaration//GEN-END:variables
}