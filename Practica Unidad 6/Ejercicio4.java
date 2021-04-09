
public class Ejercicio4{

    public int factorial(int numero){
        int res = 1;
        if(numero == 0){
            res = 1;
        }else if(numero > 0){
            for(int i = 1; i <= numero; i++){
                res = res * i;
            }
        }
        return res;
    }
}
