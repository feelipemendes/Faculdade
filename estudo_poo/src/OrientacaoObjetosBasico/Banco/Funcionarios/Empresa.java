package OrientacaoObjetosBasico.Banco.Funcionarios;

public class Empresa {

    private String nomeFantasia;
    private String cnpj;
    // private static int TAM_FUNC = 10;
    Funcionario[] funcionarios;//= new Funcionario[TAM_FUNC];

    public Empresa(String nomeFantasia, String cnpj, int qntFunc) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        funcionarios = new Funcionario[qntFunc];
    }

    public void adiciona(Funcionario f) {
        //Funcionario[] aux = new Funcionario[funcionarios.length+1];
        for (int i = 0; i <= funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = f;
                break;
            }
        }
        //funcionarios[i]

    }

    public void mostrarGanhoAnualFuncionarios() {
        for (Funcionario f : funcionarios) {
            if (f != null) {
                System.out.println("Nome: " + f.getNome() + " Ganho anual: " + f.getGanhoAnual());
            }
        }
    }

    public void listaFunc() {
        for (Funcionario f : funcionarios) {
            if (f != null) {
                System.out.println(f);
            }
        }
    }

    @Override
    public String toString() {
        return "Empresa: " + nomeFantasia + " com cnpj: " + cnpj + "\n"; //To change body of generated methods, choose Tools | Templates."
    }

}
