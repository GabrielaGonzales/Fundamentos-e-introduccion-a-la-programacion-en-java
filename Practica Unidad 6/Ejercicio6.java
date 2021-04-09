
public class Ejercicio6{
    public String sumaDivisores(int numero){
        int suma = 0;
        String res = " ";
        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                suma = suma + i;
                if(suma == numero){
                    res = "Numero Perfecto";
                }else if(suma > numero){
                    res = "Numero Abundante";
                }else if(suma < numero){
                    res = "Numero Defectivo";
                }
            }
        }
        return res;
    }
}
