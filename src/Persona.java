public class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nom, String apellido, String dni) {
        this.nombre = nom;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setApellido(String apel) {
        this.apellido = apel;
    }

    public void setDni(String documento) {
        this.dni = documento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void hablar(String pelotudeces) {
        System.out.println(pelotudeces);
    }

    public void contarChiste(String chiste) {
        System.out.println(chiste);
    }
}
