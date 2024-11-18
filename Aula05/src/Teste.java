import myinputs.Ler;

public class Teste {

    public static void main (String[] args) {
        Disciplina d1, d2;

        d1 = new Disciplina();
        d2 = new Disciplina();

        d1.setNome("POO");
        d1.setCodigo(4521);
        d1.setProf("pedro");

        String s = d1.toString();
        System.out.println(d1);

        boolean b = d1.verificacao("O");
        System.out.println(b);

        int inicio = Ler.umInt();
        int fim = Ler.umInt();

        boolean b2 = d1.intervalo(inicio, fim);
        System.out.println(b2);
    }
}
