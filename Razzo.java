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
    
}