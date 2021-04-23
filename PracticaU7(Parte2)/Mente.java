public class Mente {
    private Recuerdo[] recuerdos;
    private int numRecuerdos;
    private int contador;

    public Mente(){
        contador = 0;
    }

    public void tamanioArreglo(int numero){
        numRecuerdos = numero;
        recuerdos = new Recuerdo[numRecuerdos];
    }

    public void agregarRecuerdo(Recuerdo recuerdo){
        if(contador < numRecuerdos){
            recuerdos[contador] = recuerdo;
            contador = contador + 1;
        }else if(contador >= numRecuerdos){
            System.out.println("Se agoto su limite de recuerdos");
        }
    }

    public String recuerdoLuz(){
        String recuerdo = "";
        if(contador == numRecuerdos){
            int mitad = numRecuerdos / 2;
            recuerdo = recuerdos[mitad].getDescripcion();
        }else if(contador < numRecuerdos || contador > numRecuerdos){
            recuerdo = "Tiene que llenar todos los espacios de memoria";
        } 
        return recuerdo;
    }

    public void ordenarMemoriasDias() {
        if(contador == numRecuerdos){
            Recuerdo auxiliar;
            for (int i = 1; i <= numRecuerdos; i++) {
                for (int j = 0; j <= numRecuerdos-1-i; j++) {
                    if (recuerdos[j].getFecha().getDia() > recuerdos[j+1].getFecha().getDia()) {
                        auxiliar = recuerdos[j];
                        recuerdos[j] = recuerdos[j+1];
                        recuerdos[j+1] = auxiliar;
                    }
                }
            }
        }else if(contador < numRecuerdos || contador > numRecuerdos){
            System.out.println("Tiene que llenar todos los espacios de memoria");
        }
    }

    public void ordenarMemoriasMes() {
        if(contador == numRecuerdos){
            Recuerdo auxiliar;
            for (int i = 1; i <= numRecuerdos; i++) {
                for (int j = 0; j <= numRecuerdos-1-i; j++) {
                    if (recuerdos[j].getFecha().getMes() > recuerdos[j+1].getFecha().getMes()) {
                        auxiliar = recuerdos[j];
                        recuerdos[j] = recuerdos[j+1];
                        recuerdos[j+1] = auxiliar;
                    }
                }
            }
        }else if(contador < numRecuerdos || contador > numRecuerdos){
            System.out.println("Tiene que llenar todos los espacios de memoria");
        }
    }

    public void ordenarMemoriasAnio() {
        if(contador == numRecuerdos){
            Recuerdo auxiliar;
            for (int i = 1; i <= numRecuerdos; i++) {
                for (int j = 0; j <= numRecuerdos-1-i; j++) {
                    if (recuerdos[j].getFecha().getAnio() > recuerdos[j+1].getFecha().getAnio()) {
                        auxiliar = recuerdos[j];
                        recuerdos[j] = recuerdos[j+1];
                        recuerdos[j+1] = auxiliar;
                    }
                }
            }
        }else if(contador < numRecuerdos || contador > numRecuerdos){
            System.out.println("Tiene que llenar todos los espacios de memoria");
        }
    }
}
