package DAO;

// DAO = Data Access Object
// As classes DAO manipulam os objetos instanciados a partir das classes Modelo
// Elas são responsáveis por criar, manipular e deletar os objetos armazenados nas listas de dados

import Modelo.Funcionario;
// import java.util.ArrayList;

public interface DAOInterface {
    
    // Adiciona um funcionário à lista de funcionários
    public void incluir(Funcionario novoFuncionario);
    
    // Localiza um funcionário na lista de funcionários
    public Funcionario localizar(int id);
    
    // Atualiza as informações de um funcionário
    public void atualizar(Funcionario funcionario);
    
    // Remove um funcionário da lista de funcionários
    public void remover(Funcionario funcionario);
    
    // Pega a lista de funcionários
    // public ArrayList<Funcionario> getLista();
}