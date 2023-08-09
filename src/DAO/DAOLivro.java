package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Dados.Dados;
import Modelo.Categoria;
import Modelo.Livro;

public class DAOLivro implements DAOInterface{

    @Override
     public void incluir(Object objeto) {
        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException();

        for(Livro livro: Dados.listaLivros) {
            
            // Compara os ids da lista de autores com o passado por parâmetro
            if(livro.equals(objeto)) {
                throw new IllegalArgumentException(); // retorna o index do id se achar
            }
        }

        Livro novoLivro = (Livro) objeto;
        Dados.listaLivros.add(novoLivro);

    }

    @Override
    public Object localizar(int id) {

        for (Livro livro: Dados.listaLivros){
            if (livro.getId() == id)
                return livro;
        }

                throw new NoSuchElementException();

    }

    @Override
    public void atualizar(Object objeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void remover(Object objeto) {
        if(objeto == null)
            throw new IllegalArgumentException() ;

        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException();

    Livro livro = (Livro) objeto;
    
    // Usa a função localizar pra saber se o autor está presente na lista
    // Remove se achar
    Dados.listaLivros.remove(localizar(livro.getId()));
    }

    @Override
    public List<Object> getLista() {
        
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaLivros);
        return listaObjeto;
    }

    
}
