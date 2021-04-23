public class Suenio2 {
    private int prioridad;
    private String topico;
    private String descripcion;

    public Suenio2(int prioridad, String topico, String descripcion) {
        this.prioridad = prioridad;
        this.topico = topico;
        this.descripcion = descripcion;
    }
    
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public String getTopico() {
        return topico;
    }
    public void setTopico(String topico) {
        this.topico = topico;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}