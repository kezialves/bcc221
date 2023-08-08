package DAO;

import Modelo.Funcionario;
import Dados.Dados;
import java.util.ArrayList;
import java.util.List;

public class DAOFuncionario implements DAOInterface {
    
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    @Override
    public void incluir(Object objeto) {
        Funcionario novoFuncionario = (Funcionario) objeto;
        funcionarios.add(novoFuncionario);
    }
    
    @Override
    public int localizar(int id) {
        
        List<Funcionario> listaFuncionarios = Dados.getListaFuncionarios(); 
        
        // Percorre o vetor de funcionários procurando o id
        for(int i = 0; i < listaFuncionarios.size(); i++) {
            
            // Compara os ids da lista de funcionários com o passado por parâmetro
            if(listaFuncionarios.get(id).getId() == id) {
                return i; // retorna o index do id se achar
            }
        }
        
        return -1; // se não achar
    }

    @Override
    public void atualizar(Object antigo, Object novo) {
        //PENSAR
    }
    
    @Override
    public void remover(Object objeto) {
        
        Funcionario funcionario = (Funcionario) objeto;
        List<Funcionario> listaFuncionarios = Dados.getListaFuncionarios();
        
        // Usa a função localizar pra saber se o autor está presente na lista
        int id = localizar(funcionario.getId());
        
        // Informa erro caso não ache o autor
        if(id == -1) {
            throw new Error("Funcionário não encontrado!");
        }
        
        // Remove se achar
        else {
            listaFuncionarios.remove(id);
            System.out.println("Funcionário removido com sucesso!");
        }
    }
    
    @Override
    public List<Object> getLista() {
        return (List<Object>) (Object) Dados.getListaFuncionarios();
    }   
}