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
    public Razzo findRazzo(String idRazzoDaTrovare){
        for (Razzo razzo : insiemeRazzi) {
            if (razzo.getId().equals(idRazzoDaTrovare)) {
                return razzo;
            }
        }
        return null;
    }

    //funzione per rimuovere un razzo
    public boolean removeRazzo(String idRazzoDaRimuovere){
        return (this.insiemeRazzi.remove(this.findRazzo(idRazzoDaRimuovere)));
    }
}
