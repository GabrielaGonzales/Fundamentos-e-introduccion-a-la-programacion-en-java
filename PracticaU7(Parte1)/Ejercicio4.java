public class Ejercicio4{
    int[] arreglo;
    int contador;

    public Ejercicio4(int[] numeros){
        arreglo = numeros;
        contador = 0;
    }

    public void estrellas(int inicio, int fin){
        if(inicio < arreglo.length && fin <= arreglo.length && inicio >= 0){
            for (int i = inicio; i <= fin; i++) {
                if(arreglo[i] == 0){
                    contador = contador + 1;
                }else if(arreglo[i] == 1){
                    contador = contador + 0;
                }else{
                    System.out.println("Ese numero no existe en el cielo");
                }
            }
            System.out.println("Hay " + contador + " estrella(s) que han dejado de brillar");
        }else if(inicio < 0 && fin > arreglo.length || fin > arreglo.length || inicio < 0){
            System.out.println("Hay un parametro que no es valido");
        }
    }
}
