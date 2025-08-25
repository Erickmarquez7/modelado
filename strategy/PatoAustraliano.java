public class PatoAustraliano extends Pato implements Nadable, Volable{

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quack'");
    }

    public void nadar(){
        System.out.println("¿Que hace un pato en el agua? Nada");
    }

    public void Volable(){
        System.out.println("Puedo volar :D");
    }

    
}