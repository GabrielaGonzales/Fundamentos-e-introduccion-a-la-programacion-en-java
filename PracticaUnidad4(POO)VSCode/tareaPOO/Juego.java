public class Juego {
    private int intentosJugador;
    private int coordenadaX;
    private int coordenadaY;

    public Juego() {
        intentosJugador = 3;
        coordenadaX = (int) Math.random()*11;
        coordenadaY = (int) Math.random()*11;
    }

    public void jugar(int numX, int numY){
        String mensaje;
        String mensajeX;
        String mensajeY;

        if(intentosJugador > 0){
            intentosJugador = intentosJugador - 1;
            if(numX == coordenadaX){
                mensajeX = "Esta en su posicion";
                if(numY == coordenadaY){
                    mensaje = "Felicidades, acabas de encontrar el Tesoro del DracoCornio";
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Esta cerca";
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Esta cerca";
                }else{
                    mensajeY = "Esta lejos";
                }
            }else if(numX == (coordenadaX - 1) || numX == (coordenadaX - 2)){
                mensajeX = "Esta cerca";
                if(numY == coordenadaY){
                    mensaje = "Felicidades, acabas de encontrar el Tesoro del DracoCornio";
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Esta cerca";
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Esta cerca";
                }else{
                    mensajeY = "Esta lejos";
                }
            }else if(numX == (coordenadaX + 1) || numX == (coordenadaX + 2)){
                mensajeX = "Esta cerca";
                if(numY == coordenadaY){
                    mensaje = "Felicidades, acabas de encontrar el Tesoro del DracoCornio";
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Esta cerca";
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Esta cerca";
                }else{
                    mensajeY = "Esta lejos";
                }
            }else{
                mensajeX = "Esta lejos";
                if(numY == coordenadaY){
                    mensaje = "Felicidades, acabas de encontrar el Tesoro del DracoCornio";
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Esta cerca";
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Esta cerca";
                }else{
                    mensajeY = "Esta lejos";
                }
            }
            
        }else if(intentosJugador == 0){
            mensaje = "Lo siento, perdiste, me saludas al Megalodon";
        }
    }
}
