public class SoldOutState implements Estado{
    Maquina maquina;

    public SoldOutState(Maquina maquina){
        this.maquina=maquina;
    }


    public void insertarMoneda() {
        System.out.println("No hay chicles :()");
    }


    public void quitarMoneda() {
        System.out.println("No puedes quitar moneda porque no hay");
    }


    public void girar() {
        System.out.println("Giraste, pero no hay chicles unu");
    }

    
    public void dispensar() {
        System.out.println("No hay chicles");
    }

    public String toString(){
        return "agotado";
    }
}