public class Musica {
    private String tituloCancion;
    private String nombreArtista;
    private double duracion;

    public Musica(String tituloCancion, String nombreArtista, double duracion) {
        this.tituloCancion = tituloCancion;
        this.nombreArtista = nombreArtista;
        this.duracion = duracion;
    }
    public String getTituloCancion() {
        return tituloCancion;
    }
    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }
    public String getNombreArtista() {
        return nombreArtista;
    }
    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Musica [duracion=" + duracion + ", nombreArtista=" + nombreArtista + ", tituloCancion=" + tituloCancion
                + "]";
    }
}