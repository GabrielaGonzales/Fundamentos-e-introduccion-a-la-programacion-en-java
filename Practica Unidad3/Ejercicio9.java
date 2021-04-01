
public class Ejercicio9
{
    public String anioBisiesto(int anio){
        String res = " ";
        if(anio % 4 == 0 && anio % 100 != 0){
            res = "Es Bisiesto";
        }else if(anio % 400 == 0){
            res = "Es Bisiesto";
        }else{
            res = "No es Bisiesto";
        }
        return res;
    }
}
