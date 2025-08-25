public class PatoJuguete extends Pato{

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quack'");
    }

    public void nadar(){
        System.out.println("Yo solo floto");
    }//sobre escribir para que haga nada

    public void volar(){
        System.out.println("No vuelo :c");
    }
}
