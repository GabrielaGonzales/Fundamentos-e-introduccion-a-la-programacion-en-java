public class Producto {
    private String nombre;
    private double precio;
    private int cantidadProducto;

    public Producto(String nombre, double precio, int cantidadProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto [cantidadProducto=" + cantidadProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
}
