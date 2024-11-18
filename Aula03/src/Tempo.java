import java.time.LocalDateTime;
import myinputs.Ler;

public class Tempo {
    private static String[] saudacoes =
            {"Bom dia", "Boa tarde", "Boa noite"};
    private static String nome;
    private static int horas;
    private static int minutos;

    public static void getHoras( ){
        LocalDateTime dataComputador = LocalDateTime.now();
        horas = dataComputador.getHour();
        minutos = dataComputador.getMinute();
    }

    private static int periodoDia(int h){
        return (h+20) /8 % 3;
    }

    public static void main(String args[]){
        System.out.println("Nome: ");
        nome = Ler.umaString();
        getHoras () ;
        System.out.println(saudacoes[periodoDia(horas)] + ", " + nome);
        System.out.println("Passam " + minutos + " minutos das " + horas + " horas." ) ;
    }
}
