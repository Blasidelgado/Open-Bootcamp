package ejer4;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int numeroif = new Random().nextInt((20 + 20) + 1) - 20;
        if (numeroif > 0) {
            System.out.println(numeroif + " is positive");
        } else if (numeroif == 0) {
            System.out.println(numeroif + " is 0");
        } else {
            System.out.println(numeroif + " is negative");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile + " se ejecuta en mi do.. while una vez");
        }
        while (numeroWhile > 50);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "invierno";
        switch (estacion) {
            case "verano" : System.out.println("Estamos en verano");
                break;
            case "otoño" : System.out.println("Estamos en otoño");
                break;
            case "invierno" : System.out.println("Estamos en invierno");
                break;
            case "primavera": System.out.println("Estamos en primavera");
                break;
            default: System.out.println(estacion + " no es una estación del año");
        }
    }
}