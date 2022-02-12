package modelo;

public class Veiculo {
    private Integer ano;
    private String placa;
    private String modelo;
    private String fabricante;
    private String cor;

    public void Veiculo(Integer ano, String placa, String modelo, String fabricante, String cor){
        this.ano = ano;
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getCor() {
        return cor;
    }
}
