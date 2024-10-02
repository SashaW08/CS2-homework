import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medium2 {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private int WIDTH=1500;
    private int HEIGHT=1100;

    public Medium2() {
        prepareGUI();
    }
    public static void main(String[] args) {
        Medium2 medium2 = new Medium2();
        medium2.showEventDemo();
    }
    private void prepareGUI() {
        mainFrame = new JFrame("Sasha Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        mainFrame.setVisible(true);
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());
    }
    private void showEventDemo() {
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");
        JLabel label = new JLabel("Label", JLabel.CENTER);

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(controlPanel);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);

        controlPanel.add(button9, BorderLayout.EAST);
        controlPanel.add(label, BorderLayout.CENTER);
        controlPanel.add(button10, BorderLayout.SOUTH);

        mainFrame.setVisible(true);
    }
}
