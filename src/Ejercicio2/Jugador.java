package Ejercicio2;

public class Jugador {
   String nombre;
   String personaje;
   Perfil perfil;

    public Jugador(String nombre, String personaje) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.perfil = new Perfil(0, 0, 0);
    }

    public void cambiarPerfil(int valor, int carisma, int suerte) {
        this.perfil = new Perfil(valor, carisma, suerte);
    }

    public void intercambiarPersonajes(Jugador j) {
        String tmp = this.personaje;
        this.personaje = j.personaje;
        j.personaje = tmp;
    }

    public Jugador ganaAJugador(Jugador jugador) {
        return this.perfil.nivelPerfil() > jugador.perfil.nivelPerfil() ? this : jugador;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nPersonaje: " + this.personaje + "\n" + this.perfil;
    }
}
