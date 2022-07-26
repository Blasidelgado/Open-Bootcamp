package ejer3;

public class Main {
    public static void main(String[] args) {
        suma(2, 3, 5);
        System.out.println(suma(2, 3, 5));

        Coche miCoche = new Coche();
        miCoche.NuevaPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
