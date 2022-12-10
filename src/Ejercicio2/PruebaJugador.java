package Ejercicio2;

public class PruebaJugador {
    public static void main(String[] args) {

        Jugador j1 = new Jugador("Juan","enano");
        Jugador j2 = new Jugador("Pedro","elfo");

        System.out.println("-----JUGADORES-----");
        System.out.println("Primer jugador: " + j1);
        System.out.println("--------------------");
        System.out.println("Segundo jugador: " + j2);

        j1.cambiarPerfil(3, 4, 5);
        j2.cambiarPerfil(5, 6, 7);

        System.out.println("---PERFIL-JUGADORES---");
        System.out.println("Primer jugador: " + j1);
        System.out.println("--------------------");
        System.out.println("Segundo jugador: " + j2);

        j1.intercambiarPersonajes(j2);

        System.out.println("--CAMBIO-DE-PERSONAJES--");
        System.out.println("Primer jugador: " + j1);
        System.out.println("--------------------");
        System.out.println("Segundo jugador: " + j2);


        System.out.println("-------GANADOR------");
        System.out.println("Jugador ganador es  " + j1.ganaAJugador(j2));
    }
}
