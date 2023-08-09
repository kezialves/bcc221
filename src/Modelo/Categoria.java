package Modelo;

public class Categoria {
    private int id;
    private String titulo;
    
    // Construtor de categoria
    public Categoria(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
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

    @Override
    public boolean equals(Object objeto){

        if(this == objeto)
            return true;

        if(objeto == null)
            return false;

        if(getClass() != objeto.getClass())
            return false;

        final Categoria categoria = (Categoria) objeto;

        if(this.getId() != categoria.getId())
            return false;

        return true;
    }

    @Override
    public String toString(){
        return getId() + "\n Título: " + getTitulo();
    }
}