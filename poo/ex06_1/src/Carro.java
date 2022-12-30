public class Carro extends Veiculo{
    
    private String modelo;
    private String cor;
    private double capacidadeTanque;


    public Carro(){

    }
    
    public Carro(String modelo, String cor, double capacidadeTanque){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }
    

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    void setCapacidadeTanque(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    double getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    public double calcularCombustivel(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }



    
    
      
}