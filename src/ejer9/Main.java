package ejer9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(44, "Ernesto", "54011667788", 4000);
        Cliente cliente2 = new Cliente();
        Trabajador trabajador1 = new Trabajador(60, "Javi", "552352456", 2000);
        cliente2.setEdad(22);
        cliente2.setNombre("Claudio");
        cliente2.setTelefono("55875144");
        cliente2.setCredito(0);
        cliente1.imprimirCliente();
        cliente2.imprimirCliente();
        trabajador1.imprimirTrabajador();
        }
    }
