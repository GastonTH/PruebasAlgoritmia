import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Prueba_2 {

	public static void main(String[] args) {
		/*Escriba ritmo que visualice una clasificación de 50 personas según edad y sexo.
		Deberá mostrar los siguientes resultados:
		a. Cantidad de personas mayores de edad (18 años o más).
		b. Cantidad de personas menores de edad.
		c. Cantidad de personas masculinas mayores de edad.
		d. Cantidad de personas femeninas menores de edad.
		e. Porcentaje que representan las personas mayores de edad respecto al total de personas.
		f. Porcentaje que representan las mujeres respecto al total de personas.
		
		Utilice la instrucción LEER PERSONAS al inicio del programa para cargar los datos de las
		50 personas en un variable, PERSONAS, que actúa como un vector de 50 posiciones.
		Cada elemento de PERSONAS es de un tipo estructurado que dispone dos campos: SEXO y EDAD.
		 * */
		
		Persona[] PERSONAS = new Persona[50];
		PERSONAS = LEER_PERSONAS();
		int nPersonas = 50;
		int mayorEdad = 0;
		int menorEdad = 0;
		int mMayorEdad = 0;
		int fMenorEdad = 0;
		int totalMujeres = 0;
		
		for (int i = 0; i < PERSONAS.length; i++) {
			
			System.out.println(PERSONAS[i]);
			
			if (PERSONAS[i].getAge() >= 18) {
				// a. mayor de edad
				mayorEdad++;
				if (PERSONAS[i].getGender().equals("Masculino")) {
					// e. si es mayor de edad y ademas es masculino, entonces es un hombre mayor de edad
					mMayorEdad++;
				}
				
			}else {
				// b. menor de edad
				menorEdad++;
				if (PERSONAS[i].getGender().equals("Femenino")) {
					// d. sera una mujer menor de edad
					fMenorEdad++;
				}
			}
			
			if (PERSONAS[i].getGender().equals("Femenino")) {
				totalMujeres++;				
			}
			
		}
		
		// resultado final
		System.out.println("a. Cantidad de personas mayores de edad (18 años o más) -> " + mayorEdad);
		System.out.println("b. Cantidad de personas menores de edad. -> " + menorEdad);
		System.out.println("c. Cantidad de personas masculinas mayores de edad. -> " + mMayorEdad);
		System.out.println("d. Cantidad de personas femeninas menores de edad. -> " + fMenorEdad);
		System.out.println("e. Porcentaje que representan las personas mayores de edad respecto al total de personas. -> " + ((mayorEdad*100)/nPersonas) + "%");
		System.out.println("f. Porcentaje que representan las mujeres respecto al total de personas. -> " + ((totalMujeres*100)/nPersonas) + "%");
		
	}
	
	public static Persona[] LEER_PERSONAS() {
		
		Persona[] aux = new Persona[50];
		
		for (int i = 0; i < 50; i++) {
			int rGender = (int) Math.floor(Math.random() *(1 - 0 + 1) + 0);
			int rAge = (int) Math.floor(Math.random() *(100 - 0 + 1) + 0);
			
			Persona p;
			
			if (rGender == 1) {
				// sera femenino
				p = new Persona(rAge, "Femenino");
			}else {
				// sera masculino
				p = new Persona(rAge, "Masculino");
			} 
			
			aux[i] = p;
						
		}
		
		return aux;
		
	}

}
