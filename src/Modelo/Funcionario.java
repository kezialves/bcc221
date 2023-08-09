package Modelo;

public class Funcionario extends Pessoa {
    private int matricula;
    
    // Construtor de funcionário
    public Funcionario(int id, String nome, String sobrenome, int matricula) {
        super(id, nome, sobrenome);
        setMatricula(matricula);
    }
    
    // Getter e setter da matrícula
    
    public int getMatricula() {
        return matricula;
    }    
    
    public final void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object objeto){

        if(this == objeto)
            return true;
        if(objeto == null)
            return false;
        if(getClass() != objeto.getClass())
            return false;
        final Funcionario funcionario = (Funcionario) objeto;
        if(this.getId() != funcionario.getId())
            return false;
        return true;
    }
}