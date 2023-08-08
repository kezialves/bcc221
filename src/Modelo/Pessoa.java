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
}