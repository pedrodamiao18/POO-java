import myinputs.Ler;

public class Ex2 {
    public static void main (String [] args){

        System.out.println("Introduza uma palavra");
        String palavra = Ler.umaString();

        char menorLetra = palavra.charAt(0);

        for (int i=1; i < palavra.length(); i++){
            char letraAtual = palavra.charAt(i);
            System.out.println(letraAtual);
            if (letraAtual < menorLetra) {
                menorLetra = letraAtual;
            }
        }
        System.out.println("A letra com o menor valor ASCII é: " + menorLetra);
    }
}
