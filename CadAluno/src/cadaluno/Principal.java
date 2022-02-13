package cadaluno;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.Aluno("João Carlos da Silva Azevedo", "Rua Francisco Baroni, 121", "(21) 9019-8005", "joaozinpegador032@gmail.com", "793712824853");

        JOptionPane.showMessageDialog(
                null, aluno.getNome()+"\n"+aluno.getEndereco()+"\n"+aluno.getTelefone()+"\n"+aluno.getEmail()+"\n"+aluno.getMatricula()+"\n");
    }
}
