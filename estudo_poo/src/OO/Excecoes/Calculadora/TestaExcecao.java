/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO.Excecoes.Calculadora;

/**
 *
 * @author felip
 */
public class TestaExcecao {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;
        
        try{
            int divisao = num1 / num2;
            //System.out.println("Resultado da divisao: "+divisao);
        }catch(ArithmeticException e){
            System.out.println("Erro na divisao!!");
        }
       //  int divisao = num1 / num2;
    }
    
    
}
