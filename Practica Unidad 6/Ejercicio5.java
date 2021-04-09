
public class Ejercicio5{
    public int acarreo(int num1, int num2){
        int contador = 0;
        while(num1 > 0 && num2 > 0){
            int cifra1 = num1 % 10;
            int cifra2 = num2 % 10;
            int suma = cifra1 + cifra2;
            if(suma >= 10){
                contador = contador + 1;
                num1 = (num1 / 10) + 1;
                num2 = num2 / 10;
            }else if(suma < 10){
                num1 = num1 / 10;
                num2 = num2 / 10;
            }
        }
        return contador;
    }
}
