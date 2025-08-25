public class PatoJuguete extends Pato{

    public PatoJuguete(){
        vuelo = new NoVuela();
        nado = new FlotarNadar();
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quack'");
    }

}
