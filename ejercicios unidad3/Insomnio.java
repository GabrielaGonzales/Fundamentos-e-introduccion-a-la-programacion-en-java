public class Insomnio{
    public int calcularTiempo(){
        int horaDurmio = 2;
        int minutoDurmio = 45;
        int horaDesperto = 11;
        int minutoDesperto = 25;
        int horaDurmioMin = horaDurmio * 60 + minutoDurmio;
        int horaDespertoMin = horaDesperto * 60 + minutoDesperto;
        int res = horaDespertoMin - horaDurmioMin;
        
        return res;
    }
}
