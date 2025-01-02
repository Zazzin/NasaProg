public class Main {
    
    public static void main(String[] args) {
        GesioneSistema sistema = new GesioneSistema();

        sistema.newAmministratore();
        System.out.print("\nEffettua il log in come amministratore\nInserisci l'username: ");
        String inputAmmUsername = Leggi.unoString();
        System.out.print("Inserisci la password: ");
        String inputAmmPassword = Leggi.unoString();

        sistema.loginAmministratore(inputAmmUsername, inputAmmPassword);
    }

    

    // public static void main(String[] args) {
    //     GesioneSistema gestioneSistema = new GesioneSistema();
    //     String ruolo;
    //     System.out.println("scrivi Lavoatore o Amministratore in base a acosa sei");
    //     ruolo = Leggi.unoString();
    //     if (ruolo.equals("Lavoratore")) {
    //         gestioneSistema.loginLavoratore(, );
    //     }else if(ruolo.equals("Amministatore")){
    //         gestioneSistema.loginAmministratore(, );
    //     }
    //     
    // }
    
}
