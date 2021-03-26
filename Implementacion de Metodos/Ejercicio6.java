public class Ejercicio6{
                            // 4      3       2
    public String intercambio(int a, int b, int c){
        int temp1 = a;  //4
        a = b;          //a = 3
        b = temp1;      //b = 4
        int temp2 = a;      //3
        a = c;
        c = temp2;
        
        //concatenamos a entero con "" para que sea String
        return a + "" + " " + b + "" + " " + c + "";
        /*System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c);*/
    }
}
