package ex09;

import javax.swing.*;

public class LoginWindow extends JFrame {
    public LoginWindow() {
        setTitle("login window");
        setSize(500, 300);

        JPanel panel = new JPanel();
        add(panel);

        panel.add(new JLabel("id    "));
        panel.add(new JTextField(30));
        panel.add(new JLabel("pass"));
        panel.add(new JPasswordField(30));

        JButton login = new JButton("login");
        panel.add(login);

        JButton cancel = new JButton("cancel");
        panel.add(cancel);

        setVisible(true);
    }

    public static void main(String[] args) {
        LoginWindow l = new LoginWindow();


    }
}
