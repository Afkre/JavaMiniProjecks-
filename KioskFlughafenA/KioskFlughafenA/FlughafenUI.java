package KioskFlughafenA;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class FlughafenUI extends JFrame {
    

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Flughafen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Kullanıcı arayüzü bileşenlerini oluşturun ve yerleştirin

        frame.pack();
        frame.setVisible(true);
    });
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Flughafen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Willkommen am Flughafen Memmingen");
        JButton button1 = new JButton("Visum überprüfen");

        // Bileşenleri çerçeve içine yerleştirin
        frame.getContentPane().add(label1);
        frame.getContentPane().add(button1);

        frame.pack();
        frame.setVisible(true);
    });
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Flughafen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Willkommen am Flughafen Memmingen");
        JButton button1 = new JButton("Visum überprüfen");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Düğmeye tıklandığında yapılacak işlemi burada tanımlayın
            }
        });

        frame.getContentPane().add(label1);
        frame.getContentPane().add(button1);

        frame.pack();
        frame.setVisible(true);
    });
}
}
