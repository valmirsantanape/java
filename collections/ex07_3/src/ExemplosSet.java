import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExemplosSet {
     public static void main(String[] args) throws Exception {
        System.out.println("Crie um conjunto e adicione notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas.toString());
        
        System.out.println("Confira se a nota 5.0 esta no conjunto: " + (notas.contains(5.0)? "Existe":"Não existe"));

        
    }
}
