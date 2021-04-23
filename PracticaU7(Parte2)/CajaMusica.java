import java.util.Arrays; 
public class CajaMusica {
    private Cancion[] canciones;
    private int contador;

    public CajaMusica() {
        canciones = new Cancion[3];
        contador = 0;
    }

    public void agregarCancion(Cancion cancion) {
        if (contador < 3) {
            canciones[contador] = cancion;
            System.out.println("Se agrego la cancion correctamente");
            contador++;
        } else {
            System.out.println("La memoria esta llena");
        }
    }

    public void eliminarCancion(String tituloCancion) {
        int cont = 0;
        if (tituloCancion.equals(canciones[cont].getTituloCancion())) {
            //canciones[cont] = null;
            for(int i = cont; i < 3; i++){
                if(i < 2){
                    canciones[i] = canciones[i+1];
                }else if(i == 2){
                    canciones[i] = null;
                    System.out.println("Cancion eliminada exitosamente");
                }
            }            
        } else {
            cont++;
        }
        contador--;
    }

    public void reemplazarCancion(Cancion cancion, int posicion) {
        System.out.println("Se reemplazo la cancion: " + canciones[posicion] + " ,por: " + cancion);
        canciones[posicion] = cancion;
    }

    public void ordenarPorArtista() {
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (canciones[i].getAutorCancion().compareTo(canciones[j].getAutorCancion()) > 0) {
                    Cancion temp = canciones[i];
                    canciones[i] = canciones[j];
                    canciones[j] = temp;
                }
            }
        }
        System.out.println("Se ordeno las canciones por artista");
    }

    public void ordenarPorTitulo() {
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (canciones[i].getTituloCancion().compareTo(canciones[j].getTituloCancion()) > 0) {
                    Cancion temp = canciones[i];
                    canciones[i] = canciones[j];
                    canciones[j] = temp;
                }
            }
        }
        System.out.println("Se ordeno las canciones por titulo");
    }
}

