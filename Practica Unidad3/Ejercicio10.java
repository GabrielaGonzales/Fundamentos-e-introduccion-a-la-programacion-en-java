
public class Ejercicio10
{
    public String mundoNumeros(int num){   //279
        String res = "";
        if(100 <= num && num <= 999){
            int digitoFinal = num % 10;   //9
            int temp = num / 10;          //27
            int digitoMedio = temp % 10;  //7
            int digitoInicial = temp / 10; //2
            if(digitoInicial <= digitoMedio && digitoMedio <= digitoFinal){
                res = "Es un numero en crecimiento";
            }else{
                res = "No es un numero en crecimiento";
            }
        }else{
            res = "Ingrese un numero de tres digitos";
        }
        return res;
    }
}
