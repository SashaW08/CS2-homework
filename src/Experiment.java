import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Experiment {

    private JFrame mainFrame;
    private int WIDTH=100;
    private int HEIGHT=100;

    public Experiment() {
        prepareGUI();
    }
    public static void main(String[] args) {
        Experiment experiment = new Experiment();
        experiment.showEventDemo();
    }
    private void prepareGUI() {

        mainFrame = new JFrame("Sasha Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        mainFrame.setVisible(true);

    }
    private void showEventDemo() {
        JButton button1 = new JButton("Buttonn");
        JButton button2 = new JButton("Buttonn");
        JButton button3 = new JButton("Buttonnnn");
        JButton button4 = new JButton("Buttonnnn");
        JButton button5 = new JButton("Buttonnnnn");
        JButton button6 = new JButton("Buttonnnnnn");
        JButton button7 = new JButton("Buttonnnnnnn");
        JButton button8 = new JButton("Buttonnnnnnnn");
        JButton button9 = new JButton("Buttnonnnnnnnn");
        JButton button10 = new JButton("Buttonnnnnnnnnn");

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);
        mainFrame.add(button9);
        mainFrame.add(button10);

        mainFrame.setVisible(true);
    }

}
