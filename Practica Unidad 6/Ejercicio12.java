
public class Ejercicio12{
    public int divisionClasica(int divisor, int dividendo){
        int res = 0;
        while(divisor >= dividendo){
            divisor = divisor - dividendo;
            res = res + 1;
        }
        return res;
    }
}
