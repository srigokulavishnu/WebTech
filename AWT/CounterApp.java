import java.awt.*;
import java.awt.event.*;

public class CounterApp extends Frame implements ActionListener {
    private Label countLabel;
    private Button incrementBtn, resetBtn;
    private int count = 0;

    public CounterApp() {
        setTitle("Counter");
        setSize(250, 150);
        setLayout(new FlowLayout());

        countLabel = new Label("Count: 0");
        incrementBtn = new Button("Increment");
        resetBtn = new Button("Reset");

        add(countLabel);
        add(incrementBtn);
        add(resetBtn);

        incrementBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementBtn) {
            count++;
            countLabel.setText("Count: " + count);
        } else if (e.getSource() == resetBtn) {
            count = 0;
            countLabel.setText("Count: 0");
        }
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}
