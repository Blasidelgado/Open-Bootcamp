package ejer8;

public class ejer8 {
    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.setEdad(28);
       persona.setNombre("María");
       persona.setTelefono("541123456789");
       System.out.println(persona.getNombre() + " tiene " +persona.getEdad() + " años de edad y su teléfono es " + persona.getTelefono());
        }
    }

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
}