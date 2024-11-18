import java.util.ArrayList;

public class Empregados {

    private int nss;
    private String nome;
    private ArrayList<Telefone> contactos;
    private double salario;

    public Empregados (){
        this.nome = "";
        this.nss = 0;
        this.salario = 0.0;
        this.contactos = new ArrayList<Telefone>();
    }

    public Empregados (String nome, int nss, double salario){
        this.nome = nome;
        this.nss = nss;
        this.salario = salario;
        this.contactos = new ArrayList<Telefone>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public ArrayList<Telefone> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Telefone> contactos) {
        this.contactos = (ArrayList<Telefone>) contactos.clone();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString(){
        return "Nome: " + nome + ", Número de segurança social: " + nss + ", Salário: " + salario + ", Contactos: " + contactos;
    }

    public boolean equals (Object obj){
        if ( obj != null && this.getClass() == obj.getClass()) {
            Empregados emp = (Empregados) obj;
            return (this.nss == emp.nss && this.nome.equals(emp.nome) && this.contactos.equals(emp.contactos) && this.salario == emp.salario);
        }else
            return false;
    }

    public Object clone(){
        Empregados copia = new Empregados();
        copia.nome = this.nome;
        copia.nss = this.nss;
        copia.salario = this.salario;
        copia.contactos = this.contactos;
        return copia;
    }

    public void subirSalario (double perc){
        this.salario += salario * (perc/100);
    }

    public void adicionarContacto(Telefone t){
        if(!contactos.contains(t)){
            contactos.add(t);
        }else
            System.out.println("Este contacto já está presente na sua lista de contactos.");
    }

    public int obterNumeroPorTipo(String tipo) {

        for (int i = 0; i < contactos.size(); i++) {
            Telefone telefone = contactos.get(i);
            if (telefone.getTipo().contains(tipo)) {
                return telefone.getNumero();
            }
        }
        return 0;
    }

}