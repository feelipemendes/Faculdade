/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetos.ClassesAbstratas.Funcionarios;

import OrientacaoObjetosBasico.Banco.Funcionarios.*;

/**
 *
 * @author felip
 */
public class Gerente extends Funcionario{
    
    private int senha;
    private int numeroFuncGerenciados;


    @Override
    public double getBonificacoes(){
        return this.salario *= 1.4 + 1000;
    }

    
}
