package controle;
import modelo.*;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.Cliente(
                "Carlos Fernandes Oliveira",
                "Rua Marisa Athayde Nakad, 1052",
                "(18) 8303-7591",
                "CarlosFernandesOliveira@jourrapide.com",
                "693.057.145-87");
        JOptionPane.showMessageDialog(null,cliente.getNome()+"\n"+cliente.getEndereco()+"\n"+cliente.getTelefone()+"\n"+cliente.getEmail()+"\n"+cliente.getCpf(), "Cliente", JOptionPane.INFORMATION_MESSAGE);

        Veiculo veiculo = new Veiculo();

        veiculo.Veiculo(
                2002,
                "LFC-4370",
                "Ranger XLT 2.8 8v 135cv 4x4 CD TB Diesel",
                "Ford",
                "Amarelo");

        JOptionPane.showMessageDialog(null,veiculo.getFabricante()+"\n"+veiculo.getModelo()+"\n"+veiculo.getAno()+"\n"+veiculo.getPlaca()+"\n"+veiculo.getCor(), "Veiculo", JOptionPane.INFORMATION_MESSAGE);

    }
}
