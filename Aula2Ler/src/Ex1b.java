import myinputs.Ler;

public class Ex1b {

    public static void main(String[] args){

        double soma = 0;

        System.out.println ("Escreva o valor de p:");
        int p = Ler.umInt();

        System.out.println ("Escreva o valor de u:");
        int u = Ler.umInt();

        if ( p > u){
            System.out.println("Erro: o valor de p tem de ser menor ou igual ao valor de u.");
        }

        int i = p;
        while (i <= u){
            soma += i;
            i = ++i;
        }

        System.out.println("Soma = " + soma);
    }
}
