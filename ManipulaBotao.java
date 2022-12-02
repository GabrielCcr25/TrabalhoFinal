package br.com.poo.Aplicativo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManipulaBotao implements ActionListener {

    int opcoes;

    String email, senha, nome, telefone;

    JButton entrar = new JButton("ENTRAR");

    JButton cadastrar = new JButton("CADASTRAR");

    JButton sair = new JButton("SAIR");

    public void janela() {

        JFrame janela = new JFrame("Interface Gráfica");

        JLabel lblEmail = new JLabel("E-mail: ");
        lblEmail.setBounds(50, 40, 100, 20);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(100, 40, 200, 20);

        JLabel lblsenha = new JLabel("Senha: ");
        lblsenha.setBounds(50, 80, 100, 20);

        JTextField txtSenha = new JTextField();
        txtSenha.setBounds(100, 80, 200, 20);


        JPanel panel = new JPanel();

        janela.add(lblEmail);
        janela.add(txtEmail);

        janela.add(lblsenha);
        janela.add(txtSenha);

        janela.add(entrar);
        entrar.setBounds(125, 120, 120, 20);

        entrar.addActionListener(this);

        janela.add(cadastrar);
        cadastrar.setBounds(130, 150, 110, 20);

        cadastrar.addActionListener(this);

        janela.add(sair);
        sair.setBounds(150, 180, 70, 20);

        sair.addActionListener(this);

        janela.getContentPane().add(panel);
        janela.setSize(400, 300);
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == entrar) {

            do {
                opcoes = Integer.parseInt(JOptionPane.showInputDialog("<1>     Incluir "
                        + "\n<2>     Consultar "
                        + "\n<3>     Excluir "
                        + "\n<4>     Mensagem "
                        + "\n<5>     Sair"));

                switch (opcoes) {
                    case 1:
                        String nomeAmigo = JOptionPane.showInputDialog(null, "Nome: ");
                        Sistema incluir = new Sistema();
                        Amigo amigo = new Amigo();
                        amigo.nomeAmigo = nomeAmigo;
                        incluir.adicionarNome(amigo);


                        JOptionPane.showMessageDialog(null, nomeAmigo + " adicionado na sua lista de amigos !", " Incluir ", JOptionPane.DEFAULT_OPTION);
                        break;

                    case 2:
                        Sistema amigos = new Sistema();
                        amigos.imprimirLista();

                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, " remove ", " Mensagem ", JOptionPane.DEFAULT_OPTION);
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, " ", " Mensagem ", JOptionPane.DEFAULT_OPTION);

                    case 5:
                        break;

                }
            }while(opcoes!=5);

            if (e.getSource() == cadastrar) {
               nome = JOptionPane.showInputDialog(null,   " Nome: "+nome, "  ", JOptionPane.DEFAULT_OPTION);
                email = JOptionPane.showInputDialog(null,   " Email: "+email, "  ", JOptionPane.DEFAULT_OPTION);
                senha = JOptionPane.showInputDialog(null,   " Senha: "+senha, "  ", JOptionPane.DEFAULT_OPTION);
                telefone = JOptionPane.showInputDialog(null,   " Telefone: "+telefone, "  ", JOptionPane.DEFAULT_OPTION);
                JOptionPane.showMessageDialog(null,  " Usuario adicionado !", " Incluir ", JOptionPane.DEFAULT_OPTION);

            }
        }
    }
}