public class Disciplina {
    private int codigo;
    private String nome;
    private String prof;

    public Disciplina ( ) {
        codigo = 0;
        nome = "";
        prof = "";
    }

    public Disciplina (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.prof = "";
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getProf() {
        return prof;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public boolean verificacao(String subnome){
        return this.nome.contains(subnome);
    }

    public boolean intervalo(int inicio, int fim){
        return codigo >= inicio && codigo < fim;
    }

    public String toString (){
        return "Código: " + codigo + ", Nome: " + nome + ", Professor: " + prof;
    }

}