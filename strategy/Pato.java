public abstract class Pato{

    ComportamientoNadable nado;
    ComportamientoVolable vuelo;

    public Pato(){}    

    public abstract void quack();

    public void nadar() {
        nado.nadar();
    }

    public void mostrar() {
        System.out.println("Hola! Soy un pato :D");
    }

    public void volar() {
        vuelo.volar();
    }
    
}