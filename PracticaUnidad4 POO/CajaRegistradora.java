import java.util.ArrayList;

public class CajaRegistradora {
    private ArrayList<Producto> productos;
    private double dineroAPagar;

    public CajaRegistradora() {
        productos = new ArrayList<Producto>();
        this.dineroAPagar = 0;
    }

    public void aniadirProductos(Producto producto){
        productos.add(producto);
    }

    public void factura(){
        for (Producto temp : productos) {
            System.out.println(temp.toString());
        }
    }

    public String precioTotal(){
        String total = "";
        int tamanio = productos.size();
        while (tamanio > 0) {
            for (Producto temp : productos) {
                dineroAPagar = dineroAPagar + temp.getPrecio() * temp.getCantidadProducto();
                tamanio = tamanio - 1;
            }
        }
        return total = "El precio que tiene que pagar es " + dineroAPagar;
    }

    public String pagoCliente(double pago){
        String mensaje = " ";
        if (pago == dineroAPagar) {
            mensaje = "Cobro exitoso, su cambio es: 0";
            dineroAPagar = 0;
            productos.clear();
        }else if(pago > dineroAPagar){
            dineroAPagar = pago - dineroAPagar;
            mensaje = "Cobro exitoso, su cambio es: " + dineroAPagar;
            dineroAPagar = 0;
            productos.clear();
        }else if(pago < dineroAPagar){
            mensaje = "Error: El dinero indicado no cubre la compra";
            dineroAPagar = 0;
            productos.clear();
        }
        return mensaje;
    }
}