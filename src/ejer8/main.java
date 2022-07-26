package ejer8;


public class main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(28);
        persona.setNombre("María");
        persona.setTelefono("541123456789");
        System.out.println(persona.getNombre() + " tiene " +persona.getEdad() + " años de edad y su teléfono es " + persona.getTelefono());
    }
}