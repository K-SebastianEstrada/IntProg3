public class Persona {
    
    private String nombre;
    private String Telefono;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        Persona pr = new Persona();

        pr.setNombre("Juan");
        pr.setTelefono("123456789");
        pr.setEdad(20);

        System.out.println("Nombre: " + pr.getNombre());
        System.out.println("Telefono: " + pr.getTelefono());
        System.out.println("Edad: " + pr.getEdad());

    }
}
