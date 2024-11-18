public class Teste {

    public static void main (String[] args){

        Aluno a1, a2;

        Disciplina d1_1, d2_1, d3_1, d1_2, d2_2;

        a1 = new Aluno("Manuel Silva");
        a2 = new Aluno("Maria Espinho");


            d1_1 = new Disciplina(1000, "POO");
            d1_1.setProf("Paula Prata");

            d2_1 = new Disciplina(2000, "IA");
            d2_1.setProf("Luís Alexandre");

            d3_1 = new Disciplina(3000, "Multimédia");
            d3_1.setProf("Manuela Pereira");


            d1_2 = new Disciplina(1000, "Multimédia");
            d1_2.setProf("Paula Prata");

            d2_2 = new Disciplina(4000, "Probabilidades e Estatística");
            d2_2.setProf("João Duque");

        a1.adicionarDisciplina(d1_1,0);
        a1.adicionarDisciplina(d2_1,1);
        a1.adicionarDisciplina(d3_1,2);


        a2.adicionarDisciplina(d1_2,0);
        a2.adicionarDisciplina(d2_2,1);

        boolean b = a2.verificarDisciplina(2000);

        System.out.println(b);
    }
}
