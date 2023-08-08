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
}