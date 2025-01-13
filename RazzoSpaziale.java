import java.util.ArrayList;

public class RazzoSpaziale extends Razzo{
    //attributo
    private ArrayList<String> oggettiContenuti;

    //costruttore
    public RazzoSpaziale(){
        super();
        this.oggettiContenuti = new ArrayList<String>();
    }

    public RazzoSpaziale(String nomeRazzo,double raggio, int numeroMotori, double peso, double altezza, String id){
        super(nomeRazzo, raggio, numeroMotori, peso, altezza, id);
        this.oggettiContenuti = new ArrayList<String>();
    }

    public ArrayList<String> getOggetti(){
        return this.oggettiContenuti;
    }

    public void addOggetto(String oggetto){
        this.oggettiContenuti.add(oggetto);
    }

    public String toString() {
        return super.toString() + "\n    Oggetti contenuti: "+getOggetti()+"\n";
    }
}
