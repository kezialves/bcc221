 /*
 *
 * Bruno Alves Braga
 * Jéssica Machado
 * Kézia Batista Alves da Conceição Brito
 * Vitor Oliveira Diniz
 * 
 */

package Principal;

import Telas.*;
import DAO.*;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        
        criaBaseTeste();

        FormMain telaPrincipal = new FormMain();

        telaPrincipal.setTitle("Menu");
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
    }

    public static void criaBaseTeste() {
    
        DAOAutor daoAutor = new DAOAutor();
        DAOFuncionario daoFuncionario = new DAOFuncionario();
        DAOUsuario daoUsuario = new DAOUsuario();
        DAOCategoria daoCategoria = new DAOCategoria();

        daoAutor.incluir(new Autor(1, "Vitor", "Diniz", "A chefe do grupo"));
        daoAutor.incluir(new Autor(2, "Kézia", "Alves", "Aquele que obedece"));
        
        daoFuncionario.incluir(new Funcionario(1, "Jéssica", "Machado", 3));
        
        daoUsuario.incluir(new Usuario(1, "Bruno", "Braga", 4571));

        daoCategoria.incluir(new Categoria(1, "Veganismo"));
    }
}