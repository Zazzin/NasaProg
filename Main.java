public class Main {
    
    public static void main(String[] args) {
        GesioneSistema_NEW sistema = new GesioneSistema_NEW();

        sistema.newAmministratore();
        System.out.print("\nEffettua il log in come amministratore\nInserisci l'username: ");
        String inputAmmUsername = Leggi.unoString();
        System.out.print("Inserisci la password: ");
        String inputAmmPassword = Leggi.unoString();

        sistema.loginAmministratore(inputAmmUsername, inputAmmPassword);
    }
}
