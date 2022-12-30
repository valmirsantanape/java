import java.lang.ProcessBuilder.Redirect.Type;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Mensagem {
    public static String saldacao(){
        Date dataHoraAtual = new Date(0);
        String data = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        
        return data;
    }
}
