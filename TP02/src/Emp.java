
public class Emp {
    private long nss;
    private String nome;
    private double sal;

    public Emp() {
        nss = 0;
        nome = "";
        sal = 0.0;
    }

    public Emp(String x) {
        nome = x;
        nss = 0;
        sal = 0.0;
    }

    public long getNss(){
        return nss;
    }

    public void setNss( long x){
        nss = x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void subirS (double perc){
        sal = sal + sal * perc / 100.0;
    }

    public String toString(){
        return "Nss = " + nss + " Nome = " + nome + " Salário = " + sal;
    }
}
