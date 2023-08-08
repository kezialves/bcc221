package Modelo;

import java.util.List;

public class Livro {
    private int id;
    private String titulo;
    private List<Categoria> categoria;
    private List<Autor> autor;
    
    // Construtor do livro
    public Livro(int id, String titulo, List<Categoria> categoria, List<Autor> autor) {
        this.id = id;
        this.titulo = titulo;
//        this.categoria = categoria;
//        this.autor = autor;
    }
    
    // Setter e getter do id
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    // Setter e getter do título
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
//    // Setter e getter da(s) categoria(s)
//    
//    public void setCategoria(List<Categoria> categoria) {
//        this.categoria = categoria;
//    }
//    
//    public List<String> getCategoria() {
//        return categoria;
//    }
//    
//    // Setter e getter do(s) autor(es)
//    
//    public void setAutor(List<Autor> autor) {
//        this.autor = autor;
//    }
//    
//    public List<String> getAutor() {
//        return autor;
//    }
}