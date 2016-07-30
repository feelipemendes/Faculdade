/*
 * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetosBasico.Banco;

/**
 *
 * @author Luiz
 */
public class testeConta {

    public static void main(String[] args) {
        //Já recebe os clientes e seus numeros de conta
        Conta minhaConta = new Conta(new Cliente("Felipe", "122.222.111/25"), 123);
        Conta maeConta = new Conta(new Cliente("Maria", "322.322.151/25"), 321);

        //Saldo no inicio do mes
        minhaConta.setSaldo(1000);
        System.out.println("Nº da conta: " + minhaConta.getNumero() + " \n" + minhaConta);
        //Tirei 200 reais pra pagar as contas, mas e se eu nao tiver esse dinheiro?
        if (minhaConta.saca(2000)) {
            System.out.println("Saque efetuado!");
        } else {
            System.out.println("Erro - Saldo Limite abaixo! ");
        }

        System.out.println(minhaConta+"\n"); //show saldo
        //Ganhei nas raspadinha
        minhaConta.deposita(20000);
        System.out.println(minhaConta+"\n");//To rico!

        maeConta.setSaldo(2000);
        System.out.println("Nº da conta: " + maeConta.getNumero() + " \n" + maeConta);

        //Mae me da dinheiro?
        if (maeConta.transferePara(minhaConta, 20)) {
            System.out.println("\n\nSucesso!\n\n");
        } else {
            System.out.println("Não transferido");
        }

        System.out.println("ATUALIZANDO \n\n");
        System.out.println("Nº da conta: " + minhaConta.getNumero() + " \n" + minhaConta+"\n");
        System.out.println("Nº da conta: " + maeConta.getNumero() + " \n" + maeConta);

    }

}
