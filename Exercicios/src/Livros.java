public class Livros {

    private String nome;
    private String [] autores;
    private double preco;

    public Livros (String nome){
        this.nome = nome;
        autores = new String[3];
        preco = 0.0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome= nome;
    }

    public String [] getAutores(){
        return autores;
    }

    public void setAutores(){
        for (int i = 0; i < autores.length; i++) {
            this.autores[i] = autores[i];
        }
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean verificar (String autor){
        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == autor){
                return true;
            }
        }
        return false;
    }

}
