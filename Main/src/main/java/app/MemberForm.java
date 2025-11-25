package app;

import model.*;
import javax.swing.*;

public class MemberForm extends JFrame {

    private JTextField txtId, txtFirst, txtLast, txtClass, txtEmail, txtPhone;

    public MemberForm() {
        setTitle("New Member");
        setSize(350, 350);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lbId = new JLabel("Member ID");
        lbId.setBounds(20, 20, 100, 25);
        add(lbId);

        txtId = new JTextField();
        txtId.setBounds(140, 20, 150, 25);
        add(txtId);

        JLabel lbF = new JLabel("First Name");
        lbF.setBounds(20, 60, 100, 25);
        add(lbF);

        txtFirst = new JTextField();
        txtFirst.setBounds(140, 60, 150, 25);
        add(txtFirst);

        JLabel lbL = new JLabel("Last Name");
        lbL.setBounds(20, 100, 100, 25);
        add(lbL);

        txtLast = new JTextField();
        txtLast.setBounds(140, 100, 150, 25);
        add(txtLast);

        JLabel lbC = new JLabel("Member Class");
        lbC.setBounds(20, 140, 120, 25);
        add(lbC);

        txtClass = new JTextField();
        txtClass.setBounds(140, 140, 150, 25);
        add(txtClass);

        JLabel lbEmail = new JLabel("Email");
        lbEmail.setBounds(20, 180, 100, 25);
        add(lbEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(140, 180, 150, 25);
        add(txtEmail);

        JLabel lbPhone = new JLabel("Phone No.");
        lbPhone.setBounds(20, 220, 100, 25);
        add(lbPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(140, 220, 150, 25);
        add(txtPhone);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(110, 260, 100, 30);
        btnSave.addActionListener(e -> saveMember());
        add(btnSave);
    }

    private void saveMember() {

        String id = txtId.getText().trim();
        String fn = txtFirst.getText().trim();
        String ln = txtLast.getText().trim();
        String cls = txtClass.getText().trim();
        String email = txtEmail.getText().trim();
        String phone = txtPhone.getText().trim();

        if (id.isEmpty() || fn.isEmpty() || ln.isEmpty() || cls.isEmpty()
                || email.isEmpty() || phone.isEmpty()) {

            JOptionPane.showMessageDialog(this, "All fields required");
            return;
        }

        Member m;

        switch (cls) {
            case "First":
                m = new FirstClass(id, fn, ln, email, phone);
                break;

            case "Business":
                m = new BusinessClass(id, fn, ln, email, phone);
                break;

            case "Economy":
                m = new EconomyClass(id, fn, ln, email, phone);
                break;

            default:
                JOptionPane.showMessageDialog(this,
                        "Member Class must be First, Business or Economy");
                return;
        }

        MemberManager.memberList.add(m);
        JOptionPane.showMessageDialog(this, "Saved!");
        dispose();
    }
}
