import java.util.ArrayList;

public class Lavoratori {
    protected ArrayList<Lavoratore> insiemeLavoratori;

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

    public Lavoratore findLavoratoreNomePassword(String userName, String passwordInput){
        for (Lavoratore l : insiemeLavoratori) {
            
            if (l.getNomeUtente().equals(userName) && l.getPassword().equals(passwordInput)) {
                
                return l;

            }
        }

        return null;
    }

    public void removeLavoratore(String inputId){
        this.insiemeLavoratori.remove(this.findLavoratore(inputId));
    }

    public String toString(){
        String output = "";
        for (Lavoratore lavoratore : insiemeLavoratori) {
            output += lavoratore.toString() + "\n";
        }
        // return "Insieme razzi:" + getLavotori();
        return output;
    }

}