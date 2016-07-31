package OO.Interfaces.Funcionario;

import OrientacaoObjetosBasico.Banco.Funcionarios.*;

public class Funcionario {

    private String nome;
    private String departamento;
    private String dataEfetivacao;
    protected double salario;
    private String rg;
    private int id;
    private static int idTotal = 1;
    private int senha;
    
    public int getSenha(){
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario() {}

    public static int getIdTotal() {
        return idTotal;
    }

    public static void setIdTotal(int idTotal) {
        Funcionario.idTotal = idTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getBonificacoes(){
        
        return this.salario * 0.10;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.id = Funcionario.idTotal++;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
    
}
