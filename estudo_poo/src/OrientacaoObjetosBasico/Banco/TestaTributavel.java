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
public class TestaTributavel {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.deposita(1000);

        System.out.println("Calcular tributos: \n" + cc.calcularTributos());

        Tributavel c = cc;
        System.out.println(c.calcularTributos());

    }

}
