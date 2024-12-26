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

    //getter
    public String getAzione(){
        return this.azione;
    }
    public Calendar getDataEOra(){
        return this.dataEOra;
    }

     //setter
    public void setAzione(String azione){
        this.azione = azione;
    }
    public void setDataEOra(Calendar dataOra){
        this.dataEOra = dataOra;
    }

    //inscerisci data
    public void inscerisciDataOra(){
        this.dataEOra = Calendar.getInstance();
    }

}
