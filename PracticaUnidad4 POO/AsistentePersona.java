public class AsistentePersona {
    private String nombreUsuario;

    public AsistentePersona(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String agregarNombre(){
        String saludo = "Hola " + getNombreUsuario();
        return saludo;
    }

    public void cambiarNombre(String nombre){
        setNombreUsuario(nombre);
    }
}