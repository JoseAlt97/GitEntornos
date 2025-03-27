package EjeRefactorizacionDos;

public class EmailValido { 
    public static boolean emailValido(String email) {
        return email.contains("@") && email.contains(".");
    }
}

