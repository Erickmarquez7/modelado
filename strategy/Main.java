public class Main {
    public static void main(String[] args) {
        Pato real = new PatoReal();
        real.nadar();
        real.setNado(new NoNada());
        real.nadar();
        println("Estamos creando un pato, pero pk no un Samy?");
    }
}
