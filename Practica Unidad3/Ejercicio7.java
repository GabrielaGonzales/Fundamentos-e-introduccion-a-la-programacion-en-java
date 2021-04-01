
public class Ejercicio7
{
    public int primerNumero(int numero){
        int res = 0;
        if(100 <= numero && numero <= 999){
            res = numero / 10;
            res = res / 10;
        }else{
            System.out.println("Numero fuera de rango ingresa numero de tres digitos");
        }

        return res;
    }
}
