
public class Ejercicio3{
    public int invertir(int numero){
        int modulo;
        int res = 0;
        while(numero != 0){
            modulo = numero % 10;
            numero = numero / 10;
            res = res * 10 + modulo;
        }
        return res;
    }
}
