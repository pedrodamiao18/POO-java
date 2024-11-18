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


}
