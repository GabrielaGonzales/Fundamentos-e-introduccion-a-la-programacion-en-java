public class Ejercicio1{
   public int cantidadDigitos(int numero){
       int res = 0;
       while(numero > 0){
           numero = numero / 10; 
           res = res + 1;
       }
       return res;
   }
}
