package Modelo;

public class Funcionario extends Pessoa {
    private int matricula;
    
    // Construtor de funcionário
    public Funcionario(int id, String nome, String sobrenome, int matricula) {
        super(id, nome, sobrenome);
        setMatricula(matricula);
    }
    
    // Setter e getter da matrícula
    
    public final void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getMatricula() {
        return matricula;
    }
}