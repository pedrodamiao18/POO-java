import java.util.ArrayList;

public class AlunoLicenturas extends Aluno{
    private String curso;
    private ArrayList<Disciplina> disciplinas;

    public AlunoLicenturas(Aluno a,String curso){
        super(a.getNome(),a.getNumero());
        this.curso = curso;
        this.disciplinas = new ArrayList<>();
    }


}
