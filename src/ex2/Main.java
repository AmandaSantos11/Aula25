package ex2;
public class Main {
    public static void main(String[] args) {

       Funcionario funcionario1 = new Funcionario(1);
       Funcionario funcionario2 = new Funcionario(2);
       Funcionario funcionario3 = new Funcionario(3);

       funcionario1.setNome("Claudia");funcionario1.setDataDeAdmissao(10012020);funcionario1.setSalario(3500);

       funcionario2.setNome("Jonas");funcionario2.setDataDeAdmissao(11052020);funcionario2.setSalario(2000);

       funcionario3.setNome("Leonardo");funcionario3.setDataDeAdmissao(19052023);funcionario3.setSalario(1500);

        System.out.println("Informação dos funcionários: ");
        System.out.println("Identificador: "+funcionario1.getIdent()+"\n"+"Nome: "+funcionario1.getNome()+"\n"+"Data de admissão: "+funcionario1.getDataDeAdmissao()+"\n"+"Salário: "+funcionario1.getSalario()+"\n");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Identificador: "+funcionario2.getIdent()+"\n"+"Nome: "+funcionario2.getNome()+"\n"+"Data de admissão: "+funcionario2.getDataDeAdmissao()+"\n"+"Salário: "+funcionario2.getSalario()+"\n");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Identificador: "+funcionario3.getIdent()+"\n"+"Nome: "+funcionario3.getNome()+"\n"+"Data de admissão: "+funcionario3.getDataDeAdmissao()+"\n"+"Salário: "+funcionario3.getSalario()+"\n");
    }
}