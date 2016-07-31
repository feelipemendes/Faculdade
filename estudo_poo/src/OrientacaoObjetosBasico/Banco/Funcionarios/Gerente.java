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
public class Gerente extends Funcionario{
    
    private int senha;
    private int numeroFuncGerenciados;

    public Gerente(int senha) {
        this.senha = senha;
            
    }
    
    @Override
    public double getBonificacoes(){
        return super.getBonificacoes() + 1000;
    }
    
    public void autentica(int senha){
        
        if(this.senha == senha){
            System.out.println("Autenticado");
        }else{
            System.out.println("Senha incorreta, Abortar sistema!");
        }
        
    }
    
}
