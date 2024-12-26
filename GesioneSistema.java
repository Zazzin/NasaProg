public class GesioneSistema {
    Razzi razzo;
    Lavoratori lavoratore;
    Amministratore amministratore;
    private boolean utenteAutenticato = false;

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

    public void login(Lavoratore lavoratore, Amministratore amministratore, String inputUsername, String inputPassword) {
        if (lavoratore.getNomeUtente().equals(inputUsername) && lavoratore.getPassword().equals(inputPassword)) {
            utenteAutenticato = true;
        } else if (amministratore.getNomeUtente().equals(inputUsername) && amministratore.getPassword().equals(inputPassword)) {
            
        }
            
    }

    public void logout() {
        this.amministratore = null;
        this.lavoratore = null;
    }

    public void MenuLavoratore() {
        lavoratore.addLavoratore(amministratore);
        
        //
        //
    }

    public void MenuAmministratore() {
        amministratore.getUtenti(null);
        amministratore.printUtenti(null);
        amministratore.toString();
    }


    // public Log getLog() {
    // 
    // }

    
}
