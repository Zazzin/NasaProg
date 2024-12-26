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

    






}