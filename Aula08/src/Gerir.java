import java.util.ArrayList;
import myinputs.Ler;

public class Gerir {
    private  ArrayList<Empregados> empregados;


    public Gerir() {
        empregados = new ArrayList<>();
    }

    static int menu() {
        System.out.println("Opções: ");
        System.out.println("1 – Criar empregado;");
        System.out.println("2 – Consultar todos os empregados;");
        System.out.println("3 – Modificar um empregado;");
        System.out.println("4 – Apagar um empregado;");
        System.out.println("5 – Qual o valor total a pagar em salário aos empregados;");
        System.out.println("6 – Quais os empregados que não têm telefone fixo?");
        System.out.println("7 – Terminar.");
        int op;
        op = Ler.umInt();
        return op;
    }

    public void criarEmpregado() {
        System.out.println("Nome: ");
        String nome = Ler.umaString();
        System.out.println("Número de segurança social: ");
        int nss = Ler.umInt();
        System.out.println("Salário: ");
        double salario = Ler.umDouble();

        Empregados emp = new Empregados(nome, nss, salario);

        System.out.println("\nContacto: ");
        System.out.println("Tipo de telefone: ");
        String tipo = Ler.umaString();

        System.out.println("Número de telefone: ");
        int numero = Ler.umInt();

        Telefone t1 = new Telefone(tipo,numero);
        ArrayList<Telefone> tele;

        tele = new ArrayList<>();

        tele.add(t1);

        emp.setContactos(tele);

        empregados.add(emp);
        System.out.println("Empregado adicionado");
    }

    public void consultarEmpregados(){
        for (int i = 0; i < empregados.size(); i++) {
            System.out.println(empregados.get(i));
        }
    }

    public void modificarEmpregado(int nss){

        for (int j = 0; j < empregados.size(); j++) {
            Empregados emp = empregados.get(j);
            if(emp.getNss() == nss){
                System.out.print("Novo nome: ");
                emp.setNome(Ler.umaString());
                System.out.print("Novo salário: ");
                emp.setSalario(Ler.umDouble());
            }else{
                System.out.println("Não existem empregados com esse nss.");
            }
        }
    }

    public void apagarEmpregado (int nss){

        for (int i = 0; i < empregados.size(); i++) {
            Empregados emp = empregados.get(i);
            if (emp.getNss() == nss){
                empregados.remove(i);
            }else{
                System.out.println("Não existem empregados com esse nss.");
            }
        }
    }

    public void totalSalarios(){
        double total = 0;

        for (int i = 0; i < empregados.size(); i++) {
            total += empregados.get(i).getSalario();
        }
        System.out.println("Total a pagar em salários aos empregados: " + total);
    }

    public void empregadoSemTelefoneFixo() {
        for (int i = 0; i < empregados.size(); i++) {
            Empregados emp = empregados.get(i);

            for (int j = 0; j < emp.getContactos().size(); j++) {
                Telefone tel = emp.getContactos().get(j);
                if (!tel.getTipo().contains("Casa")) {
                    System.out.println(emp);
                }
            }
        }
    }


    public static void main(String[] args) {
        int escolha, nss;

        Gerir gerir = new Gerir();

        do {
            escolha = menu();
            switch (escolha) {
                case 1:
                    gerir.criarEmpregado();
                    break;
                case 2:
                    gerir.consultarEmpregados();
                    break;
                case 3:
                    System.out.println("Insira o nss do empregado que pretende modificar os dados: ");
                    nss = Ler.umInt();
                    gerir.modificarEmpregado(nss);
                    break;
                case 4:
                    System.out.println("Insira o nss do empregado que predente eliminar: ");
                    nss = Ler.umInt();
                    gerir.apagarEmpregado(nss);
                    break;
                case 5:
                    gerir.totalSalarios();
                    break;
                case 6:
                    gerir.empregadoSemTelefoneFixo();
                    break;
            }
        }while (escolha < 7);
    }
}
