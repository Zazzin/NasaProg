public class Colori {
    String verde;
    String bianco;

    public Colori(){
        this.verde = "\u001B[32m";
        this.bianco = "\u001B[37m";
    }

    public String getBianco() {
        return this.bianco;
    }

    public String getVerde() {
        return this.verde;
    }

    public String toString() {
       return "codice bianco: "+ getBianco() + " codice verde: "+getVerde();
    }

}
