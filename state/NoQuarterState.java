public class NoQuarterState implements Estado{
    Maquina maquina; //debe tener una referencia porque le tenemos que cambiar el estado

    public NoQuarterState(Maquina maquina){
        this.maquina=maquina;
    }

    public void insertarMoneda() {
        System.out.println("Insertaste una moneda");
        maquina.setState(maquina.getHasQuarterState());
    }

    //completa los demas metodos

}
