package Principal;

import DAO.*;
import Dados.Dados;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        
        // Dados dados;

        Funcionario vitor = new Funcionario(1, "Vitor", "Lopes", 2214107);
        Funcionario kézia = new Funcionario(2, "Kézia", "Alves", 2214026);
        Funcionario bruno = new Funcionario(3, "Bruno", "Alves", 2214029);
        Funcionario jesca = new Funcionario(4, "Jesca", "Macha", 2214099);
        Funcionario brazz = new Funcionario(5, "Felip", "Brazz", 2214030);

        DAOFuncionario daoFuncionario = new DAOFuncionario();
        daoFuncionario.incluir(vitor);
        daoFuncionario.incluir(kézia);
        daoFuncionario.incluir(bruno);
        daoFuncionario.incluir(jesca);

        daoFuncionario.remover(kézia);

        for(Object objeto: daoFuncionario.getLista()){
            Funcionario funcionario = (Funcionario) objeto;
            System.out.println(funcionario);
        }

        try{
            System.out.println("ACHOOU: " + daoFuncionario.localizar(1));

        } catch (Exception e){
            System.out.println("Exceção: " + e);
        }

        try{
           daoFuncionario.atualizar(brazz);
           for(Object objeto: daoFuncionario.getLista()){
                Funcionario funcionario = (Funcionario) objeto;
                System.out.println(funcionario);
            }

        } catch (Exception e){
            System.out.println("Exceção BRAZZ: " + e);
        }
    }
}