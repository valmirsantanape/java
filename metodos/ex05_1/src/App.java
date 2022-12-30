import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println(Mensagem.saldacao());
        
        System.out.println("Valor do emprestino: ");
        double valor = sc.nextDouble();
        System.out.println("Total de parcelas: ");
        int parcelas = sc.nextInt();
        System.out.println(Emprestimo.calcularEmprestimo(valor, parcelas));
        sc.close();
    }
    
    
}
