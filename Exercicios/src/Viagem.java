public class Viagem {
    private final String[] trs = {"Avião", "Autocarro", "Barco", "Comboio"};
    private static int ultimoId = 0;
    private int id;
    private String origem;
    private String destino;
    private String transporte;
    private double custo;

    // Construtor
    public Viagem(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.transporte = trs[3]; // Atribui "Comboio" como transporte padrão
        this.id = ++ultimoId; // Gera o ID da viagem de forma sequencial
    }

    // Método toString() sobreposto
    @Override
    public String toString() {
        return "Viagem {ID: " + id + ", Origem: " + origem + ", Destino: " + destino +
                ", Transporte: " + transporte + ", Custo: " + custo + "}";
    }

    // Método equals() sobreposto
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Se as referências são as mesmas, são iguais.
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Se obj é nulo ou não é da mesma classe, não são iguais.
        }
        Viagem other = (Viagem) obj; // Fazendo um cast para Viagem
        return origem.equals(other.origem) &&
                destino.equals(other.destino) &&
                transporte.equals(other.transporte) &&
                custo == other.custo; // Compara os atributos relevantes.
    }

    // Getters e Setters
    public static int getUltimoId() {
        return ultimoId;
    }

    public int getId() {
        return id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTransporte() {
        return transporte;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
}
