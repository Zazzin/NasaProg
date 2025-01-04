public class GesioneSistema {
    Razzi razzi;
    Lavoratori lavoratori;
    Amministratore amministratore;

    @SuppressWarnings("unused")
    private Utente utenteAu;

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

    public void newAmministratore() {
        System.out.print("Inserisci l'username del amministratore: ");
        String username = Leggi.unoString();

        System.out.print("Inserisci la passoword del amministratore: ");
        String password = Leggi.unoString();

        System.out.print("Inserisci ID del amministratore: ");
        String id = Leggi.unoString();

        this.amministratore = new Amministratore(username, password, id);
    }
    

    public String getID() {
        String inputID;
        System.out.print("Inserisci l'ID da ricercare: ");
        inputID = Leggi.unoString();
        return inputID;
    }

    public RazzoSpaziale newRazzoSpaziale() {
        RazzoSpaziale razzoSpaziale = new RazzoSpaziale();
        int numeroOggettiContenuti = 0;
        String nomeOggetto;
        
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
        System.out.println("inscerisci il numero degli oggetti che vuoi mettere nel raggio");
        numeroOggettiContenuti = Leggi.unInt();
        for (int i = 0; i < numeroOggettiContenuti; i++) {
            System.out.println("Inscerisci il nome dell'oggetto");
            nomeOggetto = Leggi.unoString();
            razzoSpaziale.addOggetto(nomeOggetto);
        }
        
        return razzoSpaziale;
    }

    public void loginAmministratore(String inputUsername, String inputPassword) {
        if (amministratore.getNomeUtente().equals(inputUsername) && amministratore.getPassword().equals(inputPassword)) {
            this.utenteAu = amministratore;
            MenuAmministratore();
        } else {
            System.out.println("\nCredenziali errate");
        }
    }

    public void loginLavoratore(String inputUsername, String inputPassword) {
        for (Lavoratore lavoratore : lavoratori.getLavotori()) {
            if (lavoratore.getNomeUtente().equals(inputUsername) && lavoratore.getPassword().equals(inputPassword)) {
                this.utenteAu = lavoratore;
                MenuLavoratore();
                return;
            }
        }
        System.out.println("\nCredenziali errate");
    }

    public void menuLogin() {
        System.out.print("\nIndica il tipo di account con cui vuoi accedere\n1. Amministratore\n2. Lavoratore\n3. Esci dal sistema\nScelta: ");
        int scelta = Leggi.unInt();
        do{
            switch (scelta) {
                case 1:
                    System.out.print("\nInserisci le credenziali di accesso dell'amministratore\nUsername: ");
                    String inputUsernameAmm = Leggi.unoString();
                    System.out.print("Password: ");
                    String inputPasswordAmm = Leggi.unoString();
                    loginAmministratore(inputUsernameAmm, inputPasswordAmm);
                    break;
                case 2:
                    System.out.print("\nInserisci le credenziali di accesso del lavoratore\nUsername: ");
                    String inputUsernameLav = Leggi.unoString();
                    System.out.print("Password: ");
                    String inputPasswordLav = Leggi.unoString();
                    loginLavoratore(inputUsernameLav, inputPasswordLav);
                    break;
                case 3: 
                    System.out.println("\nArrivederci");
                    break;
                default:
                    break;
            }
        } while (scelta != 3);
   }

    public void logout() {
        this.utenteAu = null;
    }
    public void MenuLavoratore() {
        int scelta;
        do {
            System.out.println("\n>> Menù Lavoratore <<");
            System.out.println("1. Aggiungi un razzo spaziale");
            System.out.println("2. Rimuovi un razzo");
            System.out.println("3. Lancia un razzo");
            System.out.println("4. Stampa elenco razzi spaziali");
            System.out.println("5. Esci del menu lavoratore");
            System.out.print("Seleziona un'opzione: ");
            scelta = Leggi.unInt();

            switch (scelta) {
                case 1:
                    razzi.addRazzo(newRazzoSpaziale());
                    break;
                case 2:
                    razzi.removeRazzo(getID());
                    break;
                case 3:
                    System.out.println(razzi.toString());
                    String inputID;
                    System.out.println("Inserisici l'id del razzo da lanciare");
                    inputID = Leggi.unoString();
                    razzi.LanciaRazzo(inputID);
                    break;
                case 4:
                    System.out.println(razzi.toString());
                case 5:
                    System.out.println("Arrivederci");
                    logout();
                    break;
                default:
                    System.out.println("L'opzoine inserita non è valida");
            }
        } while (scelta != 5);
    }

    public void MenuAmministratore() {
        int scelta;
        do {
            System.out.println("\n>> Menù Amministratore <<");
            System.out.println("1. Aggiungi un lavoratore");
            System.out.println("2. Rimuovi un lavoratore");
            System.out.println("3. Trova un lavoratore");
            System.out.println("4. Stampa elenco lavoratori");
            System.out.println("5. Aggiungi un razzo spaziale");
            System.out.println("6. Rimuovi un razzo");
            System.out.println("7. Trova un razzo");
            System.out.println("8. Esci dal menù amministratore");
            System.out.print("Seleziona un'opzione: ");
            scelta = Leggi.unInt();
            switch (scelta) {
                case 1:
                    lavoratori.addLavoratore(newLavoratore());
                    break;
                case 2:
                    lavoratori.removeLavoratore(getID());
                    break;
                case 3:
                    System.out.println(lavoratori.findLavoratore(getID()));
                    break;
                case 4:
                    System.out.println(lavoratori.toString());
                    break;
                case 5:
                    razzi.addRazzo(newRazzoSpaziale());
                    break;
                case 6:
                    razzi.removeRazzo(getID());
                    break;
                case 7:
                    razzi.findRazzo(getID());
                    break;
                case 8:
                    System.out.println("Logout effettuato, Arrivederci");
                    logout();
                    menuLogin();
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
            
        } while (scelta != 8);
    }    
}
