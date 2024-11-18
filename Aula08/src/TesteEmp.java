import java.util.ArrayList;

public class TesteEmp {

    public static void main(String[] args){

        Empregados e1 = new Empregados("Carlos",142536987,2000);

        Telefone t1 = new Telefone("móvel", 123654789);
        ArrayList<Telefone> tele;

        tele = new ArrayList<>();

        tele.add(t1);

        e1.setContactos(tele);

        //System.out.println(e1);

        e1.subirSalario(50);

        System.out.println(e1);

        Telefone t2 = new Telefone("casa", 232546987);

        e1.adicionarContacto(t2);

        //System.out.println(e1);

        Empregados e2 = (Empregados) e1.clone();

        System.out.println(e2);

        boolean b = e1.equals(e2);
        System.out.println(b);

        System.out.println(e1.obterNumeroPorTipo("casa"));
    }
}
