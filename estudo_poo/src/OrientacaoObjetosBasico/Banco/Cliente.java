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
public class Cliente {

    private String nome;
    private String sobreNome;
    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "NOME: " + nome + " CPF: " + cpf + " "; //To change body of generated methods, choose Tools | Templates.
    }

}
