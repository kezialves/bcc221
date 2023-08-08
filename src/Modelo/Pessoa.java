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
    
    // Setter e getter do id
    
    public final void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    // Setter e getter do nome
    
    public final void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    // Setter e getter do sobrenome
    
    public final void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
}