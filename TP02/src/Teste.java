public class Teste {
    public static void main (String[] args){
        Emp e1, e2;

        e1 = new Emp();
        e2 = new Emp("Maria");
        e1.setNome("Manuel");
        e2.setSal(2000);
        e2.subirS(5);
        e1.setSal(2300);
        e1.setNss(125489562);
        e2.setNss(518945627);


        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
