public class Persona {
    private String nombre;
    private double dinero;
    private int nroFichas;

    
    public Persona(String nombre, double dinero, int nroFichas) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.nroFichas = nroFichas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    public int getNroFichas() {
        return nroFichas;
    }
    public void setNroFichas(int nroFichas) {
        this.nroFichas = nroFichas;
    }
}
