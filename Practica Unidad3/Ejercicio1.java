
public class Ejercicio1
{
    public void capicua(int numero){
        if(numero >=100 && numero <= 999){
            int temp = numero % 10;
            int temp2 = numero / 10;
            int temp3 = temp2 % 10;
            int temp4 = temp2 / 10;
            int resultado = ((temp * 100) + (temp3 * 10) + temp4);
            if(resultado == numero){
                System.out.println("Si");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("El numero esta fuera del rango introduzca otro de 3 digitos");
        }
    }
}
