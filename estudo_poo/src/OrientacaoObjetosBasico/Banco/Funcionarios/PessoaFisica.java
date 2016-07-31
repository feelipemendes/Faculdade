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
public class PessoaFisica {

    private String nome;
    private String cpf;
    private int numConta;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = validaCpf(cpf);

    }

    public String validaCpf(String cpf) {
        if (cpf.length() == 11) {
            return cpf;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " + nome + " CPF: " + cpf;//To change body of generated methods, choose Tools | Templates.
    }

}
