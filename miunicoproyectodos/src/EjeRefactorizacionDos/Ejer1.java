package EjeRefactorizacionDos;

public class Ejer1 {

	public static void procesarPedido(String cliente, double total) {
	    System.out.println("Pedido confirmado:");
	    mostrarDetallesPedido(cliente, total);
	    System.out.println("Fecha de entrega estimada: 5 días hábiles");
	}

	public static void mostrarDetallesPedido(String cliente, double total) {
	    System.out.println("Cliente: " + cliente);
	    System.out.println("Total a pagar: " + total);
	}
	
	public static void main(String[] args) {
       String cliente = "jose";
       double total = 65.30;
       procesarPedido(cliente, total);
       mostrarDetallesPedido(cliente, total);
    }
}
