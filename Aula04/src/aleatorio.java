import myinputs.Ler;

public class aleatorio {

    public static void main (String[] args){

        System.out.println("Insira o número de valores aleatorios que predente gerar");
        int c = Ler.umInt();

        int r;
        Contador p, n;
        n = new Contador();
        p = new Contador();

        for(int i=0; i < c; i++){
            r = (int) (Math.random() * 200) - 100;

            if(r >= 0){
                p.incConta(1);
            }else
                n.incConta(1);
        }

        System.out.println(p);
        System.out.println(n);
    }
}
