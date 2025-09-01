public class SoldState implements Estado{
    Maquina maquina;

    public SoldState(Maquina maquina){
        this.maquina=maquina;
    }

    
    public void insertarMoneda() {
        System.out.println("Esperame tantito, estamos trabajando en darte un chicle");
    }

    
    public void quitarMoneda() {
        System.out.println("chin, ya la giraste, ni modo, no puedes quitar la moneda");
    }

    
    public void girar() {
        System.out.println("girar dos veces no te va a dar otro chicle xd");
    }

    
    public void dispensar() {
        maquina.soltarChicle();
        if(maquina.getCantidad() > 0){
            maquina.setState(maquina.getNoQuarterState());
        } else {
            System.out.println("Era el ultimo");
            maquina.setState(maquina.getSoldOutState());
        }
    }

    public String toString(){
        return "vendido";
    }
    
}
