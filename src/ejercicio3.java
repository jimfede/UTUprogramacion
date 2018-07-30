import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero");
		float numA = entrada.nextFloat();
		System.out.println("Ingrese el segundo numero");
		float numB = entrada.nextFloat();
		System.out.println("El reslutado de la suma es: " + (numA + numB));
		System.out.println("El reslutado de la resta es: " + (numA - numB));
		System.out.println("El reslutado de la multiplicacion es: " + (numA * numB));
		System.out.println("El reslutado de la division es: " + (numA / numB));
		
	}

}
