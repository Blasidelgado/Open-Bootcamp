package ejer9;

public class Trabajador extends Persona {
    private int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public Trabajador(){
    }

    public int getSalario() {
        return salario;
    }

    public void imprimirTrabajador() {
        System.out.println("imprime trabajador");
        System.out.println(this.getEdad());
        System.out.println(this.getNombre());
        System.out.println(this.getTelefono());
        System.out.println(this.getSalario());
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
