import java.util.*;

public class Ejercicio5_2 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		int mayorEdad = 0, menorEdad = 0, numeros, edad= 0, personaSexo= 0;

//inicializamos los String

	//	personaSexo = "Femenino, Masculino";

		System.out.println("Ingrese la cantidad de personas:");
		numeros = leer.nextInt();

//Imprimimos resultado final y operaciones correspondientes para comparar el sexo y edades

		for (int i = 0; i < numeros ; i++ ) {

			System.out.println("Persona "+(i+1));
			System.out.println("Ingrese su edad: ");
			edad = leer.nextInt(); 
			System.out.println("Ingrese el sexo:");
			System.out.println("1.Femenino");
			System.out.println("2. Masculino");
			personaSexo = leer.nextInt();

			if (personaSexo >= 18) {
				mayorEdad = edad;
			}
			 else 
			 {

			if (personaSexo < 18) {
				menorEdad = edad;
			}

			} 
		}

		for (int j = 0; j < numeros ;j++ ) {
			if (personaSexo >= 18) {
			System.out.println("Persona: "+(j+1));
			System.out.println("Sexo: "+personaSexo);
			System.out.println("Edad: "+mayorEdad);
			} else{
			System.out.println("Persona: "+(j+1));
			System.out.println("Sexo: "+personaSexo);
			System.out.println("Edad: "+menorEdad);
				}

			}

		 }
}