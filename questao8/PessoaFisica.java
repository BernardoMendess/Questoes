package questao8;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String nomeSocial;
    private LocalDate dataNascimento;
    private String genero;
    private String rg;

    public PessoaFisica(String dataCadastro, String email, String endereco, Long id, String nome, String telefone,
                        String cpf, LocalDate dataNascimento, String genero, String nomeSocial, String rg) {
        super(dataCadastro, email, endereco, id, nome, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.nomeSocial = nomeSocial;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
