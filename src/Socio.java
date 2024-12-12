public class Socio{
    private String nome;
    private String cognome;
    private String codiceSocio;
    private Istruttore istruttoreAssegnato;

    public Socio(String nome, String cognome, String codiceSocio){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceSocio;
    }

    public Istruttore getIstruttoreAssegnato(){
        return istruttoreAssegnato;
    }

    public Istruttore setIstruttoreAssegnato(Istruttore istruttoreAssegnato){
        return this.istruttoreAssegnato = istruttoreAssegnato;
    }

    public String toString(){
        return nome + "" + cognome + "" + codiceSocio;
    }
}