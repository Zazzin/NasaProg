public class Razzo {

    //attributo
    protected String nomeRazzo;
    protected double raggio;
    protected int numeroMotori;
    protected String id;

    //costruttori
    public Razzo(){
        this.nomeRazzo = "";
        this.raggio = 0;
        this.numeroMotori = 0;
        this.id = "";
    }

    public Razzo(String nomeRazzo,double raggio, int numeroMotori, String id){
        this.nomeRazzo = nomeRazzo;
        this.raggio = raggio;
        this.numeroMotori = numeroMotori;
        this.id = id;
    }

    //getter
    public String getNomeRazzo(){
        return this.nomeRazzo;
    }
    
    public double getRaggio(){
        return this.raggio;
    }

    public int getNumeroMotori(){
        return numeroMotori;
    }

    public String getId(){
        return this.id;
    }

    //setter
    public void setNomeRazzo(String nomeRazzo){
        this.nomeRazzo = nomeRazzo;
    }

    public void setRaggio(double raggio){
        this.raggio = raggio;
    }

    public void setNumeroMotori(int numeroMotori){
        this.numeroMotori = numeroMotori;
    }

    public void setId(String id){
        this.id = id;
    }

    public String toString(){
        return "nome razzo: "+getNomeRazzo()+" raggio: "+getRaggio()+" numero di motori: "+getNumeroMotori()+" id: "+getId();
    }

}