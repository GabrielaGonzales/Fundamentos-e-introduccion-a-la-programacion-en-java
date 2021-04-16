public class CuadernoDigital {
    private String tarea;
    private int contador;
    private boolean estadoTarea; // true = completada ; false = no concluida

    public CuadernoDigital(String tarea){
        this.tarea = tarea;
        contador = 1;
        estadoTarea = false;
    }

    public String cambiarEstadoTarea(){
        String mensaje = "";
        if(estadoTarea == true){
            estadoTarea = false;
            mensaje = "Se cambio el estado de la tarea a NO concluida";
        }else{
            estadoTarea = true;
            mensaje = "Se cambio el estado de la tarea a completada";
        }
        return mensaje;
    }

    public String escribirNuevaTarea(String tarea){
        String mensaje = "";
        if(estadoTarea == true){
            this.tarea = tarea;
            estado = false;
            contador = contador + 1;
            mensaje = "Nueva tarea asignada";
        }else{
            mensaje = "La tarea en curso, aun no ha sido concluida";
        }
        return mensaje;
    }

    public String mostrarEstadoTarea(){
        String estado = "";
        if(estadoTarea == true){
            estado = "La tarea esta completada";
        }else{
            estado = "La tarea esta en curso, no concluida";
        }
        return estado;
    }

    public void nroTareasEscritas(){
        System.out.println("El numero de tareas escritas totales escritas en el cuaderno son: " + contador);
    }
}
