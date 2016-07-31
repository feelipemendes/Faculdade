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
public class TestaBancoFunc {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("GE", "1223.666/96", 3);
        Funcionario f1 = new Funcionario("Fernando", 5000);
        Funcionario f2 = new Funcionario("Amanda", 50020);
      
        empresa.adiciona(f1);
        empresa.adiciona(f2);
        
        System.out.println(empresa + "Lista de funcionarios");
      //  empresa.listaFunc();
        
        empresa.mostrarGanhoAnualFuncionarios();
        
        System.out.println("---------------------------------");
        System.out.println(empresa.funcionarios[0]);
        
//        
//        System.out.println("Antes do aumento: " + f1);
//        f1.aumentaSalario(100);
//        System.out.println("Depois do aumento: " + f1);
//
//        System.out.println("Comparando funcionarios: ");
//        
//        if(f1.equals(f2)){
//            System.out.println("iguais");
//        }else{
//            System.out.println("Diferentes");
//        }
        
        System.out.println("TESTE PESSOA FISICA \n\n");
        PessoaFisica pessoaFisica = new PessoaFisica("Felipe", "1390927395");
        System.out.println(pessoaFisica);
    }

}
