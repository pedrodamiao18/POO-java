import myinputs.Ler;

public class Ex4 {

    public static void main (String[] args){

        int chave[]= new int[6];

        for(int i = 0; i < chave.length; i++) {

            System.out.println("Escolha um número inteiro entre 1 e 49:");
            chave[i] = Ler.umInt();

            if (chave[i] < 1 && chave[i] > 49) {
                System.out.println("Erro: O número tem de ser entre 1 e 49.");
                i--;
            }

            for (int j = 0; j < i; j++){
                if (chave[i] == chave[j]){
                    System.out.println("Erro: O número já foi escolhido. Tente outro.");
                    i--;
                }
            }
        }

        System.out.print("A sua chave do Totoloto é: ");
        for (int num : chave) {
            System.out.print(num + " ");
        }
    }
}


