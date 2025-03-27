package EjeRefactorizacionDos;

public class Ejer2 {
	
	public static double calcularPrecioFinal(double precio, int edad) {
	    if (edad < 12 || edad > 60) {
	        return precio * 0.9;
	    }
	    return precio;
	}
	
	public static void main(String[] args) {
		double precio = 65;
		int edad = 70;
		System.out.println(calcularPrecioFinal(precio, edad));
		
	}
}
