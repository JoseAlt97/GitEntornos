package EjeRefactorizacionDos;

public class Ejer3 {

    public void verificarProducto(String producto, int stock) {
        final boolean esElectronico = producto.toLowerCase().contains("electrónico");
        final boolean esOferta = producto.toLowerCase().contains("oferta");
        final boolean hayStock = stock > 0;

        if (esElectronico && esOferta && hayStock) {
            System.out.println(producto);
        } else {
            System.out.println(producto+" no está disponible en oferta.");
        }
        
    }

    public static void main(String[] args) {
        Ejer3 ejer3 = new Ejer3();
        ejer3.verificarProducto("Televisor electrónico oferta disponible", 15);
    }
}

