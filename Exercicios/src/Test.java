public class Test {

    public static void main (String args[]) {

        Viagem v1, v2, v3;

        v1 = new Viagem("Lisboa", "Porto");
        v1.setCusto(30);
        System.out.println(v1);

         v2 = new Viagem("Lisboa", "Faro");
        v2.setCusto(30);

        System.out.println(v2);

        v3 = v2;
        v3.setDestino("Porto");

        System.out.println(v3);
        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));
        System.out.println(v2 == v3);
        System.out.println(v2.equals(v3));
    }
}
