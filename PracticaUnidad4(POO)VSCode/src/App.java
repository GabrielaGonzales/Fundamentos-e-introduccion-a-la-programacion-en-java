public class App {
    public static void main(String[] args) throws Exception {
        AsistentePersona asistente = new AsistentePersona("Gabriela");
        System.out.println(asistente.agregarNombre());
        asistente.cambiarNombre("Santi");
        System.out.println(asistente.agregarNombre());
    }
}
