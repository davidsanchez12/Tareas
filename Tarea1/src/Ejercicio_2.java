import java.util.Random;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int jugador1 = 0;
        int jugador2 = 0;

        for (int lanzamiento = 1; lanzamiento <= 4; lanzamiento++) {
            int resultado = random.nextInt(6) + 1;

            System.out.println("Lanzamiento " + lanzamiento + ": Jugador 1 lanzó un " + resultado);

            if (lanzamiento <= 2) {
                jugador1 += resultado;
            } else {
                jugador2 += resultado;
            }
        }

        System.out.println("\nSuma total del Jugador 1: " + jugador1);
        System.out.println("Suma total del Jugador 2: " + jugador2);

        if (jugador1 > jugador2) {
            System.out.println("\n¡Jugador 1 gana!");
        } else if (jugador2 > jugador1) {
            System.out.println("\n¡Jugador 2 gana!");
        } else {
            System.out.println("\n¡Empate!");
        }
    }
}
