import myinputs.Ler;

public class Teste {
    static int [] lista;
    static int [] lista2;
    static int [] [] matriz;
    static int menu() {
        System.out.println("Opções: ");
        System.out.println("1 – Ler array ");
        System.out.println("2 - Escrever array ");
        System.out.println("3 - Produto interno entre dois arrays ");
        System.out.println("4 - Maior valor do array ");
        System.out.println("5 - Opção 5 ");
        System.out.println("6 - Elementos do array múltiplas de 3 ");
        System.out.println("7 – Ler matriz ");
        System.out.println("8 - Escrever matriz ");
        System.out.println("9 -  Transposta da matriz ");
        System.out.println("0 - Terminar ");
        System.out.println("Qual a sua opção? ");
        int op;
        op = Ler.umInt();
        return op;
    }
    static void lerArray(int [] listaInteiros) {
        System.out.println("Introduza os valores do array ");
        for (int i = 0 ; i < listaInteiros.length; i++ ) {
            System.out.println("Posição " + i + ":");
            listaInteiros[i] = Ler.umInt();
        }
    }
    static void escreverArray(int [] listaInteiros) {
        System.out.print("Array: [ ");
        for (int i = 0; i < listaInteiros.length; i++) {
            System.out.print(listaInteiros[i] + " ");
        }
        System.out.println("]\n");
    }
    static void produtoArrays(int [] listaInteiros, int [] listaInteiros2){
        int produtoArray = 0;
        for (int i = 0; i < listaInteiros.length; i++){
            produtoArray += listaInteiros[i] * listaInteiros2[i];
        }
        System.out.println("Produto interno entre os dois arrays = " + produtoArray);
    }
    static void maiorvalorArray(int [] listaInteiros){
        int maior = listaInteiros [0];
        for (int i = 0; i < listaInteiros.length; i++){
            if (listaInteiros[i] > maior){
                maior = listaInteiros[i];
            }
        }
        System.out.println("O maior valor do array é " + maior);
    }
    static boolean inteiroArray( int [] listaInteiros, int x){
        for (int i = 0; i < listaInteiros.length; i++){
            if (x == listaInteiros[i]){
                return true;
            }
        }
        return false;
    }
    static void multi3Array(int [] listaInteiros) {
        int soma = 0;
        for (int i = 0; i < listaInteiros.length; i++) {
            if (listaInteiros[i] % 3 == 0) {
                soma++;
            }
        }

        int[] array = new int[soma];
        int index = 0;

        for (int i = 0; i < listaInteiros.length; i++) {
            if (listaInteiros[i] % 3 == 0) {
                array[index] = listaInteiros[i];
                index++;
            }
        }
        escreverArray(array);
    }
    static void lerMatriz(int [] [] matrizInteiros){
        System.out.println("Introduza os valores da matriz ");
        for (int i = 0; i < matrizInteiros.length; i++){
            for (int j = 0; j < matrizInteiros[i].length; j++){
                System.out.println("Posição " + i + ", " + j + ":");
                matrizInteiros[i][j] = Ler.umInt();
            }
        }
    }
    static void escreverMatriz(int[][] matrizInteiros) {
        System.out.println("Matriz:");
        for (int i = 0; i < matrizInteiros.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrizInteiros[i].length; j++) {
                System.out.print(matrizInteiros[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }
    static void transpostaMatriz(int[][] matrizInteiros){
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < matrizInteiros[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrizInteiros.length; j++) {
                System.out.print(matrizInteiros[j][i] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int escolha, dim, linhas, colunas;
        do {
            escolha = menu();
            switch (escolha) {
                case 1:
                    System.out.println("Qual a dimensão do array? ");
                    dim = Ler.umInt();
                    lista = new int [dim];
                    lerArray(lista);
                    break;
                case 2:
                    System.out.println("Valores de um array ");
                    escreverArray(lista);
                    break;
                case 3:
                    System.out.println("Produto interno entre dois arrays: \n");
                    System.out.println("Qual a dimensão dos arrays? ");
                    dim = Ler.umInt();
                    lista = new int [dim];
                    lerArray(lista);
                    lista2 = new int [dim];
                    lerArray(lista2);
                    produtoArrays(lista, lista2);
                    break;
                case 4:
                    maiorvalorArray(lista);
                    break;
                case 5:
                    System.out.println("Insira um valor inteiro: ");
                    int x = Ler.umInt();
                     boolean a = inteiroArray(lista, x);
                     System.out.println(a);
                    break;
                case 6:
                    multi3Array(lista);
                    break;
                case 7:
                    System.out.println("Qual é o número de linhas da matriz");
                    linhas = Ler.umInt();
                    System.out.println("Qual a dimensão do array? ");
                    colunas = Ler.umInt();
                    matriz = new int[linhas][colunas];
                    lerMatriz(matriz);
                    break;
                case 8:
                    System.out.println("Valores da matriz ");
                    escreverMatriz(matriz);
                    break;
                case 9:
                    System.out.println("Matriz transposta ");
                    transpostaMatriz(matriz);
                    break;
            }
        } while (escolha != 0);
    }
}