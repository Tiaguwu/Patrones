package Adapter;

public class AdaptadorElectrico implements IEnchufable{
    //El adaptador (Adapter)
    private DispositivoAntiguo dispositivoAntiguo;
    public AdaptadorElectrico (DispositivoAntiguo dispositivoAntiguo) {
        this.dispositivoAntiguo = dispositivoAntiguo;
    }

    @Override
    public String conectar() {
        return "Adaptador activado. Traduciendo conexion: " + dispositivoAntiguo.encenderA110v();
    }
}

