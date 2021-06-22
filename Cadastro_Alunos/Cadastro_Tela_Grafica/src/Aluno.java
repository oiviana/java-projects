

public class Aluno {

    private String ra;
    private String rg;
    private String cpf;
    private String nome;
    private String email;
    private String emailalt;
    private String dtnasc;
    private String dddtel;
    private String tel;
    private String dddcel;
    private String cel;
    private String cep;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String observ;
    private String dtcadastro;
    private String situacao;
    


    public Aluno() {
        this.rg = "";
        this.cpf = "";
        this.ra = "";
        this.nome = "";
        this.email = "";
        this.emailalt = "";
        this.dtnasc = "";
        this.dddtel = "";
        this.tel = "";
        this.dddcel = "";
        this.cel = "";
        this.cep = "";
        this.rua = "";
        this.numero = 0;
        this.bairro = "";
        this.cidade = "";
        this.uf = "";
        this.observ = "";
        this.dtcadastro = "";
        this.situacao = "";



    }

    public Aluno(String ra,String rg, String nome, String email, 
        String emailalt, String cpf, String dtnasc, String dddtel, 
        String tel, String dddcel, String cel, String cep, String rua, Integer numero, 
        String bairro, String cidade, String uf, String observ, String dtcadastro, String situacao) {
        
        this.rg = rg;
        this.cpf = cpf;
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.emailalt = emailalt;
        this.dtnasc = dtnasc;
        this.dddtel = dddtel;
        this.tel = tel;
        this.dddcel = dddcel;
        this.cel = cel;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.observ = observ;
        this.dtcadastro = dtcadastro;
        this.situacao = situacao;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmailalt(String emailalt) {
        this.emailalt = emailalt;
    }

    public void setDtnasc(String dtnasc) {
        this.dtnasc = dtnasc;
    }

    public void setDddtel(String dddtel) {
        this.dddtel = dddtel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setDddcel(String dddcel) {
        this.dddcel = dddcel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public void setDtcadastro(String dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmailalt() {
        return emailalt;
    }

    public String getDtnasc() {
        return dtnasc;
    }

    public String getDddtel() {
        return dddtel;
    }

    public String getTel() {
        return tel;
    }

    public String getDddcel() {
        return dddcel;
    }

    public String getCel() {
        return cel;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getObserv() {
        return observ;
    }

    public String getDtcadastro() {
        return dtcadastro;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getRg() {
        return rg;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
