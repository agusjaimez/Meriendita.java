public class Proyecto {
    public static void main(String[] args) {
        String texto = "Hola";
        Persona persona1 = new Persona("Pedro", "Depaul", "77777");
        Persona persona2 = new Persona("Juancin", "Tontin", "43811872");
        String apellidoPersona1 = persona1.getApellido();
        System.out.println(apellidoPersona1);
        System.out.println(persona2.getApellido());
        persona1.setApellido("pt");
        System.out.println(apellidoPersona1);
    }
}