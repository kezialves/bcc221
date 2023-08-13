package Telas;

public class FormGerenciaFuncionario extends javax.swing.JFrame {


    /**
     * Creates new form FormGerenciaFuncionario
     */
    public FormGerenciaFuncionario() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuGerenciar = new javax.swing.JMenu();
        menuGerenciarEmprestimo = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenu();
        menuBuscarAutor = new javax.swing.JMenuItem();
        menuBuscarCategorias = new javax.swing.JMenuItem();
        menuBuscarEmprestimo = new javax.swing.JMenuItem();
        menuBuscarFuncionario = new javax.swing.JMenuItem();
        menuBuscarLivro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        menuGerenciar.setText("Gerenciar");

        menuGerenciarEmprestimo.setText("Empréstimo");
        menuGerenciarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenciarEmprestimoActionPerformed(evt);
            }
        });
        menuGerenciar.add(menuGerenciarEmprestimo);

        jMenuBar1.add(menuGerenciar);

        menuBuscar.setText("Buscar");

        menuBuscarAutor.setText("Autor");
        menuBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarAutorActionPerformed(evt);
            }
        });
        menuBuscar.add(menuBuscarAutor);

        menuBuscarCategorias.setText("Categorias");
        menuBuscarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarCategoriasActionPerformed(evt);
            }
        });
        menuBuscar.add(menuBuscarCategorias);

        menuBuscarEmprestimo.setText("Emprestimo");
        menuBuscarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarEmprestimoActionPerformed(evt);
            }
        });
        menuBuscar.add(menuBuscarEmprestimo);

        menuBuscarFuncionario.setText("Funcionario");
        menuBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarFuncionarioActionPerformed(evt);
            }
        });
        menuBuscar.add(menuBuscarFuncionario);

        menuBuscarLivro.setText("Livro");
        menuBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarLivroActionPerformed(evt);
            }
        });
        menuBuscar.add(menuBuscarLivro);

        jMenuBar1.add(menuBuscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarAutorActionPerformed
        
        FormAutor form = new FormAutor(2);
        
        form.setTitle("Autor");
        form.setLocationRelativeTo(null);// no centro
        form.setResizable(false); // retira o botão maximizar
        form.setVisible(true); // mostra a janela

    }//GEN-LAST:event_menuBuscarAutorActionPerformed

    private void menuBuscarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarEmprestimoActionPerformed
        
        FormEmprestimo form = new FormEmprestimo(2);
        
        form.setTitle("Empréstimo");
        form.setLocationRelativeTo(null);// no centro
        form.setResizable(false); // retira o botão maximizar
        form.setVisible(true); // mostra a janela

    }//GEN-LAST:event_menuBuscarEmprestimoActionPerformed

    private void menuGerenciarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenciarEmprestimoActionPerformed
        
        FormEmprestimo form = new FormEmprestimo(2);
        
        form.setTitle("Empréstimo");
        form.setLocationRelativeTo(null);// no centro
        form.setResizable(false); // retira o botão maximizar
        form.setVisible(true); // mostra a janela

    }//GEN-LAST:event_menuGerenciarEmprestimoActionPerformed

    private void menuBuscarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarCategoriasActionPerformed
        
        FormCategorias form = new FormCategorias(2);
        
        form.setTitle("Categoria");
        form.setLocationRelativeTo(null);// no centro
        form.setResizable(false); // retira o botão maximizar
        form.setVisible(true);

    }//GEN-LAST:event_menuBuscarCategoriasActionPerformed

    private void menuBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarFuncionarioActionPerformed
        
        FormFuncionario form = new FormFuncionario(2);
        
        form.setTitle("Funcionário");
        form.setLocationRelativeTo(null);// no centro
        form.setResizable(false); // retira o botão maximizar
        form.setVisible(true); // mostra a janela

    }//GEN-LAST:event_menuBuscarFuncionarioActionPerformed

    private void menuBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarLivroActionPerformed
       
        FormLivro form = new FormLivro(2);
        
        form.setTitle("Livro");
        form.setLocationRelativeTo(null);// no centro
        form.setResizable(false); // retira o botão maximizar
        form.setVisible(true); // mostra a janela


    }//GEN-LAST:event_menuBuscarLivroActionPerformed

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
            java.util.logging.Logger.getLogger(FormGerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGerenciaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerenciaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuBuscar;
    private javax.swing.JMenuItem menuBuscarAutor;
    private javax.swing.JMenuItem menuBuscarCategorias;
    private javax.swing.JMenuItem menuBuscarEmprestimo;
    private javax.swing.JMenuItem menuBuscarFuncionario;
    private javax.swing.JMenuItem menuBuscarLivro;
    private javax.swing.JMenu menuGerenciar;
    private javax.swing.JMenuItem menuGerenciarEmprestimo;
    // End of variables declaration//GEN-END:variables
}
