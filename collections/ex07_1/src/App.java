import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
    // System.out.println("Exiba as notas na ordem que foram informadas: ");

    // for(Double nota : notas) System.out.println(nota);
    System.out.println("Exiba a terceira nota adicionada: ");

    System.out.println("A terceira nota adicionada foi: " + notas.get(2));

    System.out.println("Exiba a menor nota: " + Collections.min(notas));
    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    Double soma = 0d;

    for(double nota : notas){
        soma = soma + nota;
    }
    System.out.println("1º A soma de todas as notas é: "  + soma);

    Iterator<Double> iterator = notas.iterator();
    
    soma = 0d;
    while(iterator.hasNext()){
        Double next = iterator.next();
        soma+=next;
    }
    
    System.out.println("2º A soma de todas as notas é: "  + soma);

    System.out.println("Exiba a media das notas: " + soma/notas.size());
    System.out.println("Remova a nota 0: ");
    notas.remove(0d);
    System.out.println(notas);

    System.out.println("Remova as notas menores que 7 e exiba a lista: ");

    Iterator<Double> iterator_ = notas.iterator();
    while(iterator_.hasNext()){
        Double next = iterator_.next();
        if(next < 7) iterator_.remove();
    }
    
    System.out.println();
    System.out.println("Lista de notas atualizadas: ");
    System.out.println(notas);
    System.out.println();
    System.out.println("Apague toda a lista: ");

    System.out.println(notas.isEmpty()? "A lista está vazia": "A lista não esta vazia.");
    System.out.println();
    notas.clear();
    System.out.println(notas.isEmpty()? "A lista está vazia": "A lista não esta vazia.");
    

    }
}
