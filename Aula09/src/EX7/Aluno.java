public class Aluno {
    private int numero;
    private String nome;

    public Aluno(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    public boolean equals (Object o){
        if ( o != null && this.getClass() == o.getClass()){
            Aluno a = (Aluno) o;
            return (this.numero == a.numero && this.nome.equals(a.nome));
        }
        return false;
    }

    public Object clone(){
        Aluno copia = new Aluno(this.nome,this.numero);
        return copia;
    }


}
