package DAO;

import Modelo.Autor;
<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;
import Dados.Dados;
import java.util.NoSuchElementException;

=======
import java.util.List;
import Dados.Dados;
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6

public class DAOAutor implements DAOInterface {
    
    @Override
<<<<<<< HEAD
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
=======
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
    
        if(!(objeto instanceof Autor))
            throw new IllegalArgumentException();

        Autor autor = (Autor) objeto;

        // Usa a função localizar pra saber se o autor está presente na lista

        // Remove se achar
        Dados.listaAutores.remove(localizar(autor.getId()));
        System.out.println("Autor removido com sucesso!");

=======
        
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
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
    }

    @Override
    public List<Object> getLista() {
<<<<<<< HEAD
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaAutores);
        return listaObjeto;
=======
        return (List<Object>) (Object) Dados.getListaAutores();
>>>>>>> 05cece1ad04bf40fcfc51be6d4321e0b85f199e6
    }    
}