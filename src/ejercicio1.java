import java.time.Year;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = input.nextLine();
		System.out.print("Ingrese CI: ");
		String cedula = input.nextLine();
		System.out.print("Ingrese a�o de nacimiento: ");
		Integer anioNacimiento = input.nextInt();
		System.out.print("Ingrese domicilio: ");
		String domicilio = input.next();
		Integer edad = Year.now().getValue() - anioNacimiento;
		
		System.out.println("La edad de " + nombre + " es " + edad);

	}

}
