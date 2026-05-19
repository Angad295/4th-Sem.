//WAP to demonstrate event handling in java.
import java.awt.*;
import java.awt.event.*;
public class Practical10 extends Frame implements ActionListener {
    Button button;
    public Practical10() {
        button = new Button("Click Me");
        button.setBounds(100, 100, 80, 30);
        button.addActionListener(this);
        add(button);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button was clicked!");
        }
    }
    public static void main(String[] args) {
        new Practical10();
    }
}
