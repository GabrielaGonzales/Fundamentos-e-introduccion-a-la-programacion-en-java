
public class Ejercicio7{
    private int sumaCifras(int numero){
        int suma = 0;
        int numCifras = numeroCifras(numero);
        while(numero > 0){
            int modulo = numero % 10;
            int elevado = (int) Math.pow(modulo, numCifras);
            suma = suma + elevado;
            numero = numero / 10;
        }
        return suma;
    }

    public String narcisista(int numero){
        String res = "";
        if(sumaCifras(numero) == numero){
            res = "Narcisista";
        }else if(sumaCifras(numero) != numero){
            res = "Normal";
        }
        return res;
    }

    private int numeroCifras(int numero){
        int res = 0;
        while(numero > 0){
            numero = numero / 10; 
            res = res + 1;
        }
        return res;
    }

}
