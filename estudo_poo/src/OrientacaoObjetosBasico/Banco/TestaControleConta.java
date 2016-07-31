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
public class TestaControleConta {

    public static void main(String[] args) {
        ControleContas controle = new ControleContas(0.01);

        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        System.out.println("Conta: ");
        controle.roda(c);

        System.out.println("Conta C: ");
        controle.roda(cc);

        System.out.println("Conta P : ");
        controle.roda(cp);

        System.out.println("Saldo total: " + controle.getSaldoTotal());

    }
}
