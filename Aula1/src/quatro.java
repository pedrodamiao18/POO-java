public class quatro {

    public static void main(String[] args) {

        int posi = 0, nega = 0, zero = 0;

        for (int i = 0; i < 10000; i++) {
            //atribui valores
            int random = (int) (Math.random() * 200) - 100;

            if ( random > 0){
                posi++;
            } else if (random < 0) {
                nega++;
            }else{
                zero++;
            }
        }
        System.out.println("Números positivos: " + posi);
        System.out.println("Números negativos: " + nega);
        System.out.println("Números iguais a zero: " + zero);
    }
}