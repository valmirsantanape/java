import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jhon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jhon", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t--\n");
        //Mostrar lista pela ordem de inserção
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t--\n");
        
        //Metdo  shuffle retorna a lista em uma ordem aleatória
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //Mostrar novamente na ordem natural
        System.out.println("--\tOrdem Natural\t--");
        //Para exibir a lista novamente na ordem natural usa-se o metodo Caparatle
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        
        
        

    };

    
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCor(){
        return cor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public String toString(){
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade + 
                ", cor='" + cor + '\'' +                
                "}";
    }
    //A implementação da interface compareble na classe obriga sobrescrever o metodo compareTo
    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getCor());
    }
    
    
}
