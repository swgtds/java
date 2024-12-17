import javax.swing.JFrame;
import javax.swing.JLabel;

public class MessageApp {
    public static void main(String[] args) {
        // Create a JFrame to hold the message
        JFrame frame = new JFrame("Message Window");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello, this is a Swing application!", JLabel.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Set the frame properties
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

