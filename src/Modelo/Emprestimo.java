package Modelo;

import java.util.Date;

public class Emprestimo {
    private int id;
    private int idFuncionario;
    private int idUsuario;
    private int idLivro;
    private Date dataEmprestimo;
    
    // Construtor de empréstimo
    public Emprestimo(int id, int idFuncionario, int idUsuario, int idLivro, Date dataEmprestimo) {
        setId(id);
        setIdFuncionario(idFuncionario);
        setIdUsuario(idUsuario);
        setIdLivro(idLivro);
        setDataEmprestimo(dataEmprestimo);
    }
    
    // Getter e setter do id do empréstimo

    public int getId() {
        return id;
    }    
    
    public final void setId(int id) {
        this.id = id;
    }
    
    // Getter e setter do id do funcionário
    
    public int getIdFuncionario() {
        return idFuncionario;
    }
    
    public final void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    // Getter e setter do id do usuário
 
    public int getIdUsuario() {
        return idUsuario;
    }    
    
    public final void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    // Getter e setter do id do livro
    
    public int getILivro() {
        return idLivro;
    }    
    
    public final void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    
    // Getter e setter da data do empréstimo
    
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    
    public final void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
}