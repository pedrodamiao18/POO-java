import javax.swing.*;

public class sete {

    public static void main (String[] args){

        final double PI=3.14159273269;
        String r;
        int i;
        double peri, area;


        r = JOptionPane.showInputDialog(null, "Insira o valor do raio da círculo: ");
        i = Integer.parseInt(r);

        peri = 2 * PI * i;
        area = PI * (i*i);

        JOptionPane.showMessageDialog(null, String.format("Área: %.2f\nPerímetro: %.2f", area, peri));
    }
}
