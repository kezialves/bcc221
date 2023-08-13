package DAO;

import Modelo.Emprestimo;
import Dados.Dados;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class DAOEmprestimo implements DAOInterface {

	@Override
	public void incluir(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException("Erro! Empréstimo nulo!") ;
    
        if(!(objeto instanceof Emprestimo))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é um empréstimo!");

        for(Emprestimo emprestimo: Dados.listaEmprestimos) {
            
            // Compara os ids da lista de empréstimos com o passado por parâmetro
            if(emprestimo.equals(objeto)) {
                throw new IllegalArgumentException("Erro! já existe um emprestimo com esse ID."); // retorna o index do id se achar
            }
        }

        Emprestimo novoEmprestimo = (Emprestimo) objeto;
        Dados.listaEmprestimos.add(novoEmprestimo);
    }

	@Override
    public Object localizar(int id) {

       for(Emprestimo emprestimo: Dados.listaEmprestimos) {
            
            // Compara os ids da lista de empréstimos com o passado por parâmetro
            if(emprestimo.getId() == id) {
                return emprestimo; // retorna o index do id se achar
            }
        }

        throw new NoSuchElementException("ID do empréstimo não encontrado!");
    }

	@Override
	public void atualizar(Object objeto) {
        
		if(objeto == null)
            throw new IllegalArgumentException();
    
        if(!(objeto instanceof Emprestimo))
            throw new IllegalArgumentException();

        Emprestimo emprestimoAtualizado = (Emprestimo) objeto;
        Emprestimo emprestimo = (Emprestimo) localizar(emprestimoAtualizado.getId());
        
        Dados.listaEmprestimos.set( Dados.listaEmprestimos.indexOf(emprestimo), emprestimoAtualizado);
	}

	@Override
	public void remover(Object objeto) {
        
		if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Emprestimo))
            throw new IllegalArgumentException();

        Emprestimo emprestimo = (Emprestimo) objeto;
        
        // Usa a função localizar pra saber se o emprestimo está presente na lista
        // Remove se achar
        Dados.listaEmprestimos.remove(localizar(emprestimo.getId()));
    }

	@Override
    public List<Object> getLista() {
        
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaEmprestimos);
        
        return listaObjeto;
    }
}