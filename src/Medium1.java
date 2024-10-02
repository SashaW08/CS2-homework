import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Medium1 {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private int WIDTH=1500;
    private int HEIGHT=1100;

    public Medium1() {
        prepareGUI();
    }
    public static void main(String[] args) {
        Medium1 medium1 = new Medium1();
        medium1.showEventDemo();
    }
    private void prepareGUI() {
        mainFrame = new JFrame("Sasha Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        mainFrame.setVisible(true);
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,3));
    }
    private void showEventDemo() {
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("button 5");
        JLabel label1 = new JLabel("label 1", JLabel.CENTER);
        JLabel label2 = new JLabel("label 2", JLabel.CENTER);

//        button1.setActionCommand("Button 1");
//        button2.setActionCommand("Button 2");
//        button3.setActionCommand("Button 3");
//        button4.setActionCommand("Button 4");
//        button5.setActionCommand("Button 5");
//        label1.setActionCommand("Label 1");
//        label2.setActionCommand("Label 2");

        mainFrame.add(button1, BorderLayout.NORTH);
        mainFrame.add(button3, BorderLayout.SOUTH);

        controlPanel.add(button2);
        controlPanel.add(label1);
        controlPanel.add(button4);
        controlPanel.add(label2);
        controlPanel.add(button5);

        mainFrame.add(controlPanel);

        mainFrame.setVisible(true);
    }
}
