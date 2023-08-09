package Dados;

import Modelo.*;
import java.util.List;
import java.util.ArrayList;

public class Dados {
<<<<<<< HEAD
    public static List<Funcionario> listaFuncionarios;
    public static List<Usuario> listaUsuarios;
    public static List<Autor> listaAutores;
    public static List<Livro> listaLivros;
    public static List<Categoria> listaCategorias;
    public static List<Emprestimo> listaEmprestimos;

    // Construtor de dados
    public Dados() {
        listaFuncionarios = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
        listaAutores = new ArrayList<>();
        listaLivros = new ArrayList<>();
        listaCategorias = new ArrayList<>();
        listaEmprestimos = new ArrayList<>();
=======
    private static List<Funcionario> listaFuncionarios;
    private static List<Usuario> listaUsuarios;
    private static List<Autor> listaAutores;
    private static List<Livro> listaLivros;
    private static List<Categoria> listaCategorias;
    private static List<Emprestimo> listaEmprestimos;

    // Construtor de dados
    public Dados() {
        this.listaFuncionarios = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
        this.listaAutores = new ArrayList<>();
        this.listaLivros = new ArrayList<>();
        this.listaCategorias = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
    }
    
    // Getter e setter da lista de funcionários

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }
    
    public static void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        Dados.listaFuncionarios = listaFuncionarios;
    }

    // Getter e setter da lista de usuários
    
    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> listaUsuarios) {
        Dados.listaUsuarios = listaUsuarios;
    }
    
    // Getter e setter da lista de autores

    public static List<Autor> getListaAutores() {
        return listaAutores;
    }

    public static void setListaAutores(List<Autor> listaAutores) {
        Dados.listaAutores = listaAutores;
    }

    // Getter e setter da lista de livros
    
    public static List<Livro> getListaLivros() {
        return listaLivros;
    }

    public static void setListaLivros(List<Livro> listaLivros) {
        Dados.listaLivros = listaLivros;
    }

    // Getter e setter da lista de categorias
    
    public static List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public static void setListaCategorias(List<Categoria> listaCategorias) {
        Dados.listaCategorias = listaCategorias;
    }
    
    // Getter e setter da lista de empréstimos

    public static List<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public static void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
        Dados.listaEmprestimos = listaEmprestimos;
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
    }
}