package ejer9;

public class Cliente extends Persona {
    private int credito;
    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public Cliente(){
    }

    public int getCredito() {
        return credito;
    }

    public void imprimirCliente() {
        System.out.println("imprime cliente");
        System.out.println(this.getEdad());
        System.out.println(this.getNombre());
        System.out.println(this.getTelefono());
        System.out.println(this.getCredito());
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}
