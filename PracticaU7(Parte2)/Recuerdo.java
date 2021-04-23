public class Recuerdo {
    private Fecha fecha;
    private String descripcion;
    
    public Recuerdo(Fecha fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
