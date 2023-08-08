package DAO;

// DAO = Data Access Object
// As classes DAO manipulam os objetos instanciados a partir das classes Modelo
// Elas são responsáveis por criar, manipular e deletar os objetos armazenados nas listas de dados

import java.util.List;

public interface DAOInterface {
    
    // Adiciona um objeto à lista
    public void incluir(Object objeto);
    
    // Localiza um objeto na lista
    public int localizar(int id);
    
    // Atualiza as informações de um objeto
    public void atualizar(Object antigo, Object novo);
    
    // Remove um objeto da lista
    public void remover(Object objeto);
    
    // Pega a lista
    public List<Object> getLista();
}