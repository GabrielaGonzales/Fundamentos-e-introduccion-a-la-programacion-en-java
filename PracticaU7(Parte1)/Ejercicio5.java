public class Ejercicio5{
    int contador;
    public int[] sombraCipres(int valorInicial, int prediccion){
        contador = 1;
        int[] resultado = new int[prediccion];
        resultado[0] = valorInicial;
        for (int i = 0; i < prediccion-1; i++) {
            if(resultado[i] % 2 == 0){
                resultado[i+1] = resultado[i] / 2;
            }else if(resultado[i] % 2 != 0){
                resultado[i+1] = resultado[i] + contador;
                contador = contador + 1;
            }
        }
        return resultado;
    }
}
