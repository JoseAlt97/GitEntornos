package EjeRefactorizacionDos;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejer5 {

    public static String buscarColor(String[] colores) {
        String nada = "No se ha encontrado nada";
        ArrayList<String> coloresBuscados = new ArrayList<>();
        coloresBuscados.add("verde");

        for (String color : colores) {
            if (coloresBuscados.contains(color)) {
                return color; 
            }
        }
        return nada;
    }

    public static void main(String[] args) {
        String[] lista = {"verde", "azul"};
        System.out.println(buscarColor(lista));
    }
}





