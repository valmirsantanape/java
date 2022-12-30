import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random randon = new Random();
        int[] numerosAleatorios = new int[10];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numero = randon.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        for(int numero : numerosAleatorios){
            System.out.print(numero + ", ");
        }
    }
}
