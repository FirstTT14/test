package app;

import javax.swing.*;

public class LoginForm extends JFrame {
    private JTextField txtUser;
    private JPasswordField txtPass;

    public LoginForm() {
        setTitle("Login");
        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lb1 = new JLabel("Username");
        lb1.setBounds(20, 20, 80, 25);
        add(lb1);

        txtUser = new JTextField();
        txtUser.setBounds(120, 20, 150, 25);
        add(txtUser);

        JLabel lb2 = new JLabel("Password");
        lb2.setBounds(20, 60, 80, 25);
        add(lb2);

        txtPass = new JPasswordField();
        txtPass.setBounds(120, 60, 150, 25);
        add(txtPass);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(40, 100, 80, 25);
        btnLogin.addActionListener(e -> doLogin());
        add(btnLogin);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(150, 100, 80, 25);
        btnReset.addActionListener(e -> resetForm());
        add(btnReset);
    }

    private void doLogin() {
        if (txtUser.getText().equals("admin") && 
            txtPass.getText().equals("1234")) {

            new MainForm().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed!");
        }
    }

    private void resetForm() {
        txtUser.setText("");
        txtPass.setText("");
    }
}
