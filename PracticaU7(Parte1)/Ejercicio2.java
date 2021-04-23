public class Ejercicio2 {
    private int[] numeros;
    private int[] pares;
    private int[] impares;
    private int contadorPares;
    private int contadorImpares;
    private int[] resultado;

    public Ejercicio2(int[] arreglo){
        numeros = arreglo;
        contadorPares = 0;
        contadorImpares = 0;
    }

    private void paresImpares(){
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 == 0){
                contadorPares = contadorPares + 1;
            }else if(numeros[i]%2 != 0){
                contadorImpares = contadorImpares + 1;
            }
        }
    }

    private void agregar(){
        pares = new int[contadorPares];
        impares = new int[contadorImpares];
        int numP = 0;
        int numI = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 == 0){
                pares[numP] = numeros[i];
                numP = numP + 1;
            }else if(numeros[i]%2 != 0){
                impares[numI] = numeros[i];
                numI = numI + 1;
            }
        }
    }

    private void paraImpares() {
        int auxiliar;
        for (int i = 1; i <= impares.length; i++) {
            for (int j = 0; j <= impares.length-1-i; j++) {
                if (impares[j] > impares[j + 1]) {
                    auxiliar = impares[j];
                    impares[j] = impares[j+1];
                    impares[j+1] = auxiliar;
                }
            }
        }
    }

    private void paraPares(){
        int auxiliar;
        int temporal;
        for (int i = 1; i <= pares.length; i++) {
            for (int j = 0; j <= pares.length-1-i; j++) {
                if (pares[j] > pares[j + 1]) {
                    auxiliar = pares[j];
                    pares[j] = pares[j+1];
                    pares[j+1] = auxiliar;
                }
            }
        }
        for (int x = 0; x < pares.length / 2; x++) {
            temporal = pares[x];
            int indiceContrario = pares.length - x - 1;
            pares[x] = pares[indiceContrario];
            pares[indiceContrario] = temporal;
        }
    }

    public int[] luminosidadEstrellas(){
        paresImpares();
        agregar();
        paraImpares();
        paraPares();
        int i = 0;
        resultado = new int[numeros.length];
        for (i = 0; i < impares.length; i++ ){
            resultado[i] = impares[i];
        }

        for (int a = 0; a < pares.length; a++ ){
            resultado[i] = pares[a];
            i++;
        }
        return resultado;
    }
}