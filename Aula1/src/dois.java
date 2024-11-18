import javax.swing.*;
public class dois {
    public static void main(String[] args) {
        String s, n;

        s = JOptionPane.showInputDialog(null, "Introduza o seu nome: ");

        n = JOptionPane.showInputDialog(null,"Introduza o seu número: ");

                JOptionPane.showMessageDialog(null, "Nome " + s + " Número " + n);
    }
}