package OrientacaoObjetosBasico.Banco.Funcionarios;

public class Funcionario {

    private String nome;
    private String departamento;
    private String dataEfetivacao;
    private double salario;
    private String rg;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentaSalario(double valor) {
        this.salario += valor;
    }

    public double calculaGanhoAnual() {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return nome + " ganha: " + salario;
    }

}
