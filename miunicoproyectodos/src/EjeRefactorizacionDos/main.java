package EjeRefactorizacionDos;

public class main {

	public static void main(String[] args) {
		
		
		//Prueba del ejercicio Cliente
		Cliente jose = new Cliente ("jose","jose@hotmailom");
		System.out.println(EmailValido.emailValido(jose.getEmail()));
		
		//Prueba del ejercicio Libro
		Editorial book = new Editorial("prueba", "pruebados");
		Libro libro = new Libro("yo","jose", 190, book);
		
		libro.imprime();
	}

}
