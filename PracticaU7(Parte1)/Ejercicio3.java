
public class Ejercicio3{
    private int[] arreglo;
    private int[] primeraMitad;
    private int[] segundaMitad;
    private int mitad1;
    private int mitad2;
    private int suma1;
    private int suma2;

    public Ejercicio3(int[] numeros){
        arreglo = numeros;
        mitad1 = 0;
        mitad2 = 0;
        suma1 = 0;
        suma2 = 0;
    }

    private void mitadArreglo(){
        int mitad = arreglo.length / 2;
        if(arreglo.length % 2 == 0){
            mitad1 = mitad;
            mitad2 = mitad;
        }else if(arreglo.length % 2 != 0){
            mitad1 = mitad;
            mitad2 = mitad + 1;
        }
    }

    private void agregarArreglosSeparados(){
        primeraMitad = new int[mitad1];
        segundaMitad = new int[mitad2];
        int contador = 0;

        for (int i = 0; i < mitad1; i++) {
            primeraMitad[i] = arreglo[i];
        }
        for (int j = mitad1; j < arreglo.length; j++) {
            segundaMitad[contador] = arreglo[j];
            contador = contador + 1;
        }
    }

    private void suma(){
        for (int i = 0; i < mitad1; i++) {
            suma1 = suma1 + primeraMitad[i];
        }
        for (int i = 0; i < mitad2; i++) {
            suma2 = suma2 + segundaMitad[i];
        }
    }

    public int numeroDesequilibrio(){
        int respuesta = 0;
        mitadArreglo();
        agregarArreglosSeparados();
        suma();
        while(arreglo.length > 1){
            if(suma1 > suma2){
                arreglo = primeraMitad;
                mitadArreglo();
                agregarArreglosSeparados();
                suma1 = 0;
                suma2 = 0;
                suma();
            }else if(suma2 > suma1){
                arreglo = segundaMitad;
                mitadArreglo();
                agregarArreglosSeparados();
                suma1 = 0;
                suma2 = 0;
                suma();
            }else if(suma1 == suma2){
                System.out.println("Los arreglos sumados son iguales");
            }
        }
        
        if(suma1 > suma2){
            respuesta = suma1;
        }else if(suma2 > suma1){
            respuesta = suma2;
        }else if(suma1 == suma2){
            System.out.println("Son iguales");
        } 
        
        return respuesta;
    }
}
