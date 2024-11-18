public class Derivada extends Base{
    private int a;
    private int c;

    public Derivada(Base b, int a, int c){
        super(b.getA(),b.getB());
        this.a = a;
        this.c = c;
    }

    public int getAA() {
        return a;
    }

    public void setAA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String toString(){
        return "A = " + a + ", C = " + c + ", Base: " + super.toString();
    }

    public int somaD (){
        return a + c + super.getA() + super.getB();
    }


    public boolean equals(Object o) {
        if ( o != null && this.getClass() == o.getClass()){
            Derivada d = (Derivada) o;
            return (this.a == d.a && this.c == d.c && super.equals(d));
        }else
            return false;
    }

    public Derivada clone() {
        Base baseClone = (Base) super.clone(); // Clona o objeto Base
        return new Derivada(baseClone, this.a, this.c); // Cria um novo Derivada com os valores clonados
    }

}