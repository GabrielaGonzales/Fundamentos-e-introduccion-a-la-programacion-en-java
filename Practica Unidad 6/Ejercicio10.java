
public class Ejercicio10
{
    public String cantidadUnos(int numDecimal){
        int contador = 0;
        String res = "";
        int numBinario = notacionBinaria(numDecimal);
        while(numBinario > 0){
            int cifra = numBinario % 10;
            if(cifra == 1){
                contador = contador + 1;
                if(contador % 2 == 0){
                    res = "Malvado";
                }else{
                    res = "Odioso";
                }
            }
            numBinario = numBinario / 10;
        }
        return res;
    }
    
    private int notacionBinaria(int numero){
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
