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

    //aggiungere un azione
    public boolean aggiungiAzione(String azione){
        Azione azioneDaAggiungere = new Azione(azione);
        return (this.azioni.add(azioneDaAggiungere)) ;
    }
    public String toString() {
        return "\nAzioni con data e ora: \n" + getAzioni();
    }
}
 