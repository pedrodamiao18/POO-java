public class Pergunta {
    private static int ultimo = 0;
    private int numero;
    private String texto;
    private double valor;

    public Pergunta(){
        ultimo++;
        numero = ultimo;
        texto = "";
        valor = 0.0;
    }

    public static int getUltimo() {
        return ultimo;
    }
    public static void setUltimo (int ultimo) {
        Pergunta.ultimo = ultimo;
    }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public String toString() {
        return "Pergunta{" + "numero=" + numero + ", texto=" + texto + ", valor = " + valor + '}';

    }
}
