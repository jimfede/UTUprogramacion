import java.util.Scanner;

public class Escrito {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ingrese un úmero del 1 al 5");

		Integer num = input.nextInt();

		switch (num) {
		case 1:
			System.out.println("rojo");
			break;
		case 2:
			System.out.println("verde");
			break;
		case 3:
			System.out.println("azul");
			break;
		case 4:
			System.out.println("amarillo");
			break;
		case 5:
			System.out.println("naranja");
			break;
		default:
			System.out.println("ingrese un número del 1 al 5");
		}

		System.out.println("Ingrese el sobrante de nafta");

		float nivelNafta = 0;

		nivelNafta = input.nextFloat();

		if (nivelNafta < 3.3) {
			System.out.println("nivel bajo");
		} else if (nivelNafta >= 3.3 & nivelNafta < 6.6) {
			System.out.println("nivel medio");
		} else {
			System.out.println("nivel alto");
		}
	}

}
