import myinputs.Ler;

public class Ex3 {

    public static void main(String[] args){

        System.out.println ("Escreva um inteiro:");
        int numero= Ler.umInt();

        int numeroInvertido = 0;

        while (numero !=0){
            int digito = numero % 10;  // Extrair o último dígito
            numeroInvertido = numeroInvertido * 10 + digito;  // Adicionar o dígito ao número invertido
            numero /= 10; // Remover o último dígito do número original
        }
        System.out.println("O número invertido é: " + numeroInvertido);
    }
}
