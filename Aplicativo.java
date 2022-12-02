package br.com.poo.Aplicativo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Aplicativo implements ActionListener {

    public static void main(String[] args) {

        ManipulaBotao manipula = new ManipulaBotao();
        manipula.janela();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    public void janela() {
        JFrame janela = new JFrame("Interface Gráfica");

        JLabel lblEmail = new JLabel("E-mail: ");
        lblEmail.setBounds(50, 40, 100, 20);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(100, 40, 200, 20);

        JLabel lblsenha = new JLabel("Senha: ");
        lblsenha.setBounds(50, 80, 100, 20);
    }
}
