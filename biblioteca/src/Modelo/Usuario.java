package Modelo;

public class Usuario extends Pessoa {
    
    private int registroAcademico;

    // Construtor de usuário
    public Usuario(int id, String nome, String sobrenome, int registroAcademico) {
        super(id, nome, sobrenome);
        setRegistroAcademico(registroAcademico);
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }    
    
    public final void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    @Override
    public boolean equals(Object objeto){

        if(this == objeto)
            return true;

        if(objeto == null)
            return false;

        if(getClass() != objeto.getClass())
            return false;

        final Usuario usuario = (Usuario) objeto;

        if(this.getId() != usuario.getId())
            return false;

        return true;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}