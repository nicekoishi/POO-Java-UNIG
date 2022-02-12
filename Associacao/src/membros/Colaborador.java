package membros;

public class Colaborador extends Membro {
    private String cargo;
    final String tipo = "Colaborador";

    Colaborador(){
        super();
    }

    Colaborador(String nome, int ID, int numero, String cep, String logradouro, String uf, String bairro, String cpfCnpj, String telefone, String car){
        super(nome, ID, numero, cep, logradouro, uf, bairro, cpfCnpj, telefone);
        car = cargo;
    }

    String getCargo(){return cargo;}
    String getTipo(){return tipo;}
}
