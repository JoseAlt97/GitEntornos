package EjeRefactorizacionDos;

public class Cliente {
    private String nombre;
    private String email;
    
    public Cliente (String nombre, String email) {
    	this.nombre=nombre;
    	if (EmailValido.emailValido(email)) {
    		this.email=email;
    	} else {
    		System.out.println("error mail");
    		this.email="";
    	}
    }
    
    public String getEmail() {
        return email;
    }
}
