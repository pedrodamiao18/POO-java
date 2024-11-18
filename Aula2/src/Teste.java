import myinputs.Ler;
public class Teste {
    public static void main(String[] args) {
        System.out.println("Introduza uma String:");
        String s = Ler.umaString();
        System.out.println("A string que introduziu foi: " + s + "\n");

        System.out.println("Introduza um Inteiro:");
        int i = Ler.umInt();
        System.out.println("O inteiro que introduziu foi: " + i);

        System.out.println("Introduza um byte:");
        byte b = Ler.umByte();
        System.out.println("O byte que introduziu foi: " + b);

        System.out.println("Introduza um short:");
        short sh = Ler.umShort();
        System.out.println("O short que introduziu foi: " + sh);

        System.out.println("Introduza um long:");
        long l = Ler.umLong();
        System.out.println("O long que introduziu foi: " + l);

        System.out.println("Introduza um float:");
        float f = Ler.umFloat();
        System.out.println("O float que introduziu foi: " + f);


    }
}