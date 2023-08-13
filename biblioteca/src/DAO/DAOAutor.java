package DAO;

import Modelo.Autor;

import java.util.ArrayList;
import java.util.List;
import Dados.Dados;
import java.util.NoSuchElementException;

public class DAOAutor implements DAOInterface {
    
    @Override
    public void incluir(Object objeto){
        
        if(objeto == null)
            throw new IllegalArgumentException("Erro! Autor nulo!") ;
    
        if(!(objeto instanceof Autor))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é autor!");

        //verificar se o autor já existe pra não ter duplicata
        
        for(Autor autor: Dados.listaAutores){
            if(autor.equals(objeto))
                throw new IllegalArgumentException("Erro! Já existe um autor com esse ID");
        }

        Autor autor = (Autor) objeto;
        Dados.listaAutores.add(autor);
    }

    @Override
    public Object localizar(int id) {
        
        // Percorre o vetor de autores procurando o id
        for(Autor autor: Dados.listaAutores) {
            
            // Compara os ids da lista de autores com o passado por parâmetro
            if(autor.getId() == id) {
                return autor; // retorna o index do id se achar
            }
        }
        
        throw new NoSuchElementException("ID do autor não encontrado!"); // se não achar
    }

    @Override
    public void atualizar(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException("Erro! Autor nulo!");
    
        if(!(objeto instanceof Autor))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é autor!");

        Autor autorAtualizado = (Autor) objeto;
        Autor autor = (Autor) localizar(autorAtualizado.getId());

        Dados.listaAutores.set( Dados.listaAutores.indexOf(autor), autorAtualizado);
    }

    @Override
    public void remover(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException("Erro! Autor nulo!") ;
    
        if(!(objeto instanceof Autor))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é autor!");

        Autor autor = (Autor) objeto;

        // Usa a função localizar pra saber se o autor está presente na lista
        // Remove se achar
        Dados.listaAutores.remove(localizar(autor.getId()));

    }

    @Override
    public List<Object> getLista() {
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaAutores);
        return listaObjeto;
    }    
}