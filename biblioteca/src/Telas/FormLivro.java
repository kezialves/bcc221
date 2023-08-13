package Telas;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.ListSelectionModel;
import Modelo.Livro;
import DAO.DAOLivro;
import DAO.DAOAutor;
import DAO.DAOCategoria;
import Modelo.Categoria;
import Modelo.Autor;

public class FormLivro extends javax.swing.JFrame {
    
    DAOLivro daoLivro = new DAOLivro();
    DAOAutor daoAutor = new DAOAutor();
    DAOCategoria daoCategoria = new DAOCategoria();

    int tipoFuncionario;
    /**
     * Creates new form FormAutor
     */
    public FormLivro() {
        initComponents();
    }
    
    public FormLivro(int tipoFuncionario){
        initComponents();
        this.tipoFuncionario = tipoFuncionario;

        if(tipoFuncionario == 2 || tipoFuncionario == 3){
            this.btnAdicionar.setEnabled(false);
            this.btnRemover.setEnabled(false);
            this.btnAtualizar.setEnabled(false);
        }
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    //@SuppressWarnings("unchecked")
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnLocalizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAutores = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCategorias = new javax.swing.JList<>();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Título:");

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdicionar);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemover);

        btnAtualizar.setText("Atualizar");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtualizar);

        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLocalizar);

        jLabel3.setText("Categorias:");

        jLabel4.setText("Autores:");

        DefaultListModel autoresModel = new DefaultListModel();
        for(Object element: daoAutor.getLista()){
            autoresModel.addElement(element);

        }

        jListAutores.setModel(autoresModel);
        jScrollPane2.setViewportView(jListAutores);

        jListAutores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jListCategorias.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        DefaultListModel<Object> categoriaModel = new DefaultListModel<Object>();
        for(Object element: daoCategoria.getLista()){
            categoriaModel.addElement(element);

        }

        jListCategorias.setModel(categoriaModel);
        jScrollPane3.setViewportView(jListCategorias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(182, 182, 182)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        String idString = txtID.getText();
        String tituloString = txtTitulo.getText();
        
        // Pega todos os autores que a pessoa selecionou na telinha e coloca num arraylist
        List<Autor> listaAutores = (List<Autor>)(List<?>) jListAutores.getSelectedValuesList();
        // Pega todas as categorias que a pessoa selecionou na telinha e coloca num arraylist
        List<Categoria> listaCategoria = (List<Categoria>)(List<?>) jListCategorias.getSelectedValuesList();

        int id = 0;

        // Color vermelho = new Color(255, 0, 0, 40);
        // Color nulo = new Color(255, 255, 255, 255);

        // txtID.setBackground(nulo);

        // ID inválido
        try {
            id = Integer.parseInt(idString);
        }
        catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID inválido! Utilize apenas números.", "Erro!", JOptionPane.PLAIN_MESSAGE);
            txtID.requestFocus();
            // txtID.setBackground(vermelho);
            return;
        }

        // Remove o livro

        Livro livro = new Livro(id, tituloString, listaCategoria, listaAutores);

        try {
            daoLivro.remover(livro);
        }
        catch(IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Erro!", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        catch(NoSuchElementException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage() + " Tente novamente.", "Erro!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        txtID.setText("");
        txtTitulo.setText("");
        
        JOptionPane.showMessageDialog(null, "Livro removido!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnRemoverActionPerformed

    @SuppressWarnings("unchecked")
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        String idString = txtID.getText();
        String tituloString = txtTitulo.getText();

        // Pega todos os autores que a pessoa selecionou na telinha e coloca num arraylist
        List<Autor> listaAutores = (List<Autor>)(List<?>) jListAutores.getSelectedValuesList();
        // Pega todas as categorias que a pessoa selecionou na telinha e coloca num arraylist
        List<Categoria> listaCategoria = (List<Categoria>)(List<?>) jListCategorias.getSelectedValuesList();
                
        int id = 0;

        // Color vermelho = new Color(255, 0, 0, 40);
        // Color nulo = new Color(255, 255, 255, 255);

        // txtID.setBackground(nulo);
        // txtTitulo.setBackground(nulo);

        // ID inválido
        try {
            id = Integer.parseInt(idString);
        }
        catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID inválido! Utilize apenas números.", "Erro!", JOptionPane.PLAIN_MESSAGE);
            txtID.requestFocus();
            // txtID.setBackground(vermelho);
            return;
        }

        // Nome inválido
        try {
            if(tituloString.isEmpty()) {
                throw new IllegalArgumentException("Nome inválido! O nome do livro não pode ser vazio.");
            }
        }
        catch(IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro!", JOptionPane.PLAIN_MESSAGE);
            txtTitulo.requestFocus();
            // txtTitulo.setBackground(vermelho);
            return;
        }

        if(listaCategoria.size() == 0){
            JOptionPane.showMessageDialog(null, "Selecione pelo menos 1 categoria!", "Erro!", JOptionPane.PLAIN_MESSAGE);
            // jListCategorias.requestFocus();
            return;
        }

        if(listaAutores.size() == 0){
            JOptionPane.showMessageDialog(null, "Selecione pelo menos 1 autor!", "Erro!", JOptionPane.PLAIN_MESSAGE);
            // jListAutores.requestFocus();
            return;
        }

        // Adiciona o livro
        Livro livro = new Livro(id, tituloString, listaCategoria, listaAutores);
        
        try {
            daoLivro.incluir(livro);
        }
        catch(IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage() + " Tente novamente.", "Erro!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        txtID.setText("");
        txtTitulo.setText("");

        JOptionPane.showMessageDialog(null, "Livro incluído!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        
        String idString = txtID.getText();
    
        int id = 0;

        // Color vermelho = new Color(255, 0, 0, 40);
        // Color nulo = new Color(255, 255, 255, 255);

        // txtID.setBackground(nulo);

        // ID inválido
        try {
            id = Integer.parseInt(idString);
        }
        catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID inválido! Utilize apenas números.", "Erro!", JOptionPane.PLAIN_MESSAGE);
            txtID.requestFocus();
            // txtID.setBackground(vermelho);
            return;
        }

        Livro livro = null;

        try{
            livro = (Livro) daoLivro.localizar(id);
        } catch (NoSuchElementException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Erro!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        txtID.setText("");
        txtTitulo.setText("");

        JOptionPane.showMessageDialog(null, livro, "Livro encontrado!", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnLocalizarActionPerformed

    @SuppressWarnings("unchecked")
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       
        String idString = txtID.getText();
        String tituloString = txtTitulo.getText();

        // Pega todos os autores que a pessoa selecionou na telinha e coloca num arraylist
        List<Autor> listaAutores = (List<Autor>)(List<?>) jListAutores.getSelectedValuesList();
        // Pega todas as categorias que a pessoa selecionou na telinha e coloca num arraylist
        List<Categoria> listaCategoria = (List<Categoria>)(List<?>) jListCategorias.getSelectedValuesList();
        
        int id = 0;
        // Color vermelho = new Color(255, 0, 0, 40);
        // Color nulo = new Color(255, 255, 255, 255);

        // txtID.setBackground(nulo);
        // txtTitulo.setBackground(nulo);

        // ID inválido
        try {
            id = Integer.parseInt(idString);
        }
        catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID inválido! Utilize apenas números.", "Erro!", JOptionPane.PLAIN_MESSAGE);
            txtID.requestFocus();
            // txtID.setBackground(vermelho);
            return;
        }

        Livro livro = new Livro(id, tituloString, listaCategoria, listaAutores);

        try{
            daoLivro.atualizar(livro);
        }
        catch (IllegalArgumentException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Erro!", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        catch (NoSuchElementException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Erro!", JOptionPane.PLAIN_MESSAGE);
            return;
        }

        txtID.setText("");
        txtTitulo.setText("");

        JOptionPane.showMessageDialog(null, "Livro atualizado!", "Sucesso!", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormLivro tela;
                tela = new FormLivro();    
                tela.setLocationRelativeTo(null);
                tela.setTitle("Livro");
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<Object> jListAutores;
    private javax.swing.JList<Object> jListCategorias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}