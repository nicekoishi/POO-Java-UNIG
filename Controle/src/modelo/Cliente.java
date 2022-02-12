package modelo;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;

    public void Cliente(String nome, String endereco, String telefone, String email, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
