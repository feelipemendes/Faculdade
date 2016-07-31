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
public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(333);
        gerente.setSalario(5000);
        
        Funcionario f1 = new Funcionario();
        f1.setSalario(740);
        
        ControleBonificacoes cb = new ControleBonificacoes();
        
        cb.registra(gerente);
        cb.registra(f1);
        
        System.out.println("Total de bonificacoes: "+cb.getTotalBonificacoes());
        
        //gerente.autentica(333);
        System.out.println("Bonificacoes do gerente: "+gerente.getBonificacoes());
        System.out.println("Bonificacoes do f1: "+f1.getBonificacoes());
        
    }
}
