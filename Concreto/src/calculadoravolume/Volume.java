package calculadoravolume;

import javax.swing.JOptionPane;

public class Volume {
    private float base;
    private float altura;
    private float comprimento;
    private float volume;

    public void setMedidas(){
        base = Float.parseFloat(JOptionPane.showInputDialog("Informe a base: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura: "));
        comprimento = Float.parseFloat(JOptionPane.showInputDialog("Informe o comprimento: "));
    }

    public void calcularVolume(){
        volume = base * altura * comprimento;
        JOptionPane.showMessageDialog(null, "O volume necessário de concreto é de "+volume+" m³");
    }

}
