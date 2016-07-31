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
public class ControleContas {
    private double saldoTotal = 0;
    private double selic;
    
    public ControleContas(double selic){
        this.selic = selic;
    }
    
    public void roda(Conta c){
        System.out.println("Saldo anterior: "+c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo Final: "+c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }
    
    public double getSaldoTotal(){
        return this.saldoTotal;
        
    }
}
