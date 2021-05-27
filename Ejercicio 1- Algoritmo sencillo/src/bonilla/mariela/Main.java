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
        printMessage("========= ¡HOLA! ========\n\n");

        ArrayList<Integer> list = new ArrayList<>();
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

    static int readNum() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    static void printMessage(String msg){
        out.println(msg);
    }
}
