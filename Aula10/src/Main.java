
import myinputs.Ler;

public class Main {

    public static void main (String[] args){

        boolean verificador;

        do {
            try {
                verificarIntervalo(1, 9);
                verificador = true;
            } catch (ValorErrado x) {
                System.out.println(x.getMessage());
                verificador = false;
            }
        }while (verificador != true);
    }

    public static void verificarIntervalo (int i1, int i2) throws ValorErrado{
        int i = Ler.umInt();


            if (i >= i1 && i < i2) {
                System.out.println(i);
            }else throw new ValorErrado("Erro, o valor não está entre i1 e i2");
    }


}