public class Ejercicio7{
    double hora = 60;
    double jugarConsume = 20;
    double redesSocialesConsume = 10;
    double youtubeConsume = 15;
    double bateriaTenia = 55;
    double jugarTiempo = 30;
    double redesSocialesTiempo = 15;
    double youtubeTiempo = 40;
    
    public double bateria(){
        double juegoConsumeEnXTiempo = (jugarTiempo * jugarConsume) / hora;
        double redesSocialesConsumeEnXTiempo = (redesSocialesTiempo * redesSocialesConsume) / hora;
        double youtubeConsumeEnXTiempo = (youtubeTiempo * youtubeConsume) / hora;
        double suma = juegoConsumeEnXTiempo + redesSocialesConsumeEnXTiempo + youtubeConsumeEnXTiempo;
        double resta = bateriaTenia - suma;
        return resta;
    }
}
