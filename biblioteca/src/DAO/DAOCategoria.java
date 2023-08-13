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
            throw new IllegalArgumentException("Erro! Categoria nula!");
    
        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é uma categoria!");

        for(Categoria categoria: Dados.listaCategorias) {
            
            // Compara os ids da lista de categorias com o passado por parâmetro
            if(categoria.equals(objeto)) {
                throw new IllegalArgumentException("Já existe uma categoria com esse ID."); 
            }
        }

        Categoria novaCategoria = (Categoria) objeto;
        Dados.listaCategorias.add(novaCategoria);
    }

    @Override
    public Object localizar(int id) {

       for(Categoria categoria: Dados.listaCategorias) {
            
            // Compara os ids da lista de categorias com o passado por parâmetro
            if(categoria.getId() == id) {
                return categoria; // retorna o index do id se achar
            }
        }

        throw new NoSuchElementException("ID da categoria não encontrado!");
    }

    @Override
    public void atualizar(Object objeto) {
        
        if(objeto == null)
            throw new IllegalArgumentException("Erro! Categoria nula!");
    
        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é uma categoria!");

        Categoria categoriaAtualizado = (Categoria) objeto;
        Categoria categoria = (Categoria) localizar(categoriaAtualizado.getId());
        
        Dados.listaCategorias.set(Dados.listaCategorias.indexOf(categoria), categoriaAtualizado);

    }

    @Override
    public void remover(Object objeto) {

        if(objeto == null)
            throw new IllegalArgumentException("Erro! Categoria nula!") ;
    
        if(!(objeto instanceof Categoria))
            throw new IllegalArgumentException("Erro! Você está tentando adicionar um objeto que não é uma categoria!");

        Categoria categoria = (Categoria) objeto;
        
        // Usa a função localizar pra saber se a categoria está presente na lista
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