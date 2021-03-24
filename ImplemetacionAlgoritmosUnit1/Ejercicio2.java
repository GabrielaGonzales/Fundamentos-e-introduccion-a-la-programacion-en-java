public class Ejercicio2{
    double deposito = 300;
    double interes = 5;
    double total = 100;
    
    public void inversion(){
        System.out.println(deposito);
        double cincoPorcientoEnero = (deposito * interes) / total;
        double dineroActual1 = deposito + cincoPorcientoEnero;
        System.out.println("Mes 1: " + dineroActual1);
        
        double cincoPorcientoFebrero = (dineroActual1 * interes) / total;
        double dineroActual2 = dineroActual1 + cincoPorcientoFebrero;
        System.out.println("Mes 2: " + dineroActual2);
        
        double cincoPorcientoMarzo = (dineroActual2 * interes) / total;
        double dineroActual3 = dineroActual2 + cincoPorcientoMarzo;
        System.out.println("Mes 3: " + dineroActual3);
        
        double cincoPorcientoAbril = (dineroActual3 * interes) / total;
        double dineroActual4 = dineroActual3 + cincoPorcientoAbril;
        System.out.println("Mes 4: " + dineroActual4);
        
        double cincoPorcientoMayo = (dineroActual4 * interes) / total;
        double dineroActual5 = dineroActual4 + cincoPorcientoMayo;
        System.out.println("Mes 5: " + dineroActual5);
        
        double cincoPorcientoJunio = (dineroActual5 * interes) / total;
        double dineroActual6 = dineroActual5 + cincoPorcientoJunio;
        System.out.println("Mes 6: " + dineroActual6);
        
        double cincoPorcientoJulio = (dineroActual6 * interes) / total;
        double dineroActual7 = dineroActual6 + cincoPorcientoJulio;
        System.out.println("Mes 7: " + dineroActual7);
        
        double cincoPorcientoAgosto = (dineroActual7 * interes) / total;
        double dineroActual8 = dineroActual7 + cincoPorcientoAgosto;
        System.out.println("Mes 8: " + dineroActual8);
        
        double cincoPorcientoSeptiembre = (dineroActual8 * interes) / total;
        double dineroActual9 = dineroActual8 + cincoPorcientoSeptiembre;
        System.out.println("Mes 9: " + dineroActual9);
        
        double cincoPorcientoOctubre = (dineroActual9 * interes) / total;
        double dineroActual10 = dineroActual9 + cincoPorcientoOctubre;
        System.out.println("Mes 10: " + dineroActual10);
        
        double cincoPorcientoNoviembre = (dineroActual10 * interes) / total;
        double dineroActual11 = dineroActual10 + cincoPorcientoNoviembre;
        System.out.println("Mes 11: " + dineroActual11);
        
        double cincoPorcientoDiciembre = (dineroActual11 * interes) / total;
        double dineroActual12 = dineroActual11 + cincoPorcientoDiciembre;
        System.out.println("Mes 12: " + dineroActual12);
        
    }
}
