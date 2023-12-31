package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Livro {
    private int id;
    private String titulo;
    private List<Categoria> listaCategorias;
    private List<Autor> listaAutores;
    
    // Construtor de livro
    public Livro(int id, String titulo, Categoria categoria, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.listaCategorias = new ArrayList<>();
        listaCategorias.add(categoria);
        this.listaAutores = new ArrayList<>();
        listaAutores.add(autor);
    }

    public Livro(int id, String titulo, List<Categoria> categorias, List<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.listaCategorias = categorias;
        this.listaAutores = autores;
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

    @Override
    public boolean equals(Object objeto){

        if(this == objeto)
            return true;

        if(objeto == null)
            return false;

        if(getClass() != objeto.getClass())
            return false;

        final Livro livro = (Livro) objeto;

        if(this.getId() != livro.getId())
            return false;
            
        return true;
    }

    public String toString(){
        
        String stringAutores = "";
        String stringCategorias = "";
        
        for(Autor autor: this.getAutor()){
            stringAutores = stringAutores + autor + " ";
        }

        for(Categoria categoria: this.getCategoria()){
            stringCategorias = stringCategorias + categoria + " ";
        }

        return getId() + " - " + getTitulo() + ":\n\t" + 
                "Autor(es): " + stringAutores +
                "\nCategoria(s): " + stringCategorias + "\n";
    }
}