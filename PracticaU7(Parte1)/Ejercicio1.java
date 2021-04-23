public class Ejercicio1 {
    private int[] numeros;
    private int[] ordenados;
    private int menor;
    private int mayor;

    public Ejercicio1 (int[] arr) {
        numeros = arr;
        ordenados = copia(arr);
    }
    
    private int[] copia(int[] arreglo){
        int[] resultado = new int[arreglo.length];
        for(int i = 0 ; i < arreglo.length; i++){
            resultado[i] = arreglo[i];
        }
        return resultado;
    }
    
    private void burbuja() {
        int auxiliar;
        for (int i = 1; i <= ordenados.length; i++) {
            for (int j = 0; j <= ordenados.length-1-i; j++) {
                if (ordenados[j] > ordenados[j + 1]) {
                    auxiliar = ordenados[j];
                    ordenados[j] = ordenados[j+1];
                    ordenados[j+1] = auxiliar;
                }
            }
        }
    }

    private void mayorMenor(){
        menor = numeros[0];
        mayor = numeros[0];
        for(int i = 1; i < numeros.length ; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
    }
    
    /*private void mayorMenor(){
        menor = ordenados[0];
        mayor = ordenados[numeros.length-1];
        Con burbuja el de arriba es sin burbuja
    }*/
    
    public void vortice(){
        int i = 0;
        int j = 0;
        //burbuja();
        mayorMenor();
        while(i < numeros.length && numeros[i] != menor){
            i++;
        }
        while(j < numeros.length && numeros[j] != mayor){
            j++;
        }
        if(i < j){
            System.out.print("El vortice esta formado por: ");
            for (int x = i; x <= j; x++) {
                System.out.print(numeros[x] + ", ");
            }
        }else if(i > j){
            System.out.print("El vortice esta formado por: ");
            for (int x = j; x <= i; x++) {
                System.out.print(numeros[x] + ", ");
            }
        }
    }

}