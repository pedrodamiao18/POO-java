public class Aluno {
    private static int ultimo = 0;
    private int numero;
    private String nome;
    private Disciplina[] lista;

    // Construtor com parâmetro para o nome
    public Aluno(String nome) {
        this.nome = nome;
        ultimo++;
        this.numero = ultimo;
        this.lista = new Disciplina[3];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Disciplina();
        }
    }

    public Aluno (){
        ultimo ++;
        numero = ultimo;
        nome = "";
        lista = new Disciplina[3];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Disciplina();
        }
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

    public Disciplina[] getLista() {
        return lista;
    }

    public void setLista(Disciplina[] lista) {
        for (int i = 0; i < lista.length; i++) {
            this.lista[i].setCodigo(lista[i].getCodigo());
            this.lista[i].setNome(lista[i].getNome());
            this.lista[i].setProf(lista[i].getProf());
        }
    }

    public void adicionarDisciplina(Disciplina d, int p) {
        if (p >= 0 && p < lista.length) {
            lista[p] = d;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    @Override
    public String toString() {
        String resultado = "Nome: " + nome + ", Número: " + numero + "\nDisciplinas:\n";
        for (Disciplina disciplina : lista) {
            if (disciplina != null) {
                resultado += disciplina.toString() + "\n";
            }
        }
        return resultado;
    }

    public boolean verificarDisciplina(int codigo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }
}
