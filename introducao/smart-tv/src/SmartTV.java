
public class SmartTV {
    public boolean ligada = false;
    public String volume;
    public int canal;
    
    public String ligar(){
        if(ligada == false){
            ligada = true;
            return "Esta tv esta ligada";
        }else{
            ligada = false;
        return "Esta tv esta desligada";
        }
    }

    /**
     * @return
     */
    public String aumentarVolume(){
        if(ligada == true){
            this.volume += 1;
            return "" + this.volume;
        }else{
            return "Esta tv esta desligada";
        }
    }

    public int mudarCanal(int num){
        this.canal = num;
        return canal;

    }
    
}
