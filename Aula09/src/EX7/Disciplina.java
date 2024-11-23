import java.util.Objects;

public class Disciplina {
    private int codigo;
    private String designacao;
    private int nota;

    public Disciplina(int codigo, String designacao){
        this.codigo = codigo;
        this.nota = 0;
        this.designacao = designacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo=" + codigo +
                ", designacao='" + designacao + '\'' +
                ", nota=" + nota +
                '}';
    }

    public boolean equals(Object o) {
        if ( o != null && this.getClass() == o.getClass()){
            Disciplina d = (Disciplina) o;
            return codigo == d.codigo && nota == d.nota && Objects.equals(designacao, d.designacao);
        }else
            return false;
    }

    public Object clone(){
        Disciplina copia = new Disciplina(this.codigo,this.designacao);
        copia.nota = this.nota;

        return copia;
    }

    public Disciplina(Disciplina original) {
        this.codigo = original.codigo;
        this.designacao = original.designacao;
        this.nota = original.nota;
    }
}
