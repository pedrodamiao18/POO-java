import myinputs.Ler;

public class TesteEspetaculo {

    static int menu (){
        System.out.println("Menu");
        System.out.println("1 – Consultar espetáculos;");
        System.out.println("2 – Comprar bilhete para um Espetáculo;");
        System.out.println("3 – Consultar o valor total realizado até ao momento na venda de bilhetes para os dois espetáculos.");
        System.out.println("Qual a sua opção? ");

        int op;
        op = Ler.umInt();
        return op;
    }
    public static void main (String[] args){

        Espetaculo e1, e2;

        e1 = new Espetaculo();
        e2 = new Espetaculo();

        e1.setNome("Comédia");
        e2.setNome("Magia");
        e1.setEspectadores(30);
        e2.setEspectadores(25);
        e1.setCapacidade(40);
        e2.setCapacidade(50);
        e1.setCusto(10);
        e2.setCusto(13);

        int escolha;

        do {
            escolha = menu();
            switch (escolha){
                case 1:
                    String s = e1.getNome();
                    System.out.println(e1);
                    System.out.println(e2);
                    break;

                case 2:
                    System.out.println("Qual dos espetáculos predente comprar bilhete?");
                    int esp  = Ler.umInt();
                    if (esp == 1){
                        e1.comprarBilhete();
                        System.out.println("Obrigado por ter comprado o nosso bilhete para o espetáculo de " + e1.getNome() + ".");
                    } else if (esp == 2) {
                        e2.comprarBilhete();
                        System.out.println("Obrigado por ter comprado o nosso bilhete para o espetáculo de " + e2.getNome() + ".");
                    }else
                        System.out.println("Erro: Tem de escolher estre o 1 e 2.");
                    break;

                case 3:
                    int valor;
                    valor = e1.getCusto() * e1.getEspectadores() + e2.getCusto() * e2.getEspectadores();
                    System.out.println("Valor total realizado até ao momento na venda de bilhetes " + valor + "€");

            }
        }while (escolha != 0);
    }
}
