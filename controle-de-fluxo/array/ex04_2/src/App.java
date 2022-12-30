import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int count = 0;


        do {
            System.out.println("Informe uma letra: ");
            String letra = sc.next();
            
            if( !(letra.equalsIgnoreCase("a") |
                  letra.equalsIgnoreCase("e") |
                  letra.equalsIgnoreCase("i") |
                  letra.equalsIgnoreCase("o") |
                  letra.equalsIgnoreCase("u") 
            )){
                consoantes[count] = letra;
            }
            count++;
        }while(count < consoantes.length);
        
        for (String consoante : consoantes){
            System.out.println(consoante);
        }

    }
}
