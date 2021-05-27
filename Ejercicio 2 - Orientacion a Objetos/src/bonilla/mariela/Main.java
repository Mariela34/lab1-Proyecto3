package bonilla.mariela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = new PrintStream(System.out);

    public static void main(String[] args) throws IOException {
        printMessage("========= ¡HOLA! ========\n");
        printMessage("Realice los siguientes pasos para generar una contraseña:\n");
        printMessage("  Ingrese la longitud de caracteres deseados");
        int length = readNum();
        generatePassword(length);
    }

    static void generatePassword( int length){
        Password password = new Password(length);
        printMessage("Generando contraseña...");
        password.generarContrasenna();
        printMessage("Contraseña generada: " + password.getContrasenna());
        validateStrong(password);
    }

    static void validateStrong(Password pass){
        String response = "";
        if(pass.esFuerte()){
            response += "¡Éxito! La contraseña es fuerte";
        } else {
            response += "¡AVISO! La contraseña no es fuerte";
        }
        printMessage(response);
    }

    static int readNum() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    static void printMessage(String msg){
        out.println(msg);
    }
}
