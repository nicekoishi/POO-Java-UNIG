package membros;

public class Associacao {
    public static void main(String[] args) {
        Associado aso = new Associado(
                "Thaís Ferreira Fernandes", 19, 77, "83707-020", "Rua João Bosquetto", "PR", "Araucária", "446.899.356-10", "(41) 7226-7515", "DESLIGADO(A)", "4940028922");
        Colaborador colab = new Colaborador(
                "Luís Azevedo Barros", 47, 1046, "40375-510", "Rua Bruno Seabra", "BA", "Salvador", "477.326.245-13", "(71) 4531-7010", "Database admin");
        Fornecedor forn = new Fornecedor(
                "Yasmin Dias Alves", 27, 811, "13480-240", "Rua Doutor Roberto Mange", "SP", "Limeira", "489.147.723-73", "(19) 9641-7061", "Maísa", "https://www.howstuffworks.com/"
        );

        
    }
}
