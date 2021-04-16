public class DispositivoMusica {
    private Musica[] listaMusicas;
    private boolean estadoCancion; // false = pausa ; true = reproduciendo
    private Musica musicaActual;

    public DispositivoMusica() {
        Musica m1 = new Musica("POV", "Ariana Grande", 3.33);
        Musica m2 = new Musica("Up", "Cardi B", 2.36);
        Musica m3 = new Musica("Montero", "Lil Nas X", 2.50);
        listaMusicas = new Musica[3];
        listaMusicas[0] = m1;
        listaMusicas[1] = m2;
        listaMusicas[2] = m3;
        estadoCancion = false;
        musicaActual = m1;
    }

    public void mostrarCanciones(){
        for (int i = 0; i < listaMusicas.length; i++) {
            System.out.println(listaMusicas[i]);
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
        if(musicaActual == listaMusicas[0]){
            musicaActual = listaMusicas[1];
        }else if(musicaActual == listaMusicas[1]){
            musicaActual = listaMusicas[2];
        }else if(musicaActual == listaMusicas[2]){
            musicaActual = listaMusicas[0];
        }
    }    

    public Musica mostrarCancionActual(){
        return musicaActual;
    }
}