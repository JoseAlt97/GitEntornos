package prueba;
import java.util.Scanner;

public class Pruebauno {

	public static void main(String[] args) {
		
		//Ejercicio 3
		
		float max= 0, min=0;
		
		Scanner reader = new Scanner (System.in);

		float numeros[];  
		numeros = new float[10];
		
		System.out.println("Dime 10 numeros");
		numeros[0] = reader.nextFloat();
		max = numeros[0];
		min = numeros[0];
		
		for (int i = 1; i<numeros.length;i++) {
			numeros[i] = reader.nextFloat();
			if (numeros[i]>max) {
				max = numeros[i];
			}
			if (numeros[i]<min) {
				min = numeros[i];
			}
		}
			System.out.print("max es "+max+" min es "+min);
	}

}
