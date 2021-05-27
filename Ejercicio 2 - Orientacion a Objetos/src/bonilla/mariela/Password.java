package bonilla.mariela;

import java.util.Random;

public class Password {
    private int longitud;
    private String contrasenna;

    public Password() {
        longitud = 8;
        contrasenna = "";
    }

    public Password(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public boolean esFuerte() {
        int contMayus = 0;
        int contMinus = 0;
        int contNum = 0;
        for (int i = 0; i < contrasenna.length(); i++){
            if (Character.isUpperCase(contrasenna.charAt(i))){
                contMayus++;
            }
            if (Character.isLowerCase(contrasenna.charAt(i))){
                contMinus++;
            }

            if (Character.isDigit(contrasenna.charAt(i))){
                contNum++;
            }
        }
        return contMayus >= 2 && contMinus >= 1 && contNum >= 5;
    }

    public void generarContrasenna(){
        Random aleatorio = new Random();
        String newPassword = "";
        String values = "1234567890ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz1234567890";
        for (int i = 0; i < longitud; i++){
            String valueGenerado = String.valueOf(values.charAt(aleatorio.nextInt(values.length())));
            newPassword += valueGenerado;
        }
        setContrasenna(newPassword);
    }
}
