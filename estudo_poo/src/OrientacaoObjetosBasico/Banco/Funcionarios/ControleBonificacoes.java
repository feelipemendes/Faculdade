/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetosBasico.Banco.Funcionarios;

/**
 *
 * @author felip
 */
public class ControleBonificacoes {
    private double totalBonificacoes;
    
    public void registra(Funcionario f){
        this.totalBonificacoes += f.getBonificacoes();
    }
    
    public double getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
    
    
}
