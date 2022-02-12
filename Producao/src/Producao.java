public class Producao{
    int previsaodemanda = 200;
    int producaonormal = 250;
    int estoqueinicial = 50;
    int estoquefinal;

    public static void main(String []args){
        Producao prod = new Producao();
        prod.estoquefinal = (prod.estoqueinicial + prod.producaonormal) - prod.previsaodemanda;
        System.out.println("O estoque final previsto para o mês é de: "+ prod.estoquefinal + " unidades.");
    }
}