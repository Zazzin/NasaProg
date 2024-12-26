public class GesioneSistema {
    Razzi razzi;
    Lavoratori lavoratori;
    Amministratore amministratore;

    // log
    public GesioneSistema() {
        razzi = new Razzi();
        lavoratori = new Lavoratori();
        amministratore = new Amministratore();
    }

    public Razzi getRazzo() {
        return this.razzi;
    } 

    public Lavoratori getLavoratore() {
        return this.lavoratori;
    }

    public Amministratore setAmministratore(Amministratore inputAmministratore) {
        return this.amministratore = inputAmministratore;
    }

    public Amministratore getAmministratore() {
        return this.amministratore;
    }

    public void login(Lavoratore lavoratore, Amministratore amministratore, String inputUsername, String inputPassword) {
        if (lavoratore.getNomeUtente().equals(inputUsername) && lavoratore.getPassword().equals(inputPassword)) {
            //
        } else if (amministratore.getNomeUtente().equals(inputUsername) && amministratore.getPassword().equals(inputPassword)) {
            //
        }
            
    }

    public void logout() {
        this.amministratore = null;
        this.lavoratori = null;
    }

    public Lavoratore newLavoratore() {
        Lavoratore lavoratore = new Lavoratore();

        System.out.print("Inserisci nome del lavoratore: ");
        lavoratore.setNomeUtente(Leggi.unoString());

        System.out.print("Inserisci la passoword del lavoratore: ");
        lavoratore.setPassword(Leggi.unoString());

        System.out.print("Inserisci ID del lavoratore: ");
        lavoratore.setId(Leggi.unoString());

        return lavoratore;
    }

    public Lavoratore newAmministratore() {
        Amministratore amministratore = new Amministratore();

        System.out.print("Inserisci nome del amministratore: ");
        amministratore.setNomeUtente(Leggi.unoString());

        System.out.print("Inserisci la passoword del amministratore: ");
        amministratore.setPassword(Leggi.unoString());

        System.out.print("Inserisci ID del amministratore: ");
        amministratore.setId(Leggi.unoString());

        return amministratore;
    }

    public String getID() {
        String inputID;
        System.out.println("Inserisci l'ID da ricercare: ");
        inputID = Leggi.unoString();
        return inputID;
    }

    public RazzoSpaziale newRazzoSpaziale() {
        RazzoSpaziale razzoSpaziale = new RazzoSpaziale();
        
        System.out.print("Inserisci nome del razzo: ");
        razzoSpaziale.setNomeRazzo(Leggi.unoString());

        System.out.print("Inserisci raggio del razzo: ");
        razzoSpaziale.setRaggio(Leggi.unDouble());

        System.out.print("Inserisci numero di motori del razzo: ");
        razzoSpaziale.setNumeroMotori(Leggi.unInt());

        System.out.print("Inserisci peso del razzo: ");
        razzoSpaziale.setPeso(Leggi.unDouble());

        System.out.print("Inserisci altezza del razzo: ");
        razzoSpaziale.setAltezza(Leggi.unDouble());

        System.out.print("Inserisci ID del razzo: ");
        razzoSpaziale.setId(Leggi.unoString());
        return razzoSpaziale;
    }

    public RazzoBellico newRazzoBellico() {
        RazzoBellico razzoBellico = new RazzoBellico();
        
        System.out.print("Inserisci nome del razzo: ");
        razzoBellico.setNomeRazzo(Leggi.unoString());

        System.out.print("Inserisci raggio del razzo: ");
        razzoBellico.setRaggio(Leggi.unDouble());

        System.out.print("Inserisci numero di motori del razzo: ");
        razzoBellico.setNumeroMotori(Leggi.unInt());

        System.out.print("Inserisci peso del razzo: ");
        razzoBellico.setPeso(Leggi.unDouble());

        System.out.print("Inserisci altezza del razzo: ");
        razzoBellico.setAltezza(Leggi.unDouble());

        System.out.print("Inserisci ID del razzo: ");
        razzoBellico.setId(Leggi.unoString());
        return razzoBellico;
    }

    // B
    public void MenuLavoratore() {
        // lavoratori.addLavoratore(newLavoratore());
        // lavoratori.findLavoratore(getID());
        // lavoratori.removeLavoratore(getID());
        // lavoratori.toString();
        razzi.addRazzo(newRazzoSpaziale());
        razzi.removeRazzo(getID());
        razzi.findRazzo(getID());
    }

    // B
    public void MenuAmministratore() {
        lavoratori.addLavoratore(newLavoratore());
        lavoratori.findLavoratore(getID());
        lavoratori.removeLavoratore(getID());

        razzi.addRazzo(newRazzoBellico());
        razzi.removeRazzo(getID());
        razzi.findRazzo(getID());

        amministratore.printUtenti(lavoratori.getLavotori());
        amministratore.toString();
        
    }
}
