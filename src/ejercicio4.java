import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero entero:");
		Scanner entrada = new Scanner(System.in);
		
		int numA = entrada.nextInt();
		if(numA > 50) {
			System.out.println(numA*2);
		}
		else {
			System.out.println(numA/2);
		}

	}

}
