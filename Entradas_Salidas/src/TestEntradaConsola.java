
import java.util.Scanner;

public class TestEntradaConsola {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dame un numero :");
		while (!s.hasNextInt()) {
			System.out.println("Por favor introduzca solo un numero:  ");
			s.next();
		}
		int numero = s.nextInt();
		System.out.println("Tu numero es el " + numero);
		s.close();	
	}

}
