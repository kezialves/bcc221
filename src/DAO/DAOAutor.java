package DAO;

import Modelo.Autor;
import java.util.List;
import Dados.Dados;

public class DAOAutor implements DAOInterface {
    
    @Override
    public void incluir(Object objeto) {
        
        //verificar se o autor já existe pra não ter duplicata

        Autor autor = (Autor) objeto;
        List<Autor> listaAutores = Dados.getListaAutores();
        listaAutores.add(autor);
    }

    @Override
    public int localizar(int id) {
        
        List<Autor> listaAutores = Dados.getListaAutores(); 
        
        // Percorre o vetor de autores procurando o id
        for(int i = 0; i < listaAutores.size(); i++) {
            
            // Compara os ids da lista de autores com o passado por parâmetro
            if(listaAutores.get(id).getId() == id) {
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
        
        Autor autor = (Autor) objeto;
        List<Autor> listaAutores = Dados.getListaAutores();
        
        // Usa a função localizar pra saber se o autor está presente na lista
        int id = localizar(autor.getId());
        
        // Informa erro caso não ache o autor
        if(id == -1) {
            throw new Error("Autor não encontrado!");
        }
        
        // Remove se achar
        else {
            listaAutores.remove(id);
            System.out.println("Autor removido com sucesso!");
        }
    }

    @Override
    public List<Object> getLista() {
        return (List<Object>) (Object) Dados.getListaAutores();
    }    
}