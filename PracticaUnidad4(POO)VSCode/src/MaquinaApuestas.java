public class MaquinaApuestas {
    private double dinero;
    private Persona persona;
    private int numeroSecreto;

    public MaquinaApuestas() {
        this.dinero = 500.50;
        persona = new Persona("Gabriela", 20, 3);
        this.numeroSecreto = (int) Math.random()*10 + 1;
    }
    
    public double motrarDineroEnMaquina(){
        return this.dinero;
    }

    public String jugar(int numero){
        String mensaje = " ";
        int fichas = persona.getNroFichas();
        double dineroPersona = persona.getDinero();
        while (persona.getNroFichas() > 0) {
            if(numero == numeroSecreto){
                mensaje = "Ganaste!!!! Saca tu premio";
                dineroPersona = dineroPersona + this.dinero;
                this.dinero = 0;
            }else{
                mensaje = "Vuelve a intentarlo fija ganas :)";
            }
            fichas = fichas - 1;
        }
        return mensaje;
    }
}
