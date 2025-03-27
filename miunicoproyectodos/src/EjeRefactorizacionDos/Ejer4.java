package EjeRefactorizacionDos;

public class Ejer4 {
    
    private double ancho;
    private double alto;
    final private int nMagico = 2;

    // Constructor
    public Ejer4(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void calcularValores() {
        final double area = ancho * alto;
        final double perimetro = nMagico * (ancho + alto);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    public static void main(String[] args) {
        Ejer4 figura = new Ejer4(5, 10); 
        figura.calcularValores();
        Ejer4 figurados = new Ejer4(10, 15); 
        figurados.calcularValores();

    }
}
