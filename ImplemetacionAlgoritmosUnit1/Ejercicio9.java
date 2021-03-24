import java.util.Scanner;
public class Ejercicio9{
    Scanner myObj = new Scanner(System.in);

    public int maquinaVerificacion(){
        System.out.println("Ingrese su carnet: ");
        int carnet = myObj.nextInt();
        int ultimoDigito = carnet % 10;
        return ultimoDigito;
    }
}
