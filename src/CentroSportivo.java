import java.util.HashMap;

public class CentroSportivo{
    private HashMap<String,Socio> listaSoci;
    private HashMap<String, Istruttore> listaIstruttori;

    public CentroSportivo(){
        this.listaSoci = new HashMap<>();
        this.listaIstruttori = new HashMap<>();
    }

    public boolean aggiungiSocio(String nome, String cognome, String codiceSocio){
        if(!listaSoci.containsKey(codiceSocio)){
            Socio s = new Socio(nome, cognome, codiceSocio);
            listaSoci.put(codiceSocio, s);
            return true;
        }
        return false;
    }

    public boolean rimuoviSocio(String codiceSocio){
        if(listaSoci.containsKey(codiceSocio)){
            listaSoci.remove(s, codiceSocio);
            return true;
        }
        return false;
    }

    public Socio getSocio(String codiceSocio){
        return listaSoci.get(codiceSocio);
    }

    public boolean aggiungiIstruttore(String nome, String cognome, String codiceIstruttore){
        if(!listaIstruttori.containsKey(codiceIstruttore)){
            Istruttore i = new Istruttore(nome, cognome, codiceIstruttore);
            listaIstruttori.put(codiceIstruttore, i);
            return true;
        }
        return false;
    } 

    public boolean rimuoviIstruttore(String codiceIstruttore){
        if(listaIstruttori.containsKey(codiceIstruttore)){
            listaIstruttori.remove(codiceIstruttore);
            return true;
        }
        return false;
    }

    public Istruttore getIstruttore(String codiceIstruttore){
        return listaIstruttori.get(codiceIstruttore);
    }

    public boolean assegnaIstruttore(String codiceSocio, String codiceIstruttore){
        if(!listaSoci.containsKey(codiceSocio) || !listaIstruttori.containsKey(codiceIstruttore) || listaSoci.get(codiceSocio).getIstruttoreAssegnato() != null){
            return false;
        }
        else{
            Istruttore i = listaistruttori.get(codiceIstruttore);
            Socio s = listaSoci.get(codiceSocio);
            s.setIstruttoreAssegnato(i);
            i.aggiungiSocio(s);
            return true;
        }
    }
}