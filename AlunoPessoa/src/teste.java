import java.time.LocalDate;

public class teste {

    public static void main(String[] args) {
        Pergunta p1, p2;
        p1 = new Pergunta();
        p1.setTexto("O que é uma variável de instância");
        p2 = p1;
        p2.setTexto("O que é um construtor");
        p2.setValor(6.0);
        Pergunta p3 = new Pergunta();
        p3.setTexto("O que é um modificador de acesso");
        p3.setValor(8.0);
        Pergunta[] pp = new Pergunta[3];
        pp[0] = p1;
        pp[1] = p2;
        pp[2] = p3;
        LocalDate dataFreq = LocalDate.of(2022, 10, 12);
    }
}
