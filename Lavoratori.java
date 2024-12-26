import java.util.ArrayList;

public class Lavoratori {
    ArrayList<Lavoratore> insiemeLavoratori;

    public Lavoratori(){

        this.insiemeLavoratori = new ArrayList<Lavoratore>();

    }

    public ArrayList<Lavoratore> getLavotori(){

        return this.insiemeLavoratori;

    }

    public void addLavoratore(Lavoratore inputLavoratore){

        insiemeLavoratori.add(inputLavoratore);

    }

    public Lavoratore findLavoratore(String inputId){

        for (Lavoratore l : insiemeLavoratori) {
            if (l.getId().equals(inputId)) {
                return l;
            }
        }

        return null;

    }

    public void removeRazzo(String inputId){
        this.insiemeLavoratori.remove(this.findLavoratore(inputId));
    }

    public String toString(){
        return "Insieme razzi:" + getLavotori();
    }



    








}