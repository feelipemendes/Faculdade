package OrientacaoObjetos.ClassesAbstratas.Funcionarios;

import OrientacaoObjetosBasico.Banco.Funcionarios.*;

public abstract class Funcionario {

    private String nome;
    private String departamento;
    private String dataEfetivacao;
    protected double salario;
    private String rg;
    private int id;
    private static int idTotal = 1;

    public String getNome() {
        return nome;
    }

    //metodo abstrato
    public abstract double getBonificacoes();

    public void aumentaSalario(double valor) {
        this.salario += valor;
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + " id: " + this.id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
}
