import javax.swing.*;
public class tres {

    public static void main(String[] args) {

        String a, b, c;

        int x, y, z, ma = 0;


        a = JOptionPane.showInputDialog(null, "Introduza um inteiro: ");

        x = Integer.parseInt(a);

        b = JOptionPane.showInputDialog(null, "Introduza um inteiro: ");

        y = Integer.parseInt(b);

        c = JOptionPane.showInputDialog(null, "Introduza um inteiro: ");

        z = Integer.parseInt(c);


        if (x > y && x > z) {
            ma = x;
        } else if (y > x && y > z) {

            ma = y;
        } else {
            ma = z;
        }

        JOptionPane.showMessageDialog(null, "O maior dos três interios: " + ma);
    }
}
