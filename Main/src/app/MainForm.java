package app;

import javax.swing.*;

public class MainForm extends JFrame {
    public MainForm() {
        setTitle("Member System");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();

        JMenu mLogin = new JMenu("Login");
        JMenuItem miLogout = new JMenuItem("Logout");
        JMenuItem miExit = new JMenuItem("Exit");

        miLogout.addActionListener(e -> {
            new LoginForm().setVisible(true);
            dispose();
        });
        miExit.addActionListener(e -> System.exit(0));

        mLogin.add(miLogout);
        mLogin.addSeparator();
        mLogin.add(miExit);

        JMenu mMember = new JMenu("Members");
        JMenuItem miNew = new JMenuItem("New Member");
        JMenuItem miList = new JMenuItem("Member List");

        miNew.addActionListener(e -> new MemberForm().setVisible(true));
        miList.addActionListener(e -> new MemberListForm().setVisible(true));

        mMember.add(miNew);
        mMember.add(miList);

        menu.add(mLogin);
        menu.add(mMember);

        setJMenuBar(menu);
    }
}
