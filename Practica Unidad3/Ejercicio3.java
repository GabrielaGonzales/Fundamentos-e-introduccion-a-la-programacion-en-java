
public class Ejercicio3
{
    public String diaEspecial(int dia){
        int ultimoDigito = dia % 10;
        int primerDigito = dia / 10;
        int divisible2u = ultimoDigito % 2;
        int divisible2p = primerDigito % 2;
        String respuesta = " ";
        
        if(divisible2u == 0 && divisible2p != 0){
            respuesta = "Cruz de Dariel";
        }else if(divisible2u != 0 && divisible2p == 0){
            respuesta = "Cruz de Dariel";
        }else{
            respuesta = "Dia normal";
        }
        
        return respuesta;
    }
}
