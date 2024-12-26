import java.util.ArrayList;

public class Amministratore extends Lavoratore{

    public Amministratore(){
        
    }

    public Amministratore(String inputName, String inputPassword, String inputId){
        super(inputName, inputPassword, inputId);
    }

    @Override
    public String toString(){
        return "Admin:      " + "il nome é: " + getNomeUtente() +" la password é: "+ getPassword() +" l'ID é: "+ getId();
    }

    public Lavoratore getUtenti(ArrayList<Lavoratore> lavoratori){

        for(Lavoratore worker : lavoratori){

            System.out.println(worker.toString());
            return worker;

        }

        return null;

    }

    public void printUtenti(ArrayList<Lavoratore> lavoratori){

        for(Lavoratore worker : lavoratori){
            System.out.println(worker.toString()); 
        }

        
    }
    
}
