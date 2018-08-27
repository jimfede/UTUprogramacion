import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese precio del producto:");
		float precio = entrada.nextFloat();
		System.out.println("Ingrese cantidad del producto:");
		int cant = entrada.nextInt();
		float res = precio * cant;
		if (res > 100) {
			System.out.println("El total a pagar es $" + (res / 1.05));
		} else {
			System.out.println("El total a pagar es $" + (res * 1.10));
		}

	}

}
