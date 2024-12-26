public class GesioneSistema {
    Razzi razzo;
    Lavoratori lavoratore;
    Amministratore amministratore;
    // log
    public GesioneSistema() {
        razzo = new Razzi();
        lavoratore = new Lavoratori();
        amministratore = new Amministratore();
    }

    public Razzi getRazzo() {
        return this.razzo;
    } 

    public Lavoratori getLavoratore() {
        return this.lavoratore;
    }

    public Amministratore setAmministratore(Amministratore inputAmministratore) {
        return this.amministratore = inputAmministratore;
    }

    public Amministratore getAmministratore() {
        return this.amministratore;
    }

    public void 
    // log out


    // public Log getLog() {
    // 
    // }

    
}
