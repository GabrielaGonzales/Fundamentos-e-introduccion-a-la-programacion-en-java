
public class Ejercicio6
{
    public void familia(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3){
        if(mayor(edad1, edad2) == mayor(edad1, edad3)){
            System.out.println("El hermano mayor es " + nombre1);
            System.out.println("El hermano del medio es " + nombre2);
            System.out.println("El hermano menor es " + nombre3);
        }else if(mayor(edad1, edad3) == mayor(edad2, edad3)){
            System.out.println("El hermano mayor es " + nombre3);
            System.out.println("El hermano del medio es " + nombre1);
            System.out.println("El hermano menor es " + nombre2);
        }else if(mayor(edad1, edad2) == mayor(edad2, edad3)){
            System.out.println("El hermano mayor es " + nombre2);
            System.out.println("El hermano del medio es " + nombre3);
            System.out.println("El hermano menor es " + nombre1);
        }
    }
    
    public int mayor(int a, int b){
        return a>b ? a:b;
    }
}
