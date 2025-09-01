public class HasQuarterState implements Estado{
    Maquina maquina;

    public HasQuarterState(Maquina maquina){
        this.maquina=maquina;
    }

    public void insertarMoneda() {
        System.out.println("Ya hay una moenda dentro");
    }

    public void quitarMoneda() {
        maquina.setState(maquina.getNoQuarterState());
        System.out.println("Has quitado la moneda");
    }

    public void girar() {
        maquina.setState(maquina.getSoldState());
        System.out.println("Bien, giraste la moneda");
    }

    public void dispensar() {
        System.out.println("¿Como llegaste aqui?");
    }

    public String toString(){
        return "Con moneda";
    }
    
}
