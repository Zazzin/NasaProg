import java.util.ArrayList;

public class RazzoBellico extends Razzo{
    //attributi
    Coordinata coordinate;

    public RazzoBellico(){
        super();
        this.coordinate = new Coordinata();
    }

    public RazzoBellico(String nomeRazzo,double raggio, int numeroMotori, String id, double x, double y){
        super(nomeRazzo, raggio, numeroMotori, id);
        coordinate = new Coordinata(x, y);        
    }
}
