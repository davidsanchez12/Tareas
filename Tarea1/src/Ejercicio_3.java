import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        System.out.println("Ingrese su nombre completo");
        Scanner nombre = new  Scanner(System.in);
        String datos = nombre.nextLine();
        String[] palabra = datos.split(" ");

        for (String separacion : palabra) {
            int longitud = separacion.length();
            System.out.println("Palabra: " + separacion + ", Cantidad de letras: " + longitud);
        }


    }
}
