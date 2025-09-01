public class NoQuarterState implements Estado{
    Maquina maquina; //debe tener una referencia porque le tenemos que cambiar el estado

    public NoQuarterState(Maquina maquina){
        this.maquina=maquina;
    }

    public void insertarMoneda() {
        System.out.println("Insertaste una moneda");
        maquina.setState(maquina.getHasQuarterState());
    }

    
    public void quitarMoneda() {
        System.out.println("No puedes quitar una moneda porque no hay");
    }

    
    public void girar() {
        System.out.println("Giraste, pero no hay moneda");
    }

    
    public void dispensar() {
        System.out.println("Primero necesitas insertar una moneda");   
    }

    public String toString(){
        return "Sin moneda";
    }

}
