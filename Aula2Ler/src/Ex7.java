import myinputs.Ler;

public class Ex7 {
    public static void main(String[] args) {
        int chave[] = new int[6];
        int histograma[] = new int[50]; // Vetor para armazenar a frequência dos números (índices de 1 a 49)

        System.out.println("Quantas chaves pretende gerar aleatoriamente?");
        int n = Ler.umInt();

        for (int x = 0; x < n; x++) {
            for (int i = 0; i < chave.length; i++) {
                chave[i] = (int) (Math.random() * 49) + 1;


                for (int j = 0; j < i; j++) {
                    if (chave[i] == chave[j]) {
                        i--;
                    }
                }
            }

            // Mostrar a chave gerada
            System.out.print("A sua chave do Totoloto é: ");
            for (int num : chave) {
                System.out.print(num + " ");
                histograma[num]++; // Incrementar a frequência do número no histograma
            }
            System.out.println();
        }

        // Apresentar o histograma
        System.out.println("\nHistograma dos números gerados:");
        for (int i = 1; i < histograma.length; i++) {
            if (histograma[i] > 0) {
                System.out.println("Número " + i + ": " + histograma[i] + " vezes");
            }
        }
    }
}
