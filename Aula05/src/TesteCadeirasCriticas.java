public class TesteCadeirasCriticas {

    public static void main (String [] args){

        CadeirasCriticas cc1, cc2;

        cc1 = new CadeirasCriticas();
        cc2 = new CadeirasCriticas();

        String [] dis = {"POO", "PE", "BD"};

        cc1.setCurso("EI");
        cc1.setDisciplinas(dis);

        String s = cc1.toSTring();

        System.out.println(s);
    }
}
