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

    public boolean isRazzoRispettanteParamentri(String idRazzoDaControllare){
        Razzo razzo = this.findRazzo(idRazzoDaControllare);
        return (this.isRazzoRispettanteParamentroPeso(razzo)  && isRazzoRispettanteParamentroAltezza(razzo) && isRazzoRispettanteParamentroMotori(razzo) && isRazzoRispettanteParamentroRaggio(razzo));
    }

    //funzione verificare che il razzo abbia decollato senza problemi
    public boolean IsRazzoDecollatoDallInsiemeDeiRazzi(String idRazzoDaLanciare){
        if (this.isRazzoRispettanteParamentri(idRazzoDaLanciare)) {
            //se il razzo riesce a decollare quindi rispecchia i parametri allora viene tolto dall'insieme dei razzi e viene ritornato valore true
            this.removeRazzo(idRazzoDaLanciare);
            return true;
        }else{
             //se il razzo non riesce a decollare quindi non rispecchia i parametri allora viene tolto dall'insieme dei razzi e viene ritornato valore false
            this.removeRazzo(idRazzoDaLanciare);
            return false;
        }
    }

    public void LanciaRazzo(String idRazzoDaLanciare){
        
        if (this.findRazzo(idRazzoDaLanciare) == null) {
            System.err.println("Non è stato trovato alcun razzo con tale ID");
            return;
        }

            
        if (IsRazzoDecollatoDallInsiemeDeiRazzi(this.findRazzo(idRazzoDaLanciare).getId())) {
            System.out.println("Il Razzo è decolatto con successo!");
        } else{
            System.out.println("Il Razzo non è potuto decollare, c'era un errore progettuale, il prototipo è andato distrutto");
        }
        
        
        
    }

    public void LanciaRazzoBellico(String idRazzoDaLanciare){
        
        if (this.findRazzo(idRazzoDaLanciare) == null) {
            System.err.println("Non è stato trovato alcun razzo con tale ID");
            return;
        }

            
        if (IsRazzoDecollatoDallInsiemeDeiRazzi(this.findRazzo(idRazzoDaLanciare).getId())) {
            System.out.println("Il Razzo è decolatto con successo e ha colpito l'obiettivo");
        } else{
            System.out.println("Protocollo di lancio non andato a buon fine");
        }
        
        
    }
    
    public String toString() {
        return ""+ this.getRazzi();
    }
    
} 