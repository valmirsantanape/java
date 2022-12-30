import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
    //  Dada uma lista com 7 notas de um alunos (7, 8.5, 9.3, 5, 7, 8, 3.6), faça:

    //  List notas = new ArrayList(); Antes do java 5
    //  
    
    //    ArrayList<Double> notas = new ArrayList<>();
    
    //    List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));
    //    List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6);
    //    notas.add(10d);
    //    System.out.println(notas);
    
    //    List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6);
    //    notas.add(1d);
    //    notas.remove(5d);
    //    System.out.println(notas);

    List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) -  Diamond Operatior

    notas.add(7d);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5d);
    notas.add(7d);
    notas.add(8d);
    notas.add(3.6);

    System.out.println(notas.toString());
    
    System.out.println("Exiba oa posição da nota 5.0: \n" + notas.indexOf(5.0));

    notas.add(4, 8d);

    System.out.println(notas);

    notas.set(notas.indexOf(5d), 6.8);
    System.out.println(notas);

    System.out.println("Confira se a nota 5.0 esta na lista: ");
    System.out.println(notas.contains(5.0)? "Nota 05 está na lista":"Nota 5.0 não esta na lista");
    System.out.println("Exiba as notas na ordem que foram informadas: ");

    for(Double nota : notas) System.out.println(nota);




        

    }
}
