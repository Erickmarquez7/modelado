public class PatoDomestico extends Pato{

    public PatoDomestico(){
        vuelo = new SiVuela();
        nado = new NoNada();
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quack'");
    }

    //no implemento nadar pk no puedo


    public void Volable(){
        System.out.println("Puedo volar :D");
    }
    
}
