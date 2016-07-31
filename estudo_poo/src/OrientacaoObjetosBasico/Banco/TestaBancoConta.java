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
public class TestaBancoConta {

    public static void main(String[] args) {

        ControleContas controle = new ControleContas(0.05);
        Banco banco = new Banco();

        Conta c = new Conta();
        Conta cc = new Conta();
        
        c.deposita(1000);
        cc.deposita(10000000);
        
        banco.adc(c);
        banco.adc(cc);
        
        for(int i = 0; i < banco.pegaTotalContas(); i++){
            System.out.println("Conta: "+i);
            controle.roda(banco.pegaConta(i));
            
        }
    }

}
