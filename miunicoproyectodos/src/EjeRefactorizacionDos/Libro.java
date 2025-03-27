package EjeRefactorizacionDos;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private Editorial editorial;

    public Libro(String titulo, String autor, int numeroPaginas, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
    }
    
    public void imprime() {
    	System.out.println(titulo+" "+autor+" "+numeroPaginas+" "+editorial);
    }
}
