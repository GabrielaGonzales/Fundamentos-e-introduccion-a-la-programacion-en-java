public class Jardinera {
    private FlorImperial[] floresImperiales;
    private int contador;
    private int noEntre;

    public Jardinera(){
        floresImperiales = new FlorImperial[10];
        contador = 0;
        noEntre = 0;
    }

    public  void agregarFlor(FlorImperial florImperial){
        if(contador < 10){
            floresImperiales[contador] = florImperial;
            contador++;
        }else{
            System.out.println("Ya no hay espacio en la Jardinera");
        }
    }

    public void consultarFlor(int posicion){
        if(posicion < 10){
            System.out.println("El tamanio de esta flor es de: " + floresImperiales[posicion].getAltura());
        }else{
            System.out.println("Esa posicion no existe");
        }
    }

    public void crecerFlor(int posicion){
        int crece = floresImperiales[posicion].getAltura() * 2;
        if(posicion < 10){
            if(cantidadDigitos(crece) < 8){
                floresImperiales[posicion].setAltura(crece);
            }else if(cantidadDigitos(crece) == 8 && noEntre == 0){
                floresImperiales[posicion].setAltura(crece);
                noEntre++;
            }else if(cantidadDigitos(crece) > 8 && noEntre >= 1 || cantidadDigitos(crece) == 8 && noEntre >= 1){
                System.out.println("La flor ya no puede crecer mas");
            }
        }else{
            System.out.println("Esa posicion no existe");
        }
    }
    
    private int cantidadDigitos(int numero){
        int res = 0;
        while(numero > 0){
            numero = numero / 10; 
            res = res + 1;
        }
        return res;
    }
}
