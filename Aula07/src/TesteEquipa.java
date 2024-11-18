import java.io.PrintStream;

public class TesteEquipa {

    public static void main (String[] args){

        Equipa e1;

        e1 = new Equipa("Real Madrid");

        Jogador j1, j2, j3;

        j1 = new Jogador("Cristiano", 10000);
        j1.modificarGolos(2,3);
        j1.modificarGolos(3,2);

        j2 = new Jogador("Bale", 8000);
        j2.modificarGolos(1,1);
        j2.modificarGolos(3,2);

        j3 = new Jogador("Benzema", 8500);
        j3.modificarGolos(3,1);
        j3.modificarGolos(4,2);

        e1.adicionarJogador(j1);
        e1.adicionarJogador(j2);
        e1.adicionarJogador(j3);

        System.out.println(e1.maiorMarcador());

    }
}
