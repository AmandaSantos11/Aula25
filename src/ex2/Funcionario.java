package ex2;
public class Funcionario {
    private String nome;
    private int dataDeAdmissao;
    private double salario;
    static int identificador;
    private int ident;

    //GETS
    public String getNome() {
        return nome;
    }
    public int getDataDeAdmissao() {
        return dataDeAdmissao;
    }
    public double getSalario() {
        return salario;
    }

    //SETS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataDeAdmissao(int data) {
        this.dataDeAdmissao = data;
    }
    public void setSalario(double salario) {
        this.salario = salario;
        if (salario < 700){
            System.out.println("Salário não permitido");
            System.exit(0);
        }
    }

    //CONSTRUTOR
    public Funcionario(int identificador){
        this.ident = identificador;
    }
    public int getIdent() {
        return ident;
    }
}