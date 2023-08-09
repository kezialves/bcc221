package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Livro {
    private int id;
    private String titulo;
    private List<Categoria> listaCategorias;
    private List<Autor> listaAutores;
    
    // Construtor de livro
    public Livro(int id, String titulo, List<Categoria> categoria, List<Autor> autor) {
        this.id = id;
        this.titulo = titulo;
        this.listaCategorias = new ArrayList<>();
        this.listaAutores = new ArrayList<>();

    }
    
    // Getter e setter do id
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // Getter e setter do título

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Getter e setter da(s) categoria(s)

    public List<Categoria> getCategoria() {
        return listaCategorias;
    }
    
    public void setCategoria(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    
    // Getter e setter do(s) autor(es)
    
    public List<Autor> getAutor() {
        return listaAutores;
    }

    public void setAutor(List<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }
}