
public class Ejercicio8{
    public int juntarNumeros(int numero){
        int ultimoNumero = numero % 10;
        int primerNumero = numero / (int) Math.pow(10, cantidadDigitos(numero));
        int resultado = (ultimoNumero * 10) + primerNumero;
        return resultado;
    }
    
    private int cantidadDigitos(int numero){
        int res = 0;
        while(numero > 0){
            numero = numero / 10; 
            res = res + 1;
        }
        return res - 1;
    }
}
