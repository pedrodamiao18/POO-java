public class Jogador {

    private static int ultimo = 0;
    private String nome;
    private int numero;
    private double salario;
    private int [] golos;

    public Jogador (String nome){
        this.nome = nome;
        ultimo++;
        this.numero = ultimo;
        this.salario = salario;
        this.golos = new int[4];
    }

    public Jogador (String nome, double salario){
        this.nome = nome;
        ultimo++;
        this.numero = ultimo;
        this.salario = salario;
        this.golos = new int[4];
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public int [] getGolos(){
        return golos;
    }

    public void setGolos(int[] golos) {
        this.golos = golos;
    }

    public void aumentarSalario(double perc){
        this.salario += salario * (perc/100);
    }

    public void modificarGolos (int jornada, int golos){
        if (jornada >= 1 && jornada <= 4) {
            this.golos[jornada - 1] = golos;
        } else {
            System.out.println("Número de jornada inválido. Deve estar entre 1 e 4.");
        }
    }

    public int consultarGolos (int jornada){
        if (jornada >= 1 && jornada <= 4) {
            return this.golos[jornada - 1];
        } else {
            System.out.println("Número de jornada inválido. Deve estar entre 1 e 4.");
            return 0;
        }
    }

    public String toString(){
        String s = null;

        s = "Nome: " + nome + "\nSalário: " + salario + "€" + "\nGolos por jornada:\n";

        for (int i = 0; i < golos.length; i++) {
            s += "Jornada " + (i + 1) + ": " + golos[i] + " golos\n";
        }
        return s;
    }

    public int totalGolos(){
        int total = 0;

        for (int i = 0; i < golos.length; i++) {
            total += golos[i];
        }
        return total;
    }
}
