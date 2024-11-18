import myinputs.Ler;

public class Ex6 {
    public static void main (String[] args){
        int chave[]= new int[6];

        System.out.println("Quantas chaves pretende gerar aleatóriamente");
        int n = Ler.umInt();

        for (int x = 0; x < n; x++) {

            for (int i = 0; i < chave.length; i++) {

                chave[i] = (int) (Math.random() * 49) + 1;

                if (chave[i] < 1 && chave[i] > 49) {
                    i--;
                }

                for (int j = 0; j < i; j++) {
                    if (chave[i] == chave[j]) {
                        i--;
                    }
                }
            }

            System.out.print("A sua chave do Totoloto é: ");
            for (int num : chave) {
                System.out.print(num + " " );
            }
            System.out.println(" ");
        }
    }
}
