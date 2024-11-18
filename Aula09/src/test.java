public class test {
    public static void main(String[] args){

        Derivada d1, d2 ,d3;

        d1 = new Derivada(new Base(1,2),3,4);

        System.out.println(d1);

        int s = d1.somaD();

        System.out.println(s);

        d2 = new Derivada(new Base(1,2),2,4);

        d1.equals(d2);

        System.out.println(d1.equals(d2));

        d3 = (Derivada) d2.clone();

        System.out.println(d3);
    }
}
