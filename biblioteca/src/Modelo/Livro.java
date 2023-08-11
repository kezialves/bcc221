package Modelo;

import java.util.List;
import java.util.ArrayList;
import Dados.Dados;

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
        
        for(Livro livro: Dados.listaLivros){
            stringAutores = stringAutores + livro.getAutor() + " ";
            stringCategorias = stringCategorias + livro.getCategoria() + " ";
        }
        
        return getId() + " - " + getTitulo() + ":\n\t" + 
                "Autores: " + stringAutores +
                "Categorias: " + stringCategorias + "\n";
    }
}