public class Ejercicio4 {
    
    //rojo ---> 0
    //amarillo --> 1
    //verde ---> 2
    public String deducirEstadoSemaforo(int estado,int nVeces){
        int estadoFinal=4;
        if(estado==0){
            //rojo
            
        }else if(estado==1){
            //amarillo
            if(nVeces%3==0){
                estadoFinal=1;
            }else if(nVeces%3==1){
                estadoFinal=0;
            }else{
                estadoFinal=2;
            }
        }else if(estado==2){
            //verde
            
        }
        
        return dimeColor(estadoFinal);
    }
    
    public String dimeColor(int num){
        String res="";
        if(num==0){
            res="rojo";
        }else if(num==1){
            res="amarillo";
        }else if(num==2){
            res="verde";
        }
        return res;
    }
}