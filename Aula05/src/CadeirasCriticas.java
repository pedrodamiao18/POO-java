import java.util.Arrays;

public class CadeirasCriticas {

    private String curso;
    private String [] disciplinas;

    public CadeirasCriticas ( ) {
        disciplinas = new String[3];
        curso = "";
    }

    public CadeirasCriticas(String curso){
        this.curso = curso;
        this.disciplinas = new String[3];
    }

    public String getCurso(){
        return curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplinas(String[] disciplinas) {
        for (int i = 0; i< disciplinas.length; i++ ) {
            this.disciplinas[i] = disciplinas[i];
        }
    }

    public String toSTring (){
        return "Curso: " + curso + ", Disciplinas: " + Arrays.toString(disciplinas);
    }
}
