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
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Autor))
            throw new IllegalArgumentException();

        //verificar se o autor já existe pra não ter duplicata
        
        for(Autor autor: Dados.listaAutores){
            if(autor.equals(objeto))
                throw new IllegalArgumentException();
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
        
        throw new NoSuchElementException(); // se não achar
    }

    @Override
    public void atualizar(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Autor))
            throw new IllegalArgumentException();

        Autor autorAtulizado = (Autor) objeto;
        Autor autor = (Autor) localizar(autorAtulizado.getId());
        autor = autorAtulizado;
    }

    @Override
    public void remover(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Autor))
            throw new IllegalArgumentException();

        Autor autor = (Autor) objeto;

        // Usa a função localizar pra saber se o autor está presente na lista

        // Remove se achar
        Dados.listaAutores.remove(localizar(autor.getId()));
        System.out.println("Autor removido com sucesso!");

    }

    @Override
    public List<Object> getLista() {
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaAutores);
        return listaObjeto;
    }    
}