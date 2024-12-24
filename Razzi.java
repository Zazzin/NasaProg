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

    //funzioni per verificare se un razzo all'interno dell'inisieme dei razzi rispecchia i parametri
    //i parametri usati nelle funzioni sono indicati in relazione

    public boolean isRazzoRispettanteParamentroPeso(Razzo razzo){
        int pesoMinimoRazzo = 500;
        return (razzo.getPeso() > pesoMinimoRazzo);
    }

    public boolean isRazzoRispettanteParamentroAltezza(Razzo razzo){
        int altezzaMinima = 60;
        return (razzo.getAltezza() > altezzaMinima);
    }

    public boolean isRazzoRispettanteParamentroMotori(Razzo razzo){
        int KgPerMotore = 500;
        return ((razzo.getPeso()/razzo.getNumeroMotori()) == KgPerMotore);
    }

    public boolean isRazzoRispettanteParamentroRaggio(Razzo razzo){
        int divisoreAltezzaPerOttenereRaggio = 10;
        return (razzo.getAltezza() == razzo.getRaggio()*divisoreAltezzaPerOttenereRaggio);
    }

    public boolean isRazzoRispettanteParamentri(Razzo razzo){
        return (this.isRazzoRispettanteParamentroPeso(razzo)  && isRazzoRispettanteParamentroAltezza(razzo) && isRazzoRispettanteParamentroMotori(razzo) && isRazzoRispettanteParamentroRaggio(razzo));
    }
}
