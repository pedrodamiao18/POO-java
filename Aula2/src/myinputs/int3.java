package myinputs;

public class int3 {

    public static void main (String[] args) {
        int max;

        System.out.println("Introduza um Inteiro:");
        int a = Ler.umInt();

        System.out.println("Introduza outro Inteiro:");
        int b = Ler.umInt();

        System.out.println("Introduza outro Inteiro:");
        int c = Ler.umInt();

        if (a > b && a > c){
            max = a;
        } else if (b > a && b > c) {
            max = b;
        }else {
            max = c;
        }

        System.out.println("O maior dos valor = " + max);
    }
}
