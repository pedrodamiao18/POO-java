import javax.swing.*;
public class seis {

    public static void main (String[] args){

        String p;
        double valor = 0;


        p = JOptionPane.showInputDialog(null, "Valor das compras: ");

        int i = Integer.parseInt(p);

        if (i < 10) {
            valor = i;
            JOptionPane.showMessageDialog(null, "Não vai ter direito a desconto.\nValor final: " + valor+"€");
        } else if (i >= 10 && i < 100) {
            valor = i * 0.95;  // 5% desconto
            JOptionPane.showMessageDialog(null, "Vai ter 5% de desconto.\nValor final: " + valor+"€");
        } else if (i >= 100 && i < 1000) {
            valor = i * 0.90;  // 10% desconto
            JOptionPane.showMessageDialog(null, "Vai ter 10% de desconto.\nValor final: " + valor+"€");
        } else if (i >= 1000 && i < 10000) {
            valor = i * 0.80;  // 20% desconto
            JOptionPane.showMessageDialog(null, "Vai ter 20% de desconto.\nValor final: " + valor+"€");
        } else {
            valor = i * 0.75;  // 25% desconto
            JOptionPane.showMessageDialog(null, "Vai ter 25% de desconto.\nValor final: " + valor+"€");
        }
    }
}
