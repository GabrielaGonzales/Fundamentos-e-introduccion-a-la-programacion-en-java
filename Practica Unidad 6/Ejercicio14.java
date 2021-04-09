public class Ejercicio14{
    
    public String numerosNovios(int n, int m){
        int sumaN= sumaNumPropios(n)-1;
        int sumaM= sumaNumPropios(m)-1;
        String res="No pasa nada"; 
        if(sumaN == m && sumaM == n){
            res = "Son novios";
        }
        return res;
    }
    
    private int sumaNumPropios(int a){
        int sum=0;
        for(int posibleDiv = 1; posibleDiv <= (a/2) ; posibleDiv++){
            if(a % posibleDiv == 0){
                sum += posibleDiv; 
            }
        }
        return sum;
    }
}