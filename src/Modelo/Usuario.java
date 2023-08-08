package Modelo;

public class Usuario extends Pessoa {
    private int registroAcademico;
    
    // Construtor de usuário
    public Usuario(int id, String nome, String sobrenome, int registroAcademico) {
        super(id, nome, sobrenome);
        setRegistroAcademico(registroAcademico);
    }
    
    // Setter e getter do registro acadêmico
    
    public final void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    
    public int getRegistroAcademico() {
        return registroAcademico;
    }
}