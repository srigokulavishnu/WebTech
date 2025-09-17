import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ImageLoader extends JFrame implements ActionListener {
    private JButton browseButton;
    private JLabel imageLabel;

    public ImageLoader() {
        setTitle("Image Loader");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        browseButton = new JButton("Browse");
        imageLabel = new JLabel("", SwingConstants.CENTER);

        add(browseButton, BorderLayout.NORTH);
        add(new JScrollPane(imageLabel), BorderLayout.CENTER);

        browseButton.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
            // Resize image to fit label size if needed
            Image img = icon.getImage();
            Image scaled = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaled);
            imageLabel.setIcon(icon);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageLoader::new);
    }
}
