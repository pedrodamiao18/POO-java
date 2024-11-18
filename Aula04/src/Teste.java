import myinputs.Ler;

public class Teste {
    public static void main (String[] args){

        Contador c1, c2;
        c1 = new Contador();

        System.out.println("Insira o valor inicial do Contador" );
        int c = Ler.umInt();
        c2= new Contador (c);

        int i1, i2;
        i1 = c1.getConta();
        i2 = c2.getConta();

        System.out.println ("c1 = " + i1 );
        System.out.println ("c2 = " + i2 );


        System.out.println("Insira um valor inteiro para incrementar o Contadores: ");
        int i = Ler.umInt();
        c1.incConta(i);
        c2.incConta(i);

        System.out.println ("c1= " + c1.getConta() + "\n" + "c2 = " + c2.getConta() );

        System.out.println("Insira um valor inteiro para decremnetarcrementar os Contadores: ");
        int d = Ler.umInt();
        c1.decConta(d);
        c2.decConta (d);


        String s = c1.toString();
        System.out.println (s);
        System.out.println ( c2 );
        System.out.println ( c2 );
    }

}
