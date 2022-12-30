
public class App {
    public static void main(String[] args) throws Exception {

        Carro car1  = new Carro("Crossfox", "Cinza", 50);

        System.out.println(car1.getCor());
        System.out.println(car1.calcularCombustivel(5.00));
        
    }
}
