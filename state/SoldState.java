public class SoldState{
    
    //completa los demas metodos
        
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
