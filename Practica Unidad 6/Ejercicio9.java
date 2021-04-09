
public class Ejercicio9{
    public int notacionBinaria(int numero){
        int aux = numero;
        String binario = "";
        while(aux > 0){
            binario = aux % 2 + binario;
            aux = aux / 2;
        }
        int numBinario = Integer.parseInt(binario);
        return numBinario;
    }
}
