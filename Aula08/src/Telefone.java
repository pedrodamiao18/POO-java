public class Telefone {
    private String tipo; // Casa | Emprego | Móvel | ...
    private int numero;

    public Telefone (){
        this.tipo = "";
        this.numero = 0;
    }

    public Telefone (String tipo, int numero){
        this.tipo = tipo;
        this.numero = numero;
    }
    public String getTipo (){
        return tipo;
    }
    public int getNumero (){
        return numero;
    }
    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public void setNumero (int numero){
        this.numero = numero;
    }

    public String toString (){
        String s = "Tipo: " + tipo + " Número: " + numero;
        return s;
    }

    public Object clone () {
        Telefone copia = new Telefone ();
        copia.numero = this.numero;
        copia.tipo = this.tipo;
        return copia;
    }

    public boolean equals (Object obj) {
        if ( obj != null && this.getClass() == obj.getClass()) {
            Telefone tel = (Telefone) obj;
            return (this.numero == tel.numero && this.tipo.equals(tel.tipo));
        }else
            return false;
    }
}

