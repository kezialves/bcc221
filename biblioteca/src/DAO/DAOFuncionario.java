package DAO;

import Modelo.Funcionario;
import Dados.Dados;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DAOFuncionario implements DAOInterface {
    
    @Override
    public void incluir(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException("Erro! Funcionário nulo!") ;
    
        if(!(objeto instanceof Funcionario))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é um funcionário!");

        if(!Dados.listaFuncionarios.isEmpty()){

            for(Funcionario funcionario: Dados.listaFuncionarios) {
            
                // Compara os ids da lista de funcionario com o passado por parâmetro
                if(funcionario.equals(objeto)) {
                    throw new IllegalArgumentException("Erro! O funcionário já está presente na lista!"); // retorna o index do id se achar
                }
            }
        }

        Funcionario novoFuncionario = (Funcionario) objeto;
        Dados.listaFuncionarios.add(novoFuncionario);
    }
    
    @Override
    public Object localizar(int id) {
        
        // Percorre o vetor de funcionários procurando o id
        for(Funcionario funcionario: Dados.listaFuncionarios) {
            
            // Compara os ids da lista de funcionários com o passado por parâmetro
            if(funcionario.getId() == id) {
                return funcionario; // retorna o index do id se achar
            }
        }

        throw new NoSuchElementException();
    }

    @Override
    public void atualizar(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException();
    
        if(!(objeto instanceof Funcionario))
            throw new IllegalArgumentException();

        Funcionario funcionarioAtualizado = (Funcionario) objeto;
        Funcionario funcionario = (Funcionario) localizar(funcionarioAtualizado.getId());
        
        Dados.listaFuncionarios.set( Dados.listaFuncionarios.indexOf(funcionario), funcionarioAtualizado);
    }
    
    @Override
    public void remover(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Funcionario))
            throw new IllegalArgumentException();

        Funcionario funcionario = (Funcionario) objeto;
        
        // Usa a função localizar pra saber se o funcionário está presente na lista
        // Remove se achar
        Dados.listaFuncionarios.remove(localizar(funcionario.getId()));
    }
    
    @Override
    public List<Object> getLista() {
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaFuncionarios);
        return listaObjeto;
    }    
}