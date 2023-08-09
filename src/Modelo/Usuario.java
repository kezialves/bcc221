package Modelo;

public class Usuario extends Pessoa {
    private int registroAcademico;
    
    // Construtor de usuário
    public Usuario(int id, String nome, String sobrenome, int registroAcademico) {
        super(id, nome, sobrenome);
        setRegistroAcademico(registroAcademico);
    }
    
    // Getter e setter do registro acadêmico
    
    public int getRegistroAcademico() {
        return registroAcademico;
    }    
    
    public final void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
}