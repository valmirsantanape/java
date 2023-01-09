import javax.swing.JOptionPane;

public class TratamentoDeExcecao {
    public static void main(String[] args) throws Exception {
        //Unchecked exception
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um numero inteiro! " +  e);
        } finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("O código continua...");
    }

    private static int dividir(int a, int b) {
        return (a / b);
    }
}
