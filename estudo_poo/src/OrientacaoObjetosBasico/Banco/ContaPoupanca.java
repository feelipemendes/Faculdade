/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetosBasico.Banco;

/**
 *
 * @author felip
 */
public class ContaPoupanca extends Conta{
    
    @Override
    public void atualiza(double taxa){
        super.atualiza((taxa) * 3);
    }
    
}
