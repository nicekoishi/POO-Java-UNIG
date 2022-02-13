package cadaluno;

public class Aluno {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String matricula;

    public void Aluno(String nome, String endereco, String telefone, String email, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }


    public String getTelefone(){
        return telefone;
    }


    public String getEmail(){
        return email;
    }

    public String getMatricula(){
        return matricula;
    }
}
