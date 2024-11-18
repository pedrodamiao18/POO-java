import java.util.ArrayList;

public class Turma implements Cloneable {
    private static int ultima = 0;
    private int numero;
    private String nome;
    private ArrayList<String> alunos;
    private int[] horario;

    public Turma(String nome) {
        this.nome = nome;
        ultima++;
        this.numero = ultima;
        this.alunos = new ArrayList<>();
        this.horario = new int[5];
    }

    public Turma() {
        nome = "";
        ultima++;
        numero = ultima;
        alunos = new ArrayList<>();
        horario = new int[5];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<String> alunos) {
        this.alunos = alunos;
    }

    public int[] getHorario() {
        return horario;
    }

    public void setHorario(int[] horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        String s = "Nome: " + nome + ", Número: " + numero + ", Alunos: " + alunos + "\nHorário :\n";
        for (int value : horario) {
            s += value + " ";
        }
        return s;
    }

    public void adicionarAluno(String aluno) {
        alunos.add(aluno);
    }

    public boolean verificarAluno(String aluno) {
        return alunos.contains(aluno);
    }

    public int diaMaisCedo() {
        int cedo = horario[0];
        for (int i = 1; i < horario.length; i++) {
            if (cedo > horario[i]) {
                cedo = horario[i];
            }
        }
        return cedo;
    }

    // Método clone
    @Override
    public Turma clone() {
        try {
            Turma cloned = (Turma) super.clone();
            cloned.alunos = new ArrayList<>(this.alunos); // Cópia profunda da lista de alunos
            cloned.horario = this.horario.clone(); // Cópia profunda do array de horário
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
