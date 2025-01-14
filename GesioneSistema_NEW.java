public class GesioneSistema_NEW {
    Razzi razzi;
    Lavoratori lavoratori;
    Amministratore amministratore;
    Colori colori;
    Log log;

    @SuppressWarnings("unused")
    private Utente utenteAu;

    
    public GesioneSistema_NEW() {
        razzi = new Razzi();
        lavoratori = new Lavoratori();
        amministratore = new Amministratore();
        colori = new Colori();
        log = new Log();
    }

    public Razzi getRazzo() {
        return this.razzi;
    } 

    public static void clearScreen() {   
        System.out.print("\033[H\033[2J");   
        System.out.flush();  
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
        clearScreen();
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
        clearScreen();
        System.err.println("\r\n" + //
                        "                                                      \r\n" + //
                        "         ,--.                                         \r\n" + //
                        "       ,--.'|   ,---,       .--.--.      ,---,        \r\n" + //
                        "   ,--,:  : |  '  .' \\     /  /    '.   '  .' \\       \r\n" + //
                        ",`--.'`|  ' : /  ;    '.  |  :  /`. /  /  ;    '.     \r\n" + //
                        "|   :  :  | |:  :       \\ ;  |  |--`  :  :       \\    \r\n" + //
                        ":   |   \\ | ::  |   /\\   \\|  :  ;_    :  |   /\\   \\   \r\n" + //
                        "|   : '  '; ||  :  ' ;.   :\\  \\    `. |  :  ' ;.   :  \r\n" + //
                        "'   ' ;.    ;|  |  ;/  \\   \\`----.   \\|  |  ;/  \\   \\ \r\n" + //
                        "|   | | \\   |'  :  | \\  \\ ,'__ \\  \\  |'  :  | \\  \\ ,' \r\n" + //
                        "'   : |  ; .'|  |  '  '--' /  /`--'  /|  |  '  '--'   \r\n" + //
                        "|   | '`--'  |  :  :      '--'.     / |  :  :         \r\n" + //
                        "'   : |      |  | ,'        `--'---'  |  | ,'         \r\n" + //
                        ";   |.'      `--''                    `--''           \r\n" + //
                        "'---'                                                 \r" 
                        );
        System.out.println("flying to the moon... and touch the sky");
        System.out.print("\nInserisci l'username del amministratore: ");
        String username = Leggi.unoString();

        System.out.print("Inserisci la passoword del amministratore: ");
        String password = Leggi.unoString();

        System.out.print("Inserisci ID del amministratore: ");
        String id = Leggi.unoString();

        this.amministratore = new Amministratore(username, password, id);

    }

    public String getID() {
        String inputID;
        System.out.print("\nInserisci l'ID: ");
        inputID = Leggi.unoString();
        return inputID;
    }

    public RazzoSpaziale newRazzoSpaziale() {
        clearScreen();
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
        System.out.print("inscerisci il numero degli oggetti che vuoi mettere nel raggio: ");
        numeroOggettiContenuti = Leggi.unInt();
        for (int i = 0; i < numeroOggettiContenuti; i++) {
            System.out.print("Inscerisci il nome dell'oggetto: ");
            nomeOggetto = Leggi.unoString();
            razzoSpaziale.addOggetto(nomeOggetto);
        }
        
        return razzoSpaziale;
    }

    public RazzoBellico newRazzoBellico() {
        clearScreen();
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
        System.out.println("Inserisci la coordinata X:");
        double tempX = Leggi.unDouble();
        System.out.println("Inserisci la coordinata Y:");
        double tempY = Leggi.unDouble();
        razzoBellico.setCoordinata(tempX, tempY);
        
        return razzoBellico;
    }

    public void loginAmministratore(String inputUsername, String inputPassword) {
        System.out.println("");
        if(inputUsername.equals("terrorist")){
            menuEasterEgg();
        } else if (amministratore.getNomeUtente().equals(inputUsername) && amministratore.getPassword().equals(inputPassword)) {
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
        clearScreen();
        int scelta;
        do {
            System.out.print("\nIndica il tipo di account con cui vuoi accedere\n1. Amministratore\n2. Lavoratore\n3. Esci dal sistema\nScelta: ");
            scelta = Leggi.unInt();
    
            switch (scelta) {
                case 1:
                    clearScreen();
                    System.out.print("\nInserisci le credenziali di accesso dell'amministratore\nUsername: ");
                    String inputUsernameAmm = Leggi.unoString();
                    System.out.print("Password: ");
                    String inputPasswordAmm = Leggi.unoString();
                    loginAmministratore(inputUsernameAmm, inputPasswordAmm);
                    break;
    
                case 2:
                    clearScreen();
                    System.out.print("\nInserisci le credenziali di accesso del lavoratore\nUsername: ");
                    String inputUsernameLav = Leggi.unoString();
                    System.out.print("Password: ");
                    String inputPasswordLav = Leggi.unoString();
                    loginLavoratore(inputUsernameLav, inputPasswordLav);
                    break;
    
                case 3: 
                    clearScreen();
                    System.out.println("\nArrivederci");
                    logout();
                    return;
    
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (scelta != 3); 
    }

    public void logout() {
        this.utenteAu = null;
    }

    public void MenuLavoratore() {
        clearScreen();
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
                    log.aggiungiAzione("é stato aggiunto un razzo");
                    break;
                case 2:
                    razzi.removeRazzo(getID());
                    log.aggiungiAzione("é stato rimosso un razzo");

                    break;
                case 3:
                    clearScreen();
                    System.out.println(razzi.toString());
                    String inputID;
                    System.out.println("Inserisici l'id del razzo da lanciare");
                    inputID = Leggi.unoString();
                    razzi.LanciaRazzo(inputID);
                    log.aggiungiAzione("è stato lanciato un razzo");

                    break;
                case 4:
                clearScreen();
                    System.out.println(razzi.toString());
                case 5:
                clearScreen();
                    System.out.println("Arrivederci");
                    logout();
                    menuLogin();
                    break;
                default:
                    System.out.println("L'opzoine inserita non è valida");
            }
        } while (scelta != 5);
    }

    public void MenuAmministratore() {
        clearScreen();
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
            System.out.println("8. Stampa menù dei log");
            System.out.println("9. Esci dal menù amministratore");
            System.out.print("Seleziona un'opzione: ");
            scelta = Leggi.unInt();
            switch (scelta) {
                case 1:
                    lavoratori.addLavoratore(newLavoratore());
                    log.aggiungiAzione("é stato aggiunto un lavoratore");

                    break;
                case 2:
                    lavoratori.removeLavoratore(getID());
                    log.aggiungiAzione("é stato rimosso un lavoratore");
                    break;
                case 3:
                    clearScreen();
                    System.out.println(lavoratori.findLavoratore(getID()));
                    break;
                case 4:
                    clearScreen();
                    System.out.println(lavoratori.toString());
                    break;
                case 5:
                    razzi.addRazzo(newRazzoSpaziale());
                    log.aggiungiAzione("é stato aggiunto un razzo");
                    break;
                case 6:
                    razzi.removeRazzo(getID());
                    log.aggiungiAzione("é stato rimosso un razzo");
                    break;
                case 7:
                    razzi.findRazzo(getID());
                    break;
                case 8:
                    clearScreen();
                    System.out.println(log);
                    break;
                case 9:
                    clearScreen();
                    System.out.println("Logout effettuato, Arrivederci");
                    logout();
                    menuLogin();
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
            
        } while (scelta != 9);
    }

    public void menuEasterEgg(){
        System.out.println(colori.getVerde());
        for (int i = 0; i < 1000; i++) {
            System.out.print("*");
            
        }
        System.out.println(" Because today, i wan't destory this world... ואני אהרוס אותך... היום אתפוצץ....... ואצליח במטרה שלי");

        for (int j = 0; j < 1000; j++) {
            System.out.print("*");
        }
       
        int scelta;
            do {
                System.out.println("\n>> Broke interface <<");
                System.out.println("1. Aggiungi un razzo");
                System.out.println("2. Rimuovi un razzo");
                System.out.println("3. Lancia un razzo");
                System.out.println("4. Stampa elenco razzi");
                System.out.println("5. Rimuovi utente");
                System.out.println("6. Esci del menu");
                System.out.print("Seleziona un'opzione: ");
                scelta = Leggi.unInt();
    
                switch (scelta) {
                case 1:
                    razzi.addRazzo(newRazzoBellico());
                    log.aggiungiAzione("é stato aggiunto un razzo");
                    break;
                case 2:
                    razzi.removeRazzo(getID());
                    log.aggiungiAzione("é stato rimosso un razzo");
                    break;
                case 3:
                    System.out.println(razzi.toString());
                    String inputID;
                    System.out.println("Inserisici l'id del razzo da lanciare");
                    inputID = Leggi.unoString();
                    razzi.LanciaRazzoBellico(inputID);
                    log.aggiungiAzione("é stato lanciato un razzo");
                    break;
                case 4:
                    System.out.println(razzi.toString());
                case 5:
                    lavoratori.removeLavoratore(getID());
                    log.aggiungiAzione("é stato rimosso l'utente");
                    break;
                case 6:
                    System.out.println(colori.getBianco());
                    System.out.println("Arrivederci");
                    logout();
                    menuLogin();
                    clearScreen();
                    break;
                default:
                    System.out.println("L'opzione inserita non è valida");
            }
        } while (scelta != 6);
        System.out.println(colori.getBianco());
    
    }
}