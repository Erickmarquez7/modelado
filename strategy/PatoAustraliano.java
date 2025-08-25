public class PatoAustraliano extends Pato{

    public PatoAustraliano(){
        vuelo = new SiVuela();
        nado = new SiNada();
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quack'");
    }

    
}