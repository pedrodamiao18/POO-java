
public class Contador {
    // Variáveis de instância
    private int conta;

    // Construtores
    public Contador() {
        conta = 0;
    }

    public Contador(int conta) {
        this.conta = conta;
    }

    // Métodos getter e setter
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    // Métodos de incremento e decremento
    public void incConta() {
        conta++;
    }

    public void incConta(int inc) {
        conta += inc;
    }

    public void decConta() {
        conta--;
    }

    public void decConta(int dec) {
        conta -= dec;
    }

    // Sobrescrita do método toString

    public String toString() {
        return "Contador: " + conta;
    }
}