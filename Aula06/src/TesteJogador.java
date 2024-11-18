import java.util.Arrays;

public class TesteJogador {

    public static void main (String[] args){

        Jogador j1, j2;

        j1 = new Jogador("Pedro", 10000);
        j2 = new Jogador("Ronaldo");

        int[] golosTeste = new int[34];
        for (int i = 0; i < 34; i++) {
            golosTeste[i] = (int)(Math.random() * 4) ;
        }

        int[] golosTeste2 = new int[34];
        for (int i = 0; i < 34; i++) {
            golosTeste2[i] = (int)(Math.random() * 4) ;
        }

        j2.setSalario(100000);

        j1.setGolos(golosTeste);
        j2.setGolos(golosTeste2);

        j1.modificarGolos(2,1);
        j2.modificarGolos(3,2);

        j1.aumentarSalario(50);
        j2.aumentarSalario(70);

        System.out.println(j1.toString() );
        System.out.println(j2.toString());

        j2 = (Jogador) j1.clone();

        System.out.println(j2);

        boolean b = j1.equals(j2);
        System.out.println(b);
    }
}
