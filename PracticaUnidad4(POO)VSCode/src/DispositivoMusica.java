public class DispositivoMusica {
    private Musica[] listaMusicas;
    private boolean estadoCancion; // false = pausa ; true = reproduciendo

    public DispositivoMusica() {
        Musica m1 = new Musica("POV", "Ariana Grande", 3.33);
        Musica m2 = new Musica("Up", "Cardi B", 2.36);
        Musica m3 = new Musica("Montero", "Lil Nas X", 2.50);
        listaMusicas = new Musica[3];
        listaMusicas[0] = m1;
        listaMusicas[1] = m2;
        listaMusicas[2] = m3;
        estadoCancion = false;
    }

    public void mostrarCanciones(){
        for (int i = 0; i < listaMusicas.length; i++) {
            System.out.println("" + listaMusicas[i]);
        }
    }

    public String reproducirCancion(){
        String mensaje = " ";
        if (estadoCancion == false) {
            mensaje = "La cancion ha empezado a sonar";
            estadoCancion = true;
        }else{
            mensaje = "Ya esta sonando una cancion";
        }
        return mensaje;
    }

    public String pausarCancion(){
        String mensaje = " ";
        if (estadoCancion == true) {
            mensaje = "La cancion ha sido pausada";
            estadoCancion = false;
        }else{
            mensaje = "La cancion ya se encuentra en pausa";
        }
        return mensaje;
    }

    public void cambiarCancion(){
        if(listaMusicas.length == 0 || listaMusicas.length == 1){
            for (int i = 0; i < listaMusicas.length - 1; i++) {
                listaMusicas[i] = listaMusicas[i+1];
                estadoCancion = true;
            }
        }else if(listaMusicas.length == 2){
            listaMusicas[2] = listaMusicas[0];
            estadoCancion = true;
        }
    }

    public Musica mostrarCancionActual(){
        Musica cancionActual = listaMusicas[0];
        return cancionActual;
    }
}
