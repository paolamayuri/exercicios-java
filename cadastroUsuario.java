import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class roni extends JFrame implements ActionListener {
    JTextField campoLogin, campoSenha, campoConfirmarSenha;
    JButton botaoCadastrar;

    public roni() {
        setTitle("Cadastro de Usuário");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2));

        JLabel labelLogin = new JLabel("Login:");
        campoLogin = new JTextField();
        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JTextField();
        JLabel labelConfirmarSenha = new JLabel("Confirmar Senha:");
        campoConfirmarSenha = new JTextField();
        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(this);

        painel.add(labelLogin);
        painel.add(campoLogin);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(labelConfirmarSenha);
        painel.add(campoConfirmarSenha);
        painel.add(new JLabel());
        painel.add(botaoCadastrar);

        add(painel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoCadastrar) {
            String login = campoLogin.getText();
            String senha = campoSenha.getText();
            String confirmarSenha = campoConfirmarSenha.getText();

            if (senha.equals(confirmarSenha)) {
                JOptionPane.showMessageDialog(this, "Operação realizada com sucesso");
            } else {
                JOptionPane.showMessageDialog(this, "Senhas diferentes, redigite as senhas");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new roni();
            }
        });
    }
}
