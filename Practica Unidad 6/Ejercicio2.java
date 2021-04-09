public class Ejercicio2
{
    public String primoCompuesto(int numero){
        String res = " ";
        int resp = 0;
        for(int i=1 ; i <= numero ; i++){
            if(numero % i == 0){
                resp = resp + 1;
                if(resp == 2){
                    res = "Es un Numero Primo";
                }else if(resp > 2){
                    res = "Es un numero compuesto";
                }
            }
        }
        return res; 
    }
}
