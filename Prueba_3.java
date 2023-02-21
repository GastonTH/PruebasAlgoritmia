import java.util.Scanner;

public class Prueba_3 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		Desarrolle un algoritmo para el cálculo del salario de un trabajador. El importe
		liquidado (sueldo) depende de una tarifa o precio por hora establecida y de un
		condicionante sobre las horas trabajadas: si la cantidad de horas trabajadas es mayor a
		40 horas, la tarifa se incrementa en un 50% para las horas extras. Calcular el sueldo
		recibido por el trabajador en base las horas trabajadas y la tarifa. Utilice las
		instrucciones LEER HORASTRABAJADAS y LEER TARIFA al inicio del programa para
		cargar los valores en las variables HORASTRABAJADAS y TARIFA.
		*/
		
		int HORASTRABAJADAS = LEER_HORAS_TRABAJADAS();
		int TARIFA = LEER_TARIFA();
		float sueldo = CALCULAR_SUELDO(HORASTRABAJADAS, TARIFA);
		
		System.out.println("Horas trabajadas: " + HORASTRABAJADAS);
		System.out.println("Tarifa: " + TARIFA);
		System.out.println("Dicha tarifa aumenta en las horas extra (mas de 40) un 50%");
		System.out.println("El sueldo es: " + sueldo);
		
	}
	
	public static int LEER_HORAS_TRABAJADAS() {
		System.out.printf("Horas: ");
		return sc.nextInt();
	}
	public static int LEER_TARIFA() {
		System.out.printf("Tarifa: ");
		return sc.nextInt();
	}
	public static float CALCULAR_SUELDO(int horas, int tarifa) {
		
		int horasExtra = 0;
		float tarifaExtra = 0;
		float total = 0;
		
		if (horas>40) {
			horasExtra = horas - 40;
			tarifaExtra = tarifa + (tarifa * 50) / 100;
			total = (int) ((40 * tarifa) + (tarifaExtra * horasExtra));
		}else {
			total = horas * tarifa;
		}
		
		return total;
	}

}
