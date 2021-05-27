package bonilla.mariela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = new PrintStream(System.out);

    public static void main(String[] args) throws IOException {

        int option = 0;
        do {
            menu();
            option = readNum();
            execAction(option);
        }while (option != 3);

    }

    static void menu(){
        String message = "Menu del Laboratorio 1: Diagnóstico de Java\n";

        message += "1. Ejercicio 1 -  Algoritmo sencillo\n";
        message += "2. Ejercicio 2 - Orientación a objetos\n";
        message += "3. Salir\n";
        message += "Ingrese una opcion";
        printMessage(message);
    }

    static void execAction(int opt) throws IOException {
        switch (opt){
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            default:
                printMessage("Opcion invalida");
                break;
        }
    }

    static int readNum() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    static void printMessage(String msg){
        out.println(msg);
    }

    /** ==============     Inicio del ejercicio 1     =================**/
    static void ejercicio1 () throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        printMessage("Inicio de Ejercicio 1 \n Debe ingresar 5 numeros");
        for (int i = 0; i < 5; i++){
            printMessage("Ingrese el numero #" + (i+1));
            list.add(readNum());
        }
        printSortList(list);
    }

    static void printSortList(ArrayList<Integer> list){
        Collections.sort(list);
        StringBuilder message = new StringBuilder("Lista de numeros ordenados: => ");
        for (int e : list){
            message.append(" ").append(e);
        }
        printMessage(message.toString());
    }
    /** ==============     Fin del ejercicio 1     =================**/


    /** ==============     Inicio del ejercicio 2     =================**/
    static void ejercicio2 () throws IOException {
        printMessage("Inicio de Ejercicio 2");
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
    /** ==============     Fin del ejercicio 2     =================**/

}
