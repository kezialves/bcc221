package Modelo;

public class Pessoa {
    private int id;
    private String nome;
    private String sobrenome;
    
    // Construtor de pessoa
    public Pessoa(int id, String nome, String sobrenome) {
        setId(id);
        setNome(nome);
        setSobrenome(sobrenome);
    }
    
    // Getter e setter do id
 
    public int getId() {
        return id;
    }
    
    public final void setId(int id) {
        this.id = id;
    }
    
    // Getter e setter do nome
    
    public String getNome() {
        return nome;
    }    
    
    public final void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter e setter do sobrenome
    
    public String getSobrenome() {
        return sobrenome;
    }    
    
    public final void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public boolean equals(Object objeto){

        if(this == objeto)
            return true;

        if(objeto == null)
            return false;

        if(getClass() != objeto.getClass())
            return false;

        final Pessoa pessoa = (Pessoa) objeto;

        if(this.getId() != pessoa.getId())
            return false;
            
        return true;
    }

    public String toString(){
        return getId() + " - " + getSobrenome().toUpperCase() + ", " + getNome();
    }
}