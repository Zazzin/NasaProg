import java.util.Calendar;

public class Azione {
     //attributi
     private String azione;
     private Calendar dataEOra;

    //costruttori
    public Azione(){
        this.azione = " ";
        this.dataEOra = Calendar.getInstance();
    }

    public Azione(String azione){
        this.azione = azione;
        this.dataEOra = Calendar.getInstance();
    }

    
}
