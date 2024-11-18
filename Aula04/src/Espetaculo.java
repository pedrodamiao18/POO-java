
public class Espetaculo {

    private String nome;
    private int capacidade;
    private int espectadores;
    private int custo;

    public Espetaculo(String nome) {
        this.nome = nome;
        this.capacidade = 0;
        this.espectadores = 0;
        this.custo = 0;
    }

    public Espetaculo() {
        this.nome = "Sem Nome";
        this.capacidade = 0;
        this.espectadores = 0;
        this.custo = 0;
    }

    // Getter e Setter para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(int espectadores) {
        this.espectadores = espectadores;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "Espetaculo{" + nome +
                ", capacidade=" + capacidade +
                ", custo=" + custo +
                ", numeroEspectadores=" + espectadores +
                '}';
    }

    public void comprarBilhete(){

        if(espectadores < capacidade){
            espectadores++;
        }
    }


}
