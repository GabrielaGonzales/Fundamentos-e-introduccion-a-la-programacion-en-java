public class Juego {
    private int intentosJugador;
    private int coordenadaX;
    private int coordenadaY;

    public Juego() {
        intentosJugador = 3;
        coordenadaX = (int) (Math.random()*11);
        coordenadaY = (int) (Math.random()*11);
    }

    public String jugar(int numX, int numY){
        String mensaje;
        String mensajeX;
        String mensajeY;
        String m = " ";

        if(intentosJugador > 0){
            intentosJugador = intentosJugador - 1;
            if(numX == coordenadaX){
                mensajeX = "X esta en su posicion // ";
                if(numY == coordenadaY){
                    mensaje = "Felicidades, acabas de encontrar el Tesoro del DracoCornio";
                    m = mensaje;
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else{
                    mensajeY = "Y esta lejos";
                    m = mensajeX + mensajeY;
                }
            }else if(numX == (coordenadaX - 1) || numX == (coordenadaX - 2)){
                mensajeX = "X esta cerca // ";
                if(numY == coordenadaY){
                    mensajeY = "Y esta en su posicion";
                    m = mensajeX + mensajeY;
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else{
                    mensajeY = "Y esta lejos";
                    m = mensajeX + mensajeY;
                }
            }else if(numX == (coordenadaX + 1) || numX == (coordenadaX + 2)){
                mensajeX = "X esta cerca // ";
                if(numY == coordenadaY){
                    mensajeY = "Y esta en su posicion";
                    m = mensajeX + mensajeY;
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else{
                    mensajeY = "Y esta lejos";
                    m = mensajeX + mensajeY;
                }
            }else{
                mensajeX = "X esta lejos // ";
                if(numY == coordenadaY){
                    mensajeY = "Y esta en su posicion";
                    m = mensajeX + mensajeY;
                }else if(numY == (coordenadaY - 1) || numY == (coordenadaY - 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else if(numY == (coordenadaY + 1) || numY == (coordenadaY + 2)){
                    mensajeY = "Y esta cerca";
                    m = mensajeX + mensajeY;
                }else{
                    mensajeY = "Y esta lejos";
                    m = mensajeX + mensajeY;
                }
            }
            
        }else if(intentosJugador == 0){
            mensaje = "Lo siento, perdiste, me saludas al Megalodon";
            m = mensaje;
        }
        return m;
    }
    
    public void reiniciarJuego(){
        intentosJugador = 3;
        coordenadaX = (int) (Math.random()*11);
        coordenadaY = (int) (Math.random()*11);
    }
}