public class MaquinaApuestas {
    private double dinero;
    private Persona persona;
    private int numeroSecreto;

    public MaquinaApuestas(Persona persona) {
        dinero = 500.50;
        this.persona = persona;
        numeroSecreto = (int) (Math.random()*10 + 1);
    }

    public double mostrarDineroEnMaquina(){
        return dinero;
    }

    public String jugar(int numero){
        String mensaje = " ";
        int fichas = persona.getNroFichas();
        double dineroPersona = persona.getDinero();
        if(fichas > 0){
            if(numero == numeroSecreto){
                mensaje = "Ganaste!!!! Saca tu premio. La maquina queda bloqueada";
                persona.setDinero(dineroPersona + dinero);
                dinero = 0;
                fichas = 0;
            }else{
                mensaje = "Vuelve a intentarlo fija ganas :)";
            }
            persona.setNroFichas();
        }else if(fichas == 0){
            mensaje = "Ya no tienes mas intentos";
        }
        return mensaje;
    }
}
