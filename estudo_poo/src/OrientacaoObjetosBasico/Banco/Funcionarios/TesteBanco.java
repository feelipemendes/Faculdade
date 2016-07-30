/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrientacaoObjetosBasico.Banco.Funcionarios;

/**
 *
 * @author Luiz
 */
public class TesteBanco {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fernando", 5000);
        Funcionario f2 = new Funcionario("Amanda", 5000);
      
        
        System.out.println("Antes do aumento: " + f1);
        f1.aumentaSalario(100);
        System.out.println("Depois do aumento: " + f1);

        System.out.println("Comparando funcionarios: ");
        
        if(f1.equals(f2)){
            System.out.println("iguais");
        }else{
            System.out.println("Diferentes");
        }
        
    }

}
