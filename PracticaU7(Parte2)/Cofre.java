public class Cofre {
    private Suenio2[] suenios;
    private int contador;

    public Cofre(){
        suenios = new Suenio2[3];
        contador = 0;
    }

    public void guardarSuenio(Suenio2 suenio){
        if (contador < 3) {
            suenios[contador] = suenio;
            contador++;
            System.out.println("Suenio guardado");
        } else {
            System.out.println("Cofre lleno ya no se puede guardar mas suenios");
        }
    }

    public void ordenarPorPrioridad(){
        if(contador == 3){
            Suenio2 auxiliar;
            for (int i = 1; i <= 3; i++) {
                for (int j = 0; j <= 3-1-i; j++) {
                    if (suenios[j].getPrioridad() > suenios[j+1].getPrioridad()) {
                        auxiliar = suenios[j];
                        suenios[j] = suenios[j+1];
                        suenios[j+1] = auxiliar;
                    }
                }
            }
            System.out.println("Se ordenaron los suenios");
        }else if(contador < 3 || contador > 3){
            System.out.println("Tiene que llenar todos los espacios de memoria");
        }
    }

    public void cumplirSuenios1(){
        for (int i = 0; i < 3; i++) {
            if(i < 2){
                suenios[i] = suenios[i+1];
            }else if(i == 2){
                suenios[i] = null;
            }
        }
        System.out.println("Suenio cumplido!!");
        contador--;       
    }

    public void cumplirSuenios2(String topico){
        int cont = 0;
        if (suenios[cont].getTopico().equals(topico)) {
            for(int i = cont; i < 3; i++){
                if(i < 2){
                    suenios[i] = suenios[i+1];
                }else if(i == 2){
                    suenios[i] = null;
                    System.out.println("Suenio cumplido!!");
                }
            }            
        }else{
            cont++;
        }
        contador--;
    }
}