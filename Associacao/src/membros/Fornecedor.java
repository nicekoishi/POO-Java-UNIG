package membros;

public class Fornecedor extends Membro {
    private String nomefantasia, website;
    final String tipo = "Fornecedor";

    Fornecedor(){
        super();
    }

    Fornecedor(String nome, int ID, int numero, String cep, String logradouro, String uf, String bairro, String cpfCnpj, String telefone, String fan, String site){
        super(nome, ID, numero, cep, logradouro, uf, bairro, cpfCnpj, telefone);
        fan = nomefantasia;
        site = website;
    }

    String getNomefantasia(){return nomefantasia;}
    String getTipo(){return tipo;}
}
