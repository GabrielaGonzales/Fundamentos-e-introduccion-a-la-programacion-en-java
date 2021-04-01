
public class Ejercicio5
{
    public String parientes(int num1, int num2){
        String respuesta = " ";
        if(0 < num1 && num2 < 2147483647){
            if((num1 % num2) == 0){
                respuesta = "Son parientes";
            }else if((num2 % num1) == 0){
                respuesta = "Son parientes";
            }else{
                respuesta = "No son parientes";
            }
        }else{
            respuesta = "Ingrese otro numero";
        }
        return respuesta;
    }
}
