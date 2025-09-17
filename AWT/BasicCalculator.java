import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicCalculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton addBtn, subBtn, mulBtn, divBtn;

    public BasicCalculator() {
        setTitle("Basic Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");

        add(new JLabel("Number 1:"));
        add(num1Field);
        add(new JLabel("Number 2:"));
        add(num2Field);

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);

        add(new JLabel("Result:"));
        add(resultField);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double res = 0;
            if (e.getSource() == addBtn) {
                res = n1 + n2;
            } else if (e.getSource() == subBtn) {
                res = n1 - n2;
            } else if (e.getSource() == mulBtn) {
                res = n1 * n2;
            } else if (e.getSource() == divBtn) {
                if (n2 == 0) {
                    resultField.setText("Error: Divide by zero");
                    return;
                }
                res = n1 / n2;
            }
            resultField.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BasicCalculator::new);
    }
}

