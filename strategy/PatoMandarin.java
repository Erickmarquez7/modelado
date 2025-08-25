public class PatoMandarin extends Pato{

    public PatoMandarin(){
        vuelo = new SiVuela();
        nado = new SiNada();
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quack'");
    }

    public void squack(){
        //seria muuuuuuuuuuuy buena idea que se implementara una interfaz para el sonido
        //guiño guiño
    }

}