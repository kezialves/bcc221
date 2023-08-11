package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Dados.Dados;
import Modelo.Categoria;

public class DAOCategoria implements DAOInterface {

    @Override
    public void incluir(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException();

        for(Categoria categoria: Dados.listaCategorias) {
            
            // Compara os ids da lista de autores com o passado por parâmetro
            if(categoria.equals(objeto)) {
                throw new IllegalArgumentException(); // retorna o index do id se achar
            }
        }

        Categoria novaCategoria = (Categoria) objeto;
        Dados.listaCategorias.add(novaCategoria);
    }

    @Override
    public Object localizar(int id) {

       for(Categoria categoria: Dados.listaCategorias) {
            
            // Compara os ids da lista de funcionários com o passado por parâmetro
            if(categoria.getId() == id) {
                return categoria; // retorna o index do id se achar
            }
        }

        throw new NoSuchElementException();
    }

    @Override
    public void atualizar(Object objeto) {
        
        if(objeto == null)
            throw new IllegalArgumentException();
    
        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException();

        if(!Dados.listaFuncionarios.isEmpty()){

            for(Categoria categoria: Dados.listaCategorias) {
            
                // Compara os ids da lista de autores com o passado por parâmetro
                if(categoria.equals(objeto)) {
                    throw new IllegalArgumentException(); // retorna o index do id se achar
                }
            }
        }

        Categoria categoriaAtualizado = (Categoria) objeto;
        Categoria categoria = (Categoria) localizar(categoriaAtualizado.getId());
        
        Dados.listaCategorias.set(Dados.listaCategorias.indexOf(categoria), categoriaAtualizado);

    }

    @Override
    public void remover(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException();

        Categoria categoria = (Categoria) objeto;
        
        // Usa a função localizar pra saber se o autor está presente na lista
        // Remove se achar
        Dados.listaCategorias.remove(localizar(categoria.getId()));
    }

    @Override
    public List<Object> getLista() {
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaCategorias);
        return listaObjeto;
    }    
}