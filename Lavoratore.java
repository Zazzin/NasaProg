public class Lavoratore {
    protected String nomeUtente;
    protected String password;
    protected String id;

    public String getId() {
        return id;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
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
        this.id = " ";
    }

    public Lavoratore(String inputNome, String inputPassword, String id){
        this.nomeUtente = inputNome;
        this.password = inputPassword;
        this.id = id;
    }

    @Override
    public String toString(){
        return "Lavoratore:     " + "il nome é: " + getNomeUtente() +" la password é: "+ getPassword() +" l'ID é: "+ getId();
    }






}
