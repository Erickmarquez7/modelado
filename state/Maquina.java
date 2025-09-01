public class Maquina{
    //final static int = 0;
    //final static in = 1;

    final int SOLD_OUT = 0; //agotado
    final int NO_QUARTER = 1; //sin moneda
    final int HAS_QUARTER = 2; //con moneda
    final int SOLD = 3; //vendido

    int state = SOLD_OUT;
    int cantidad = 0;


    public Maquina(int cantidad){
        this.cantidad=cantidad;
        if(cantidad > 0)
            state=NO_QUARTER; //en el sentido de que espera la moneda
    }

    public void insertarMoneda(){
        if (state == HAS_QUARTER){
            System.out.println("Ya hay una moneda adentro");
        }
        else if (state == NO_QUARTER){
            state=HAS_QUARTER;
            System.out.println("insertaste una moneda");
        }
        else if (state == SOLD_OUT){
            System.out.println("no hay chicles :()");
        }
        else if (state == SOLD){
            System.out.println("esperame tantito, estamos trabajando en darte el chicle");
        }
        //// pero... ¿por que no poner solo else?
    }

    public void quitarMoneda(){
        if (state == HAS_QUARTER){
            state=NO_QUARTER;
            System.out.println("Has quitado la moneda");
        }
        else if (state == NO_QUARTER){
            System.out.println("No puedes quitar moneda porque no hay");
        }
        else if (state == SOLD){
            System.out.println("Chin, ya a giraste, ni modo, no puedes quitar la moneda");
        }
        else if (state == SOLD_OUT){
            System.out.println("No puedes quitar moneda porque no hay");
        }
    }

    public void girar(){
        if (state == SOLD){
            System.out.println("Girar dos veces no te va a dar otra moneda xd");
        }
        else if (state == NO_QUARTER){
            System.out.println("Giraste, pero no hay moenda");
        }
        else if (state == SOLD_OUT){
            System.out.println("Giraste, pero no hay chicles unu");
        }
        else if (state == HAS_QUARTER){
            System.out.println("Bien");
            state = SOLD;
            dispensar();
        }
    }

    public void dispensar(){
        if (state == SOLD){
            System.out.println("un chicle anda saliendo");
            this.cantidad=cantidad-1;
            if(cantidad==0){
                System.out.println("era el ultimo");
                state=SOLD_OUT;
            }else{
                state=NO_QUARTER;
            }
        } else if (state == NO_QUARTER){
            System.out.println("primero necesitas insertar una moneda");
        } else if (state == SOLD_OUT){
            System.out.println("sin chicles");
        } else if (state == HAS_QUARTER) {
            System.out.println("ah, caray. ¿Como llegaste hasta aqui?");
        }

    }

    public String toString(){
        return "Estado de la maquina: "+estado()+"\nCantidad: "+cantidad;
    }

    private String estado(){
        switch (state) {
            case 0:
                return "agotado";
            case 1:
                return "sin moneda";
            case 2:
                return "con moneda";
            case 3:
                return "vendido";
            default:
                return "desconocido";
        }
    }
}