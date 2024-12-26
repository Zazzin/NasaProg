public class RazzoBellico extends Razzo{
    //attributi
    Coordinata coordinate;

    public RazzoBellico(){
        super();
        this.coordinate = new Coordinata();
    }

    public RazzoBellico(String nomeRazzo,double raggio, int numeroMotori, double peso, double altezza, String id, double x, double y){
        super(nomeRazzo, raggio, numeroMotori, peso, altezza, id);
        coordinate = new Coordinata(x, y);        
    }

    public Coordinata getCoordinata(){
        return this.coordinate;
    }
    
    public void setCoordinata(double x, double y){
        this.coordinate.setX(x);
        this.coordinate.setY(y);
    }

    public String toString() {
        return super.toString()+" coordinata: "+getCoordinata()+"\n";
    }
}
