public class Taberna {
    private Suenio[] suenios;
    private int tamanio;
    private int contador;

    public Taberna(){
        contador = 0;
    }

    public void tamanioArreglo(int numero){
        tamanio = numero;
        suenios = new Suenio[tamanio];
    }

    public void almacenarSuenios(Suenio suenio){
        if(contador < tamanio){
            suenios[contador] = suenio;
            contador = contador + 1;
            System.out.println("El suenio ha sido almacenado exitosamente");
        }else{
            System.out.println("No ha sido posible almacenarlo, la memoria esta llena");
        }
    }

    public void eliminarSuenios(int posicion){
        if(posicion < tamanio){
            if(suenios[posicion] == null){
                System.out.println("El espacio indicado esta vacio");
            }else{
                suenios[posicion] = null;
                System.out.println("Se elimino el suenio");
            }
        }else{
            System.out.println("La posicion indicada no existe");
        }
    }

    public void buscarSuenio(String nombre){
        int busqueda = 0;
        if(suenios[busqueda].getNombre().equals(nombre)){
            System.out.println("El suenio llamado: " + nombre + " ,existe en la posicion: " + busqueda);
        }else{
            System.out.println("El suenio llamado: " + nombre + " no existe");
            busqueda++;
        }

    }

    public void verSuenios(){
        for(int i = 0; i < tamanio; i++){
            System.out.println(suenios[i].toString());
        }
    }
}
