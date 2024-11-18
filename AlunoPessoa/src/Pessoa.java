public class Pessoa { // Completar ****
    private String nome;
    private long NIF;
    private Telefone[] contactos;
    public Pessoa(String nome) {
        this.nome = nome;
        NIF = 0;
        contactos = new Telefone[3];
        for (int i = 0; i < contactos.length; i++) {
            contactos[i] = new Telefone();
        }
    }
    public String toString() {
        String s = "Nome: " + nome + " Nif: " + NIF + " Contactos: " ;
        for (int i = 0; i < contactos.length; i++) {
            s = s + " " + contactos[i];
        }
        return s;
    }

    public String getNome() {
        return nome;
    }

    public Telefone[] getContactos() {
        return contactos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContactos(Telefone[] contactos) {
        for (int i = 0; i < contactos.length; i++) {
              contactos[i].setTipo(contactos[i]. getTipo());
            contactos[i].setNumero(contactos[i]. getNumero());
        }
    }
}