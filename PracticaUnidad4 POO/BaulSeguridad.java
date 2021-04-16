public class BaulSeguridad {
    private boolean estadoBaul;
    private int clave;

    public BaulSeguridad() {
        estadoBaul = false;
        clave = 1111;
    }

    public String abrirBaul(int clave){
        String mensaje = " ";
        if(estadoBaul == false){
            if(clave == this.clave){
                estadoBaul = true;
                mensaje = "El baul esta abierto";
            }else{
                mensaje = "La clave ingresada en incorrecta";
            }
        }else{
            mensaje = "El baul ya esta abierto";
        }
        return mensaje;
    }

    public String cerrarBaul(){
        String mensaje = " ";
        if(estadoBaul == true){
                mensaje = "El baul se cerro exitosamente";
                estadoBaul = false;
        }else{
            mensaje = "El baul ya esta cerrado";
        }
        return mensaje;
    }


    public String cambiarClave(int numero) {
        String mensaje = " ";
        if(estadoBaul == true){
            if(cantidadDigitos(numero) == 4){
                clave = numero;
                mensaje = "La clave se ha cambiado";
            }else{
                mensaje = "La clave tiene que ser de minimo 4 digitos";
            }
        }else{
            mensaje = "El baul esta cerrado";
        }
        return mensaje;
    }

    private int cantidadDigitos(int numero) {
        int res = 0;
        while (numero > 0) {
            numero = numero / 10;
            res = res + 1;
        }
        return res;
    }
}
