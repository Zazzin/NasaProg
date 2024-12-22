public class Lavoratore {
    protected String nomeUtente;
    protected String password;
    protected int id;

    public int getId() {
        return id;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Lavoratore(){
        this.nomeUtente = " ";
        this.password = " ";
        this.id = 0;
    }

    public Lavoratore(String inputNome, String inputPassword, int id){
        this.nomeUtente = inputNome;
        this.password = inputPassword;
        this.id = id;
    }

    public String toString(){
        return "Lavoratore \n" + "il nome é: " + getNomeUtente() +" la password é: "+ getPassword() +" l'ID é: "+ getId();
    }

    //public void creaRazzo(){
        
    //}

    //public void modificaRazzo(){

    //}






}
