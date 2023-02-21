import java.util.Scanner;

public class Prueba_1 {

	public static void main(String[] args) {
		/*
		 * Escriba un algoritmo que lea un número entero y determine si es par o impar.
		 * Si es par, que escriba todos los pares de manera descendiente desde sí mismo y hasta el cero.
		 * Si es impar, que escriba todos los impares de manera descendiente desde si sí mismo hasta el uno.
		 * Utilice la instrucción LEER NUMERO al inicio del programa para cargar un número en la variable NUMERO.
		 * */
		
		int NUMERO;
		
		NUMERO = LEER_NUMERO();	
		
		if (NUMERO % 2 == 0) {
			// sera par
			System.out.println("ES PAR");
			
		}else {
			// sera impar
			System.out.println("ES IMPAR");
			
		}
		
		if (NUMERO > 0) {
			// si el numero es mayor a 0, osea positivo
			for (int i = NUMERO; i >= 0; i-=2) {
				System.out.println(i);
			}
		}else {
			// si el valor es negativo
			for (int i = NUMERO; i <= 0; i+=2) {
				System.out.println(i);
			}
			
		}

	}
	
	public static int LEER_NUMERO() {
		
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();

	}

}
