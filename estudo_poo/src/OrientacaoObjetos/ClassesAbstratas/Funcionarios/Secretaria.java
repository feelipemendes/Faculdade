/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetos.ClassesAbstratas.Funcionarios;

/**
 *
 * @author felip
 */
public class Secretaria extends Funcionario{
    
    private String dept;
    private int matricula;

    @Override
    public double getBonificacoes() {
        return this.salario + 100;
    }
    
    
}
