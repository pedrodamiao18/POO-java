public class TesteString {
    public static void main(String[] args) {
        // Criando uma string de exemplo
        /*String exemplo = "Programação em Java";

        System.out.println(exemplo);

        // Teste do método charAt(int index)
        char caractere = exemplo.charAt(5);
        System.out.println("O caractere na posição 5 é: " + caractere);

        // Teste do método length()
        int comprimento = exemplo.length();
        System.out.println("O comprimento da string é: " + comprimento);

        // Teste do método indexOf(String str)
        int indice = exemplo.indexOf("Java");
        System.out.println("O índice da substring 'Java' é: " + indice);

        // Teste do método concat(String str)
        String novaString = exemplo.concat(" é interessante!");
        System.out.println("Resultado após concatenação: " + novaString);

        // Teste do método substring(int beginIndex)
        String subString = exemplo.substring(12);
        System.out.println("Substring a partir do índice 12: " + subString);

        // Teste do método compareTo(String str)
        int comparacao = exemplo.compareTo("Programação em Ja");
        System.out.println("Comparação com 'Programação em C': " + comparacao);

        // Testando o compareTo para uma string igual
        int comparacaoIgual = exemplo.compareTo("Programação em Java");
        System.out.println("Comparação com 'Programação em Java': " + comparacaoIgual);*/

        String texto = "The competent programmer is fully aware of the limited size of his own skull. He therefore approaches his task with full humility, and avoids clever tricks like the plague.";

        int comprimento = texto.length();
        System.out.println("Contar quantos caracteres tem a String (incluindo espaços): " + comprimento);

        int semespaco = texto.replace(" ", "").length();
        System.out.println("Contar quantos caracteres (sem contar os espaços) tem a String: " + semespaco);

        String[] palavras = texto.split("\\s+"); // Divide a string por espaços em branco
        int contaPalavras = palavras.length;
        System.out.println("c) Total de palavras: " + contaPalavras);


    }
}
