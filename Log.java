import java.util.ArrayList;

public class Log {
    //contenitore delle azioni con la data e l'ora
    ArrayList<Azione> azioni;

    //costruttore
    public Log(){
        this.azioni = new ArrayList<>();
    }

    //getter
    public ArrayList<Azione> getAzioni(){
        return this.azioni;
    }
}
