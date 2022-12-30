public class Emprestimo {
    public static double calcularEmprestimo(double valor,  int parcelas){
        double taxa;
        if(parcelas <= 10){
            taxa = 0.1;
        }else if(parcelas >= 10 && parcelas <= 20){
            taxa = 0.2;
        }else if(parcelas >= 20 && parcelas <= 50){
            taxa = 0.3;
        }else{
            taxa = 0.5;
        }

        return (valor + (valor * taxa));

    }
}
