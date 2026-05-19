import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI extends JFrame {
    // UI Components
    private JTextField txtId, txtName, txtAge, txtCourse, txtSearch;
    private JButton btnAdd, btnUpdate, btnDelete, btnClear, btnSearch;
    private JTable studentTable;
    private DefaultTableModel tableModel;

    // Local array list acting as data store
    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentGUI() {
        // 1. Initialize Window Framework
        setTitle("Student Management System (GUI Edition)");
        setSize(600, 600); // Increased height to comfortably fit the search bar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout(10, 10));

        // ==========================================
        // 2. TOP CONTAINER PANEL (Holds Inputs + Search + Buttons)
        // ==========================================
        JPanel pnlNorthContainer = new JPanel(new BorderLayout(5, 5));

        // Input Fields Panel 
        JPanel pnlInputs = new JPanel(new GridLayout(4, 2, 5, 5));
        pnlInputs.setBorder(BorderFactory.createTitledBorder("Student Details"));

        pnlInputs.add(new JLabel(" Student ID:"));
        txtId = new JTextField();
        pnlInputs.add(txtId);

        pnlInputs.add(new JLabel(" Student Name:"));
        txtName = new JTextField();
        pnlInputs.add(txtName);

        pnlInputs.add(new JLabel(" Student Age:"));
        txtAge = new JTextField();
        pnlInputs.add(txtAge);

        pnlInputs.add(new JLabel(" Enrolled Course:"));
        txtCourse = new JTextField();
        pnlInputs.add(txtCourse);

        // Sub-Container for Search Bar & Action Buttons 
        JPanel pnlActionsContainer = new JPanel(new GridLayout(2, 1, 5, 5));

        // --- BONUS FEATURE: Search Bar Panel --- 
        JPanel pnlSearch = new JPanel(new BorderLayout(5, 5));
        pnlSearch.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        pnlSearch.add(new JLabel("Search by Name: "), BorderLayout.WEST);
        txtSearch = new JTextField();
        pnlSearch.add(txtSearch, BorderLayout.CENTER);
        btnSearch = new JButton("Search / Reset");
        pnlSearch.add(btnSearch, BorderLayout.EAST);

        // Control Buttons Panel 
        JPanel pnlButtons = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
        btnAdd = new JButton("Add Student");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClear = new JButton("Clear Form");

        pnlButtons.add(btnAdd);
        pnlButtons.add(btnUpdate);
        pnlButtons.add(btnDelete);
        pnlButtons.add(btnClear);

        // Stack Search and Buttons together
        pnlActionsContainer.add(pnlSearch);
        pnlActionsContainer.add(pnlButtons);

        // Nest everything into the main North Container
        pnlNorthContainer.add(pnlInputs, BorderLayout.NORTH);
        pnlNorthContainer.add(pnlActionsContainer, BorderLayout.SOUTH);

        add(pnlNorthContainer, BorderLayout.NORTH);

        // ==========================================
        // 3. CENTER PANEL: Data View (Table) 
        // ==========================================
        String[] columnNames = {"ID", "Name", "Age", "Course"};
        tableModel = new DefaultTableModel(columnNames, 0);
        studentTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(studentTable);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Registered Students"));

        add(scrollPane, BorderLayout.CENTER);

        // ==========================================
        // 4. EVENT HANDLING: Button Click Mapping 
        // ==========================================
        
        // Add Record Action 
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateForm()) {
                    int id = Integer.parseInt(txtId.getText().trim());
                    String name = txtName.getText().trim();
                    int age = Integer.parseInt(txtAge.getText().trim());
                    String course = txtCourse.getText().trim();

                    // Check for duplicate ID
                    for (Student s : studentList) {
                        if (s.getId() == id) {
                            JOptionPane.showMessageDialog(null, "Error: Student ID already exists!", "Input Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }

                    studentList.add(new Student(id, name, age, course));
                    updateTable(studentList);
                    clearFields();
                }
            }
        });

        // Update Record Action 
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtId.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a Student ID to locate the record.", "Missing Info", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int id = Integer.parseInt(txtId.getText().trim());
                for (Student s : studentList) {
                    if (s.getId() == id) {
                        s.setName(txtName.getText().trim());
                        s.setAge(Integer.parseInt(txtAge.getText().trim()));
                        s.setCourse(txtCourse.getText().trim());
                        updateTable(studentList);
                        clearFields();
                        JOptionPane.showMessageDialog(null, "Record updated successfully!");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Student ID not found.");
            }
        });

        // Delete Record Action 
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtId.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a Student ID to remove.", "Missing Info", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int id = Integer.parseInt(txtId.getText().trim());
                for (int i = 0; i < studentList.size(); i++) {
                    if (studentList.get(i).getId() == id) {
                        studentList.remove(i);
                        updateTable(studentList);
                        clearFields();
                        JOptionPane.showMessageDialog(null, "Record dropped successfully.");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Student ID not found.");
            }
        });

        // --- SEARCH ACTION BUTTON (Bonus Feature) --- 
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = txtSearch.getText().trim().toLowerCase();
                
                // If the search bar is empty, show the full list (Reset)
                if (query.isEmpty()) {
                    updateTable(studentList);
                    return;
                }

                ArrayList<Student> filteredList = new ArrayList<>();
                for (Student s : studentList) {
                    if (s.getName().toLowerCase().contains(query)) {
                        filteredList.add(s);
                    }
                }

                // Update the table to ONLY display filtered results
                updateTable(filteredList);

                if (filteredList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No students found matching that name.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Clear Fields Action [cite: 59]
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
                txtSearch.setText("");
                updateTable(studentList); // Reset back to showing everyone
            }
        });
    }

    // Form Validation Logic [cite: 63]
    private boolean validateForm() {
        try {
            if (txtId.getText().trim().isEmpty() || txtName.getText().trim().isEmpty() || 
                txtAge.getText().trim().isEmpty() || txtCourse.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "All input fields must be filled out!", "Validation Alert", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            Integer.parseInt(txtId.getText().trim());
            Integer.parseInt(txtAge.getText().trim());
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID and Age values must be numeric numbers!", "Format Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Refresh display layout panel based on whatever list is passed to it
    private void updateTable(ArrayList<Student> listToShow) {
        tableModel.setRowCount(0); // clear existing visuals
        for (Student s : listToShow) {
            Object[] rowData = {s.getId(), s.getName(), s.getAge(), s.getCourse()};
            tableModel.addRow(rowData);
        }
    }

    // Quick clear command helper
    private void clearFields() {
        txtId.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtCourse.setText("");
    }

    // Main execution point
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentGUI().setVisible(true);
            }
        });
    }
}