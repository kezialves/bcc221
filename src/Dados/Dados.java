package Dados;

import Modelo.*;
import java.util.List;
import java.util.ArrayList;

public class Dados {
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
    }
}