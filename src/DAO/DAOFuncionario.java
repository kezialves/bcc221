package DAO;

import Modelo.Funcionario;
import Dados.Dados;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DAOFuncionario implements DAOInterface {
    
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    @Override
    public void incluir(Object objeto) {
        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Funcionario))
            throw new IllegalArgumentException();

        for(Funcionario funcionario: Dados.listaFuncionarios) {
            
            // Compara os ids da lista de autores com o passado por parâmetro
            if(funcionario.equals(objeto)) {
                throw new IllegalArgumentException(); // retorna o index do id se achar
            }
        }

        Funcionario novoFuncionario = (Funcionario) objeto;
        funcionarios.add(novoFuncionario);
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
        //PENSAR
    }
    
    @Override
    public void remover(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Funcionario))
            throw new IllegalArgumentException();

        Funcionario funcionario = (Funcionario) objeto;
        
        // Usa a função localizar pra saber se o autor está presente na lista
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