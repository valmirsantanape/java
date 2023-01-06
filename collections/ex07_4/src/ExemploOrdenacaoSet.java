import java.util.HashSet;
import java.util.Set;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) throws Exception {
        System.out.println("Dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este conjunto exibindo: \n Nome - Gênero - Tempo do epsódio ");

        System.out.println("--\tOrdem aleatória \t--");
        System.out.println();
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70 show", "comedia", 25));
        }};

        for(Serie serie : minhasSeries){
            System.out.println("Nome da série: " +serie.getNome() + "\nGenero: "+serie.getGenero() +  "\nTempo de Episódio:" + serie.getTempo() + "\n ------------------------------------\n");
        }

    }
}

