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
public class Banco {

    private Conta[] contas = new Conta[4];

    public void adc(Conta c) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] == null) {
                contas[i] = c;
                break;
            }
        }
    }

    public Conta pegaConta(int x) {

        return contas[x];

    }

    public int pegaTotalContas() {
        int cont = 0;
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] != null) {
                cont++;
            }
        }
        return cont;
    }

}
