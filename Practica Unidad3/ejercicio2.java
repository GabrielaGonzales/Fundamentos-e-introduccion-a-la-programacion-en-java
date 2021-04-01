public class ejercicio2
{
    public int totalMinimo(int a,int b,int c){
        int sumaTotal=a+b+c;
        int mayorParcial= mayor(a,b);
        int x= mayor(mayorParcial,c);
        return sumaTotal-x;
    }
    
    public int mayor(int a, int b){
        return a>b ? a:b;
    }
}