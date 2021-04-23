public class Cancion {
    private String tituloCancion;
    private String autorCancion;

    public Cancion(String tituloCancion, String autorCancion) {
        this.tituloCancion = tituloCancion;
        this.autorCancion = autorCancion;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }
    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }
    public String getAutorCancion() {
        return autorCancion;
    }
    public void setAutorCancion(String autorCancion) {
        this.autorCancion = autorCancion;
    }

    @Override
    public String toString() {
        return "Cancion [titulo = " + tituloCancion + " ,autor = " + autorCancion + "]";
    }
}
