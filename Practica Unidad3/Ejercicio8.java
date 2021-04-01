
public class Ejercicio8
{
    public void fechaEvento(int dia, int mes, int anio){
        switch (mes) {
            case 1:
            System.out.println(dia + " " + "de " + "Enero " + "de " + anio);
            break;
            case 2:
            System.out.println(dia + " " + "de " + "Febrero " + "de " + anio);
            break;
            case 3:
            System.out.println(dia + " " + "de " + "Marzo " + "de " + anio);
            break;
            case 4:
            System.out.println(dia + " " + "de " + "Abril " + "de " + anio);
            break;
            case 5:
            System.out.println(dia + " " + "de " + "Mayo " + "de " + anio);
            break;
            case 6:
            System.out.println(dia + " " + "de " + "Junio " + "de " + anio);
            break;
            case 7:
            System.out.println(dia + " " + "de " + "Julio " + "de " + anio);
            break;
            case 8:
            System.out.println(dia + " " + "de " + "Agosto " + "de " + anio);
            break;
            case 9:
            System.out.println(dia + " " + "de " + "Septiembre " + "de " + anio);
            break;
            case 10:
            System.out.println(dia + " " + "de " + "Octubre " + "de " + anio);
            break;
            case 11:
            System.out.println(dia + " " + "de " + "Noviembre " + "de " + anio);
            break;
            case 12:
            System.out.println(dia + " " + "de " + "Diciembre " + "de " + anio);
            break;

            default:
            System.out.println("No existe ese mes");
            break;
        }
    }
}
