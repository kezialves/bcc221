package Modelo;

public class Categoria {
    private int id;
    private String titulo;
    
    // Construtor de categoria
    public Categoria(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
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
}