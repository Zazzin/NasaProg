import java.util.ArrayList;

public class Amministratore extends Lavoratore{

    public Amministratore(){
        
    }

    public Amministratore(String inputName, String inputPassword, int inputId){
        super(inputName, inputPassword, inputId);
    }

    public String toString(){
        return "Admin\n" + "il nome é: " + getNomeUtente() +" la password é: "+ getPassword() +" l'ID é: "+ getId();
    }

    public Lavoratore getUtenti(ArrayList<Lavoratore> lavoratori){
        for(Lavoratore worker : lavoratori){
            System.out.println(worker.toString());
            return worker;
        }

    }

    public void printUtenti(ArrayList<Lavoratore> lavoratori){
        for(Lavoratore worker : lavoratori){
            System.out.println(worker.toString()); 
        }

    }

    public void rimuoviRazzo(String IdInput){

        for (int i; i <= razzi.size(); i++){
            if (razzi.get(i).getId().equals(IdInput)) {
                razzi.remove();
            }
        }
    }
    

    
}
