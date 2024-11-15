package questao8;

public class PessoaJuridica extends Cliente {
    private String nomeFantasia;
    private String cnpj;
    private String inscricaoEstadual;
    private String ramoAtividade;

    public PessoaJuridica(String dataCadastro, String email, String endereco, Long id, String nome,
                          String telefone, String cnpj, String inscricaoEstadual, String nomeFantasia, String ramoAtividade) {
        super(dataCadastro, email, endereco, id, nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
        this.ramoAtividade = ramoAtividade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }
}
