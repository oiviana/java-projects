package urna_eletronica.data;

/**
 *
 * @author viana
 */
public class Eleitor {
    private String titulo;
    private String rg;
    private String nome;
    private String dtnasc;
    private String zona;
    private String secao;
    private String voto;
    private String foto;
    private String cidade;
    private String estado;

    public Eleitor() {
        this.titulo = "";
        this.rg = "";
        this.nome = "";
        this.dtnasc = "";
        this.zona = "";
        this.secao = "";
        this.voto = "";
        this.foto = "";
        this.cidade = "";
        this.estado = "";
    }

    public Eleitor(String titulo,String rg, String nome, String dtnasc, String zona, 
        String secao, String voto, String foto, String cidade, String estado) {
        this.titulo = titulo;
        this.rg = rg;
        this.nome = nome;
        this.dtnasc = dtnasc;
        this.zona = zona;
        this.secao = secao;
        this.voto = voto;
        this.foto = foto;
        this.cidade = cidade;
        this.estado = estado;
    }
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDtnasc(String dtnasc) {
        this.dtnasc = dtnasc;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public String getDtnasc() {
        return dtnasc;
    }

    public String getZona() {
        return zona;
    }

    public String getSecao() {
        return secao;
    }

    public String getVoto() {
        return voto;
    }

    public String getFoto() {
        return foto;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
