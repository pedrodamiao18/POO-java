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
        this.golos = new int[34];
    }

    public Jogador (String nome, double salario){
        this.nome = nome;
        ultimo++;
        this.numero = ultimo;
        this.salario = salario;
        this.golos = new int[34];
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
        if (jornada >= 1 && jornada <= 34) {
            this.golos[jornada - 1] = golos;
        } else {
            System.out.println("Número de jornada inválido. Deve estar entre 1 e 34.");
        }
    }

    public int consultarGolos (int jornada){
        if (jornada >= 1 && jornada <= 34) {
            return this.golos[jornada - 1];
        } else {
            System.out.println("Número de jornada inválido. Deve estar entre 1 e 34.");
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

    public void totalGolos() {
        int total = 0;

        for (int i = 0; i < golos.length; i++) {
            total += golos[i];
        }
        System.out.println("Total de golos marcados pelo jogador: " + total);
    }

    public Object clone(){
        Jogador copia = new Jogador(this.nome);
        copia.nome = this.nome;
        copia.salario = this.salario;
        copia.golos = this.golos;
        copia.numero = this.numero;
        return copia;
    }

    public boolean equals (Object obj){
        if ( obj != null && this.getClass() == obj.getClass()) {
            Jogador jog = (Jogador) obj;
            return (this.salario == jog.salario && this.nome.equals(jog.nome) && this.golos == jog.golos);
        }else
            return false;
    }

}
