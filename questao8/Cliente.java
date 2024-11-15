package questao8;

public class Cliente {
    private Long id;
    private String nome;
    private String dataCadastro;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(String dataCadastro, String email, String endereco, Long id, String nome, String telefone) {
        this.dataCadastro = dataCadastro;
        this.email = email;
        this.endereco = endereco;
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getDataCadastro() {
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

    public Long getId() {
        return id;
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
