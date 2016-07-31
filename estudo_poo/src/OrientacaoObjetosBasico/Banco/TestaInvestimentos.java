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
public class TestaInvestimentos {

    public static void main(String[] args) {
        
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c.atualiza(10);
        cp.atualiza(10);
        cc.atualiza(10);
        
        System.out.println("Saldo em conta normal: "+c.getSaldo()+"\nSaldo na poupança: "+cp.getSaldo()+"\nSaldo na Concorrente: "+cc.getSaldo());
    }

}
