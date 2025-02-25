public class Coordinata {
    //attributi
    private double x;
    private double y;

    //costruttori
    public Coordinata(){
        this.x = 0;
        this.y = 0;
    }

    public Coordinata(double x, double y){
        this.x = x;
        this.y = y;
    }

    //getter
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    //setter
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public String toString() {
        return "X: "+getX()+" Y: "+getY();
    }
}
