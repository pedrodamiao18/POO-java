
public class D {

	public static void main(String[] args) {
		int x;
		int resultado;
		
		resultado = 0;
		
		for(x = 1;x <= 100; x++) {
			if(x%2==1) {
			resultado = resultado + x;
			}
		}
		System.out.println(resultado);

	}

}
