public class Main {
    public static void main(String[] args) {
        System.out.println("\nCreo la maquina");
        Maquina maquina = new Maquina(5);
        System.out.println(maquina);

        System.out.println("\ninserto la moneda");
        maquina.insertarMoneda();
        System.out.println(maquina);

        System.out.println("\ngiro");
        maquina.girar();
        System.out.println(maquina);
    }
}
