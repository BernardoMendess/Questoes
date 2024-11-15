package questao8;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataCadastro;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(String email, String endereco, String nome, String telefone) {
        this.dataCadastro = LocalDate.now();
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
