public class oito  {

    public static void main(String[] args){
        int numero;
        int p[] = new int[2];
        double decNum, rD;
        numero = -100000;
        decNum = 12345.6789;
        System.out.println("O valor da variável inteira é: " + numero);
        System.out.println("O valor da variável real é: " + decNum);

        char letra = 'A';
        System.out.println(letra);
        letra = 65;
        System.out.println( letra);
        letra = 97;
        System.out.println( letra);

        double z = -1;
        float x = 12.5f, y=3E30F, zero = 0.0f, rF;
        byte b = -128, rB;
        short xpto3 = -130, sht=9, rS;
        long lng = 0xEFFFFFFFFFFFFFFFL, rL;
        System.out.println(lng);

        rL = lng *10;
        System.out.println("rL: " + rL);

        rF = lng + 1;
        System.out.println("rF: " + rF);

        rF = x * y / (float)decNum;
        System.out.println("rF: " + rF);

        p[1] = 1;
        rD = x * y / p[1];
        System.out.println("rD: " + rD);

        rF = 0;
        System.out.println("rF: " + rF);

        rF = sht + b * y * x * lng;
        System.out.println("rF: " + rF);

        rD = - b * (sht + zero + x * lng + y * decNum * - numero / letra);
        System.out.println("rD: " + rD );

        rD *= 1E269;
        System.out.println("rD: " + rD );
    }
}
