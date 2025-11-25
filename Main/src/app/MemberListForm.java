package app;

import model.Member;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MemberListForm extends JFrame {

    private JTable table;

    public MemberListForm() {
        setTitle("Member List");
        setSize(500, 300);
        setLocationRelativeTo(null);

        String[] cols = {"ID", "First Name", "Last Name", "Class"};
        table = new JTable(new DefaultTableModel(cols, 0));

        JButton btnReload = new JButton("Reload");
        btnReload.addActionListener(e -> reloadData());

        add(new JScrollPane(table), "Center");
        add(btnReload, "South");
    }

    private void reloadData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        for (Member m : MemberManager.memberList) {
            Object[] row = {
                m.getId(),
                m.getFirstName(),
                m.getLastName(),
                m.getMemberClass()
            };
            model.addRow(row);
        }
    }
}
