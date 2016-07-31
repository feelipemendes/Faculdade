/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Interfaces.Funcionario;

import OrientacaoObjetosBasico.Banco.Funcionarios.*;

/**
 *
 * @author felip
 */
public class Gerente extends Funcionario implements Autenticavel{
    
    private int numeroFuncGerenciados;

//    public Gerente(int senha) {
//        this.senha = senha;
//            
//    }
    
    public double getBonificacoes(){
        return this.salario * 0.015 + 1000;
    }

    @Override
    public boolean autentica(int senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
