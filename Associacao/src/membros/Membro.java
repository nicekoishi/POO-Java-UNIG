package membros;

public class Membro {
    private int ID, numero;
    private String nome, logradouro, cep, bairro, cidade, uf, telefone, cpfCnpj;

    Membro(){
        int ID, numero = 0;
        String nome, logradouro, cep, bairro, cidade, uf, telefone, cpf, cnpj = "";
    }

    Membro(String nome, int ID, int numero, String cep, String logradouro, String uf, String bairro, String cpfCnpj, String telefone){
    }

    int getID(){return ID;}
    int getNumero(){return numero;}
    String getNome(){return nome;}
    String getLogradouro(){return logradouro;}
    String getCep(){return cep;}
    String getBairro(){return bairro;}
    String getCidade(){return cidade;}
    String getUf(){return uf;}
    String getTelefone(){return telefone;}
    String getCpfCnpj(){return cpfCnpj;}
}
