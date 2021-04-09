
public class Ejercicio13{
    public String amistadNumeros(int num1, int num2){
        String res = "";
        if(num1 == sumaDivisores(num2) && num2 == sumaDivisores(num1)){
            res = "Son amigos";
        }else{
            res = "NO son amigos";
        }
        return res;
    }
    
    private int sumaDivisores(int numero){
        int suma = 0;
        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                suma = suma + i;
            }
        }
        return suma;
    }
}
