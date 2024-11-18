public class Base {
    protected int a;
    protected int b;

    public Base(int a, int b) {
        this.a=a; this.b=b;
    }

    public int soma(){
        return a+b;
    }

    public int soma(int x){
        return a+b+x;
    }

    public int getA(){return a;}
    public int getB(){return b;}
    public void setA(int a){this.a = a;}
    public void setB(int b){this.b = b;}

    public String toString (){
        return "A = " + a + ", B = " + b + ", Soma = " + soma();
    }

    public boolean equals (Object o ){
        if ( o != null && this.getClass() == o.getClass()){
            Base ba = (Base) o;
            return (this.a == ba.a && this.b == ba.b );
        }else
            return false;
    }

    public Object clone () {
        Base copia = new Base(this.a, this.b);
        return copia;
    }
}

