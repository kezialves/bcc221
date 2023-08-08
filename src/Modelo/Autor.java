package Modelo;

public class Autor extends Pessoa {
    private String biografia;
    
    // Construtor de autor
    public Autor(int id, String nome, String sobrenome, String biografia) {
        super(id, nome, sobrenome);
        setBiografia(biografia);
    }
    
    // Setter e getter da biografia
    
    public final void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
    public String getBiografia() {
        return biografia;
    }
}