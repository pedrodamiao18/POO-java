public class TesteTele {

    public static void main (String[] args){
        Telefone t1, t2;

        t1 = new Telefone();
        t1.setTipo("móvel");
        t1.setNumero(915478578);

        t2 = (Telefone) t1.clone();

        System.out.println(t1);
        t2.setNumero(999999999);
        System.out.println(t2);


        boolean b = t1.equals(t2);
        System.out.println(b);

    }
}
