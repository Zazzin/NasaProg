import java.util.ArrayList;

public class RazzoSpaziale extends Razzo{
    //attributo
    private ArrayList<String> oggettiContenuti;

    //costruttore
    public RazzoSpaziale(){
        super();
        this.oggettiContenuti = new ArrayList<String>();
    }

    public RazzoSpaziale(String nomeRazzo,double raggio, int numeroMotori, String id){
        super(nomeRazzo, raggio, numeroMotori, id);
        this.oggettiContenuti = new ArrayList<String>();
    }

    public ArrayList<String> getOgetti(){
        return this.oggettiContenuti;
    }
}
