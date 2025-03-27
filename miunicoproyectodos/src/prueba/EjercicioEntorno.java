package prueba;

public class EjercicioEntorno {
	 public static void main(String[] args) {
		 int[] numeros = {5, 2, 8, 1, 3};
		 int suma = calcularSuma(numeros);
		 double promedio = calcularPromedio(numeros);
	
		 System.out.println("Suma: " + suma);
		 System.out.println("Promedio: " + promedio);
	
		 int maximo = encontrarMaximo(numeros);
		 System.out.println("Número máximo: " + maximo);
	 }
	 
	 public static int calcularSuma(int[] nums) {
		 int suma = 0;
		 
		 for (int i = 0; i <nums.length; i++) { // Error aquí
			 suma += nums[i];
		 }
		 
		 return suma;
	 }
	 
	 public static double calcularPromedio(int[] nums) {
		 double decimalesSuma = calcularSuma(nums);
		 double decimalesLongitud = nums.length;
		 double decimales=decimalesSuma/decimalesLongitud;
		return decimales; // Error aquí
	 }
		 
	 public static int encontrarMaximo(int[] nums) {
		int max = Integer.MIN_VALUE; // Error aquí: ¿qué pasa si todos los valores son negativos?
		for (int num : nums) {
			 if (num > max) {
			 max = num;
			 }
		}
	 return max;
	 }
}