import java.util.ArrayList;

public class Biblioteca {

    private String nome;
    private ArrayList<String> livros;


    public Biblioteca (){
        livros = new ArrayList<String>();
    }

    public Biblioteca (String nome){
        this.nome = nome;
        this.livros = new ArrayList<String>();
    }

    public String getNome (){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<String> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<String> livros) {
        this.livros = livros;
    }

    public String toString(){
        return "Nome: " + nome + ", Livros: " + livros;
    }

    public boolean verificarLivros (String titulo){
        return livros.contains(titulo);
    }

   public ArrayList<String> tituloLivros (String nome) {

       ArrayList<String> lista;
       lista = new ArrayList<>();

       for (int i = 0; i < livros.size(); i++) {
           if (livros.get(i).contains(nome)) {
               lista.add(livros.get(i));
           }
       }
       return lista;
   }

   public boolean adicionarLivro (String nome) {

       if (!livros.contains(nome)) {
           livros.add(nome);
           return true;
       }
       return false;
   }

    public boolean removerLivro (String nome){

        if (livros.contains(nome)){
            livros.remove(nome);
            return true;
        }
        return false;
    }

}
