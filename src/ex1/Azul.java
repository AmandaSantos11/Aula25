package ex1;

import java.util.Scanner;
public class Azul{
    public Scanner digite;
    static int cor;
    public static String nome = "Azul";
    private int tonalidade; //resposta da letra D - ex1
    public Azul() {
        this.digite = new Scanner(System.in);
        this.tonalidade = 1;//resposta da letra E - ex1
        this.cor = 1;
    }
    public int getTonalidade() {
        return tonalidade;
    }
    public void setTonalidade(int tonalidade) {
        this.tonalidade = tonalidade; //resposta da letra D - ex1
    }
    public void tornarMaisEscuro() {
        if (cor == 5){
            System.out.println("Não é mais possível escurecer a cor");
        }
        else{
            cor++;
            System.out.println("A cor escureceu um tom");
        }
    }
    void calcularTonalidade() {
        if (tonalidade == 1){
            System.out.println("A tonalidade atual é: Turquesa");
        }
        else if (tonalidade == 2){
            System.out.println("A tonalidade atual é: Royal");
        }
        else if(tonalidade == 3){
            System.out.println("A tonalidade atual é: Cobalto");
        }
        else if (tonalidade == 4) {
            System.out.println("A tonalidade atual é: Celeste");
        }
        else{
            System.out.println("A tonalidade atual é: Jeans");
        }
    }
    private void tornarTonalidadeMaisEscura() {
        if (tonalidade == 5){
            System.out.println("Não é mais possível escurecer a tonalidade");
        }
        else{
            tonalidade++;
            System.out.println("A tonalidade escureceu um tom");
        }
    }
    public void interagirComUsuario(){
        System.out.println("A cor atual do "+nome+" é: "+cor+"\n"+"A tonalidade do "+nome+" é: "+getTonalidade());
        System.out.println("-----------------------------------------");
        System.out.println("Digite o que deseja fazer:");
        System.out.println("1-Escurecer a cor | 2-Escurecer a tonalidade | 3-Consultar a tonalidade | 4-Sair");
        switch (digite.nextInt()){
            case 1:
                tornarMaisEscuro();
                interagirComUsuario();
                break;

            case 2:
                tornarTonalidadeMaisEscura();
                interagirComUsuario();
                break;

            case 3:
                calcularTonalidade();
                interagirComUsuario();
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Opção Inválida");
                interagirComUsuario();
        }
    }
}