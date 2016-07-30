/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetosBasico.Banco;

/**
 *
 * @author Luiz
 */
public class Conta {

    private int numero;
    private String dono;
    private double saldo;
    private double limite;
    private Cliente titular = new Cliente();

    public Conta() {
    }

    public Conta(Cliente c, int numConta) {
        this.titular = c;
        this.numero = numConta;        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return titular + " seu saldo em conta é: $" + saldo; //To change body of generated methods, choose Tools | Templates.
    }

    public boolean saca(double quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
            return true;
        } else {
            return false;
        }

    }

    public void deposita(double quantia) {
        this.saldo += quantia;
    }

    //Deposita uma quantia aqui
    public boolean transferePara(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        } else {
            return false;
        }

    }

}
