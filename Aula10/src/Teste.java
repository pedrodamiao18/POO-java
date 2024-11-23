public class Teste {
    public static void main(String args[]) {
        int i, valor;
        int fornecedor[] = {20, 80, 70, 60, 100, 50, 60, 20};
        FrascoChocolates F = new FrascoChocolates(120, 50);
        for (i = 0; i < 8; i = i + 2) {
            try {
                valor = fornecedor[i];
                F.enche(valor);
                valor = fornecedor[i + 1];
                F.retira(valor);
            } catch (FrascoCheio | FrascoVazio e) {
                System.out.println("Exceção capturada: " + e.getMessage());
            } finally {
                System.out.println("Fim da iteração " + i);
            }
        }
    }
}
