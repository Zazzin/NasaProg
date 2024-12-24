import java.util.ArrayList;

public class Razzi {
    //attributi
    ArrayList<Razzo> insiemeRazzi;

    //costruttore
    public Razzi(){
        this.insiemeRazzi = new ArrayList<Razzo>();
    }

    //getter
    public ArrayList<Razzo> getRazzi(){
        return this.insiemeRazzi;
    }

    //funzione per aggiungere un razzo
    public boolean addRazzo(Razzo razzo){
        return (this.insiemeRazzi.add(razzo));
    }

    //funzione per cercare un razzo
    public Razzo findRazzo(String idDaTrovare){
        for (Razzo razzo : insiemeRazzi) {
            if (razzo.getId().equals(idDaTrovare)) {
                return razzo;
            }
        }
        return null;
    }
}
