package urna_eletronica.data;

/**
 *
 * @author viana
 */
public class Candidato {
    
    private int numero;
    private String nome;
    private String vice;
    private String partido;
    private String foto;
    private String fotovice;
    private int numvotos;
    private int encontrou;
    


    public Candidato() {
        this.numero = 0;
        this.nome = "";
        this.vice = "";
        this.partido = "";
        this.foto = "";
        this.fotovice = "";
        this.numvotos = 0;
        

    }

    public Candidato(Integer numero, String nome, String vice, 
        String partido, String foto, String fotovice, Integer numvotos) {
        
        this.numero = numero;
        this.nome = nome;
        this.vice = vice;
        this.partido = partido;
        this.foto = foto;
        this.fotovice = fotovice;
        this.numvotos = numvotos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setFotovice(String fotovice) {
        this.fotovice = fotovice;
    }

    public void setNumvotos(int numvotos) {
        this.numvotos = numvotos;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getVice() {
        return vice;
    }

    public String getPartido() {
        return partido;
    }

    public String getFoto() {
        return foto;
    }

    public String getFotovice() {
        return fotovice;
    }

    public int getNumvotos() {
        return numvotos;
    }
}
