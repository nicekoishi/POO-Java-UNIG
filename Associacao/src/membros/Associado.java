package membros;

import javax.swing.*;

public class Associado extends Membro{
    private String situacao, idassociado;
    final String tipo = "Associado";

    Associado(){
        super();
    }

    Associado(String nome, int ID, int numero, String cep, String logradouro, String uf, String bairro, String cpfCnpj, String telefone, String sit, String idas){
        super(nome, ID, numero, cep, logradouro, uf, bairro, cpfCnpj, telefone);
        sit = situacao;
        idas = idassociado;
    }

    String getSituacao(){return situacao;}
    String getIdassociado(){return idassociado;}
    String getTipo(){return tipo;}
}
