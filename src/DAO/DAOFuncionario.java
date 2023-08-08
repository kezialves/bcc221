package DAO;

import Modelo.Funcionario;
import java.util.ArrayList;

public class DAOFuncionario implements DAOInterface {
    
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    // String[] colunas = {"ID", "Nome", "Sobrenome", "Matrícula"};
    
    @Override
    public void incluir(Funcionario novoFuncionario) {
        funcionarios.add(novoFuncionario);
    }
    
    @Override
    public Funcionario localizar(int id) {
        return funcionarios.get(id);
    }
    
    // ---------- onde é id devia ser índice? ----------

    @Override
    public void atualizar(Funcionario funcionario) {
        funcionarios.set(funcionario.getId(), funcionario);
    }
    
    @Override
    public void remover(Funcionario funcionario) {
        funcionarios.remove(funcionario.getId());
    }
}