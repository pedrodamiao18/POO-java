import javax.swing.*;

public class cinco {


    public static void main (String[] args){

        String h;

        int i;

        h = JOptionPane.showInputDialog(null, "Que horas são?");

        i = Integer.parseInt(h);
        switch (i){
            case 6, 7, 8, 9, 10, 11, 12:
                JOptionPane.showMessageDialog(null, "Bom dia");
                break;

            case 13, 14, 15, 16, 17, 18, 19:
                JOptionPane.showMessageDialog(null, "Boa tarde");
                break;

            case 20, 21, 22, 23, 24, 1, 2, 3, 4, 5:
                JOptionPane.showMessageDialog(null, "Boa noite");
                break;
        }
    }
}
