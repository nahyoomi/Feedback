package Ejercicio2;

public class Perfil {
    Integer valor;
    Integer carisma;
    Integer suerte;

    public Perfil(Integer valor, Integer carisma, Integer suerte) {
        this.valor = valor;
        this.carisma = carisma;
        this.suerte = suerte;
    }

    public int  nivelPerfil( ){
        return this.valor + this.carisma + this.suerte;
    }

    public String toString() {
        return "Valor: " + this.valor + "\nCarisma: " + this.carisma + "\nSuerte: " + this.suerte;
    }
}
