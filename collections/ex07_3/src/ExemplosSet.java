import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemplosSet {
     public static void main(String[] args) throws Exception {
        System.out.println("Crie um conjunto e adicione notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas.toString());
        
        System.out.println("Confira se a nota 5.0 esta no conjunto: " + (notas.contains(5.0)? "Existe":"Não existe"));

        System.out.println("Exiba a soma da notas: ");
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas é igual a " + soma);

        System.out.println("Média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0.0);

        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator_ = notas.iterator();
        while(iterator_.hasNext()){
            Double next = iterator_.next();
            if(next < 7) iterator_.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Informe todas as notas na ordem em que elas foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        
        
        System.out.println(notas2);

        System.out.println("Exiba todas as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }
}
