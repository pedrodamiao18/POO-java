public class Main {
    public static void main(String[] args) {
        int list[];//declarar array
        int soma = 0;
        double y[] = new double[20];
        double listmaisy [] = new double[20];
        double produto = 0;

        list = new int[20];//alocar memória

        for(int i = 0;i < list.length; i++){
            //atribui valores
            list[i] = (int) ( Math.random () * 180 ) + 20;
            System.out.println(list[i]);

            //soma dos elementos do array
            soma = soma + list[i];
            
            y[i] = list[i] * 0.5;

            //soma dos arrays list e y
            listmaisy [i] = list[i] + y[i];

            produto = produto + list[i] * y[i];
        }
        System.out.println("Soma dos elementos do array lista = " + soma);

        System.out.println("Produto interno de lista por y = " + produto);
    }
}