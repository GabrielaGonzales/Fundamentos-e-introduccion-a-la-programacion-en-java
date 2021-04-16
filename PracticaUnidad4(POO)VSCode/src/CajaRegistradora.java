import java.util.ArrayList;

public class CajaRegistradora {
    private ArrayList<Producto> productos;
    private double dineroAPagar;
    
    public CajaRegistradora(ArrayList<Producto> producto) {
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
        while (productos.size() > 0) {
            for (Producto temp : productos) {
                dineroAPagar = dineroAPagar + temp.getPrecio() * temp.getCantidadProducto();
            }
        }
        return total = "El precio que tiene que pagar es " + dineroAPagar;
    }

    public void pagoCliente(double pago){
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
    }
}
