import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese precio del producto:");
		float precio = entrada.nextFloat();
		System.out.println("Ingrese cantidad del producto:");
		int cant = entrada.nextInt();
		float res = precio * cant;
		double total;
		if (res > 100) {
			total = res / 1.05;
			System.out.println("El total a pagar es $" + total);
		} else {
			total = res * 1.10;
			System.out.println("El total a pagar es $" + total);
		}

	}

}
