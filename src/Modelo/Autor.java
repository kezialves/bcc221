package Modelo;

public class Autor extends Pessoa {
    private String biografia;
    
    // Construtor de autor
    public Autor(int id, String nome, String sobrenome, String biografia) {
        super(id, nome, sobrenome);
        setBiografia(biografia);
    }
    
    // Getter e setter da biografia
    
    public String getBiografia() {
        return biografia;
    }
    
    public final void setBiografia(String biografia) {
        this.biografia = biografia;
    }
<<<<<<< HEAD

    @Override
    public boolean equals(Object objeto){

        if(this == objeto)
            return true;
        if(objeto == null)
            return false;
        if(getClass() != objeto.getClass())
            return false;
        final Autor autor = (Autor) objeto;
        if(this.getId() != autor.getId())
            return false;
        return true;
    }
=======
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
}