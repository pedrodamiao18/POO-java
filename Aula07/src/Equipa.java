import java.util.ArrayList;

public class Equipa {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Equipa(String nome){
        this.nome= nome;
        this.jogadores = new ArrayList<Jogador>();
    }
    public void adicionarJogador (Jogador j) {
            jogadores.add(j);
    }

    public boolean removerJogador(int indice) {
        if (indice >= 0 && indice < jogadores.size()) {
            jogadores.remove(indice);
            return true;
        } else {
            System.out.println("Índice inválido. Não foi possível remover o jogador.");
            return false;
        }
    }

    public int numeroJogadores(){
        int j = 0;
        for (int i = 0; i < jogadores.size(); i++) {
            j += 1;
        }
        return j;
    }

    public boolean verificarJogador(String nome) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public String maiorMarcador() {

        Jogador jogadorTop = jogadores.get(0); // Inicializa com o primeiro jogador
        for (int i = 1; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            if (jogador.totalGolos() > jogadorTop.totalGolos()) {
                jogadorTop = jogador; // Atualiza o jogador com mais gols
            }
        }
        return jogadorTop.getNome(); // Retorna o nome do jogador com mais gols
    }

    public String toString(){
        String s = null;
        s = "Equipa: " + nome + "\nJogadores:\n";
        for (int i = 0; i < jogadores.size(); i++) {
            s += jogadores.get(i).toString() + "\n";
        }
        return s;
    }
}