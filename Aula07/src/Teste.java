import myinputs.Ler;

import java.util.ArrayList;

public class Teste {

    static int menu() {
        System.out.println("Opções: ");
        System.out.println("1 – Mostrar livros da biblioteca;");
        System.out.println("2 – Adicionar um novo livro;");
        System.out.println("3 – Remover um livro da biblioteca;");
        System.out.println("4 – Pesquisar livro por nome;");
        System.out.println("5 – Pesquisar livro por uma palavra contida no título;");
        System.out.println("6 – Terminar.");
        int op;
        op = Ler.umInt();
        return op;
    }

    public static void main(String[] args){
        int escolha;
        String l;

        Biblioteca b1;

        b1 = new Biblioteca("Bibicliteca");

        ArrayList<String> livro = new ArrayList<>();

        livro.add("OS MAIAS");
        livro.add("SE ISTO É UM HOMEM");

        b1.setLivros(livro);

        do {
            escolha = menu();
            switch (escolha){

                case 1:
                    System.out.println(b1.toString());
                    break;
                case 2:
                    System.out.println("Que livro vai adicionar à biblioteca?");
                    l = Ler.umaString();
                    b1.adicionarLivro(l);
                    break;
                case 3:
                    System.out.println("Que livro vai remover da biblioteca?");
                    l = Ler.umaString();
                    b1.removerLivro(l);
                    break;
                case 4:
                    System.out.println("Pesquisa: ");
                    l = Ler.umaString();
                    System.out.println(b1.verificarLivros(l));
                    break;
                case 5:
                    System.out.println("Pesquisa livro por palavra: ");
                    l = Ler.umaString();
                    System.out.println(b1.tituloLivros(l));
            }

        }while (escolha != 6);
    }
    
}
