package Modelo;

import java.util.*;

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
    
    // Setter e getter do id do empréstimo
    
    public final void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    // Setter e getter do id do funcionário
    
    public final void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    public int getIdFuncionario() {
        return idFuncionario;
    }
    
    // Setter e getter do id do usuário
    
    public final void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }
    
    // Setter e getter do id do livro
    
    public final void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    
    public int getILivro() {
        return idLivro;
    }
    
    // Setter e getter da data do empréstimo
    
    public final void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
}