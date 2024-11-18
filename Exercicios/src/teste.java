import java.util.*;
public class teste {
    public static void main (String [] args) {
        Turma ta, tb, tc;
        ta = new Turma ("Electrónica");
        tb = new Turma ("Desporto");
        tc = (Turma) ta.clone();
        System.out.println ( ta == tc );
        System.out.println ( tc);
        ta = tb;
        ta.setNome("mat");
        System.out.println ( ta == tb );
    }
}
