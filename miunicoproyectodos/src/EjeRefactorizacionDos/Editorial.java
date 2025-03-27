package EjeRefactorizacionDos;

public class Editorial {
    private String nombre;
    private String isbn;

    public Editorial(String nombre, String isbn) {
        this.nombre = nombre;
        this.isbn = isbn;
    }
    
    
    public String toString() {
        return nombre + " ISBN: " + isbn + "";
    }
}

