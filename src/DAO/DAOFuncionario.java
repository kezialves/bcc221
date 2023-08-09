package DAO;

import Modelo.Funcionario;
import Dados.Dados;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import java.util.NoSuchElementException;
=======
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6

public class DAOFuncionario implements DAOInterface {
    
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    @Override
    public void incluir(Object objeto) {
<<<<<<< HEAD
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

=======
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
        Funcionario novoFuncionario = (Funcionario) objeto;
        funcionarios.add(novoFuncionario);
    }
    
    @Override
<<<<<<< HEAD
    public Object localizar(int id) {
        
        
        // Percorre o vetor de funcionários procurando o id
        for(Funcionario funcionario: Dados.listaFuncionarios) {
            
            // Compara os ids da lista de funcionários com o passado por parâmetro
            if(funcionario.getId() == id) {
                return funcionario; // retorna o index do id se achar
            }
        }

        throw new NoSuchElementException();
        
=======
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
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
    }

    @Override
    public void atualizar(Object antigo, Object novo) {
        //PENSAR
    }
    
    @Override
    public void remover(Object objeto) {
<<<<<<< HEAD

        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Funcionario))
            throw new IllegalArgumentException();

        Funcionario funcionario = (Funcionario) objeto;
        
        // Usa a função localizar pra saber se o autor está presente na lista
        // Remove se achar
        Dados.listaFuncionarios.remove(localizar(funcionario.getId()));
        
=======
        
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
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
    }
    
    @Override
    public List<Object> getLista() {
<<<<<<< HEAD
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaFuncionarios);
        return listaObjeto;
    }    
=======
        return (List<Object>) (Object) Dados.getListaFuncionarios();
    }   
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
}