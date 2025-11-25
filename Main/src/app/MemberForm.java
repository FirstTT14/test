package app;

import model.*;
import javax.swing.*;

public class MemberForm extends JFrame {

    private JTextField txtId, txtFirst, txtLast, txtClass;

    public MemberForm() {
        setTitle("New Member");
        setSize(350, 260);
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
        lbC.setBounds(20, 140, 100, 25);
        add(lbC);

        txtClass = new JTextField();
        txtClass.setBounds(140, 140, 150, 25);
        add(txtClass);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(120, 180, 100, 25);
        btnSave.addActionListener(e -> saveMember());
        add(btnSave);
    }

    private void saveMember() {
        String id = txtId.getText().trim();
        String fn = txtFirst.getText().trim();
        String ln = txtLast.getText().trim();
        String cls = txtClass.getText().trim();

        if (id.isEmpty() || fn.isEmpty() || ln.isEmpty() || cls.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields required");
            return;
        }

        Member m;

        switch (cls) {
            case "First": 
                m = new FirstClass(id, fn, ln); 
                break;
            case "Business": 
                m = new BusinessClass(id, fn, ln); 
                break;
            case "Economy": 
                m = new EconomyClass(id, fn, ln); 
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
