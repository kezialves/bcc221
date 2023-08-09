package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Modelo.Categoria;
import Modelo.Usuario;
import Dados.Dados;

public class DAOUsuario implements DAOInterface {

    @Override
    public void incluir(Object objeto) {
       if(objeto == null)
            throw new IllegalArgumentException() ;
    
        if(!(objeto instanceof Usuario))
            throw new IllegalArgumentException();

        for(Usuario usuario: Dados.listaUsuarios) {
            
            // Compara os ids da lista de autores com o passado por parâmetro
            if(usuario.equals(objeto)) {
                throw new IllegalArgumentException(); // retorna o index do id se achar
            }
        }

        Usuario novoUsuario = (Usuario) objeto;
        Dados.listaUsuarios.add(novoUsuario);
    }

    @Override
    public Object localizar(int id) {

        for(Usuario usuario: Dados.listaUsuarios) {
            
            // Compara os ids da lista de funcionários com o passado por parâmetro
            if(usuario.getId() == id) {
                return usuario; // retorna o index do id se achar
            }
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
    
        if(!(objeto instanceof Usuario))
            throw new IllegalArgumentException();

        Usuario usuario = (Usuario) objeto;
        
        // Usa a função localizar pra saber se o autor está presente na lista
        // Remove se achar
        Dados.listaUsuarios.remove(localizar(usuario.getId()));

    }

    @Override
    public List<Object> getLista() {
               
        List<Object> listaObjeto = new ArrayList<>();
        listaObjeto.addAll(Dados.listaUsuarios);
        return listaObjeto;
    }
    
}
