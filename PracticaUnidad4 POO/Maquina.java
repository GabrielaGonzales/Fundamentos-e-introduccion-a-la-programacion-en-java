public class Maquina {
    private int savia;
    private int reflejosLagrimas;
    private boolean estado; // encendido = true ; apagado = false
    
    public Maquina() {
        savia = 0;
        reflejosLagrimas = 0;
        estado = false;
    }
    
    public String encenderMaquina(){
        String mensaje = "";
        if(estado == false){
            estado = true;
            mensaje = "La maquina se ha encendido";
        }else{
            mensaje = "La maquina ya estaba encendida";
        }
        return mensaje;
    }

    public String apagarMaquina(){
        String mensaje = "";
        if(estado == true){
            estado = false;
            mensaje = "La maquina se ha apagado";
        }else{
            mensaje = "La maquina ya estaba apagada";
        }
        return mensaje;
    }

    public String agregarSavia(int cantidad){
        String mensaje = "";
        if(estado == true){
            if(cantidad <= 90){
                savia = savia + cantidad;
                mensaje = "Se ha añadido la savia";
            }else{
                mensaje = "No hay suficiente espacio para añadir esa cantidad de savia";
            }
        }else{
            mensaje = "La maquina esta apagada no se puede realizar ninguna accion";
        }
        return mensaje;
    }

    public String crearReflejosLagrimas(){
        String mensaje = "";
        if(estado == true){
            if(savia >= 50){
                savia = savia - 50;
                reflejosLagrimas = reflejosLagrimas + 1;
                mensaje = "Se creo un Reflejo de Lagrima";
                if(reflejosLagrimas > 20){
                    mensaje = "Ya no se puede crear mas reflejos de lagrimas, espacio insuficiente";
                }
            }else{
                mensaje = "No se puede realizar la accion no hay savia suficiente";
            }
        }else{
            mensaje = "La maquina esta apagada no se puede realizar ninguna accion";
        }
        return mensaje;
    }
    
    public void mostrarContenido(){
        System.out.println("La cantidad de savia que hay en la maquina es: " + savia);
        System.out.println("La cantidad de reflejos de lagrimas que hay en la maquina es: " + reflejosLagrimas);
    }
    
    public void retirarTodoContenido(){
        savia = 0;
        reflejosLagrimas = 0;
        System.out.println("Se retiraron todos los componentes que estaban en la maquina");
    }
}
