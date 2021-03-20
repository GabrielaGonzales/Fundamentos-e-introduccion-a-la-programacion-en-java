public class Gato{
   private int edad;
   private double peso;
   private String nombre;
   
   public Gato(int edad, double peso, String nom){
       this.edad = edad;
       this.peso = peso;
       nombre = nom;
   }
   
   //valor de un atributo get devuelve,dar
   public int getEdad(){
       return edad;
   }
   
   //no te devuelve nada por eso void, set establecer un nuevo valor
   public void setEdad(int valor){
       edad = valor;
   }
}
