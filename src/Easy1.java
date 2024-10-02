import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Easy1  {

    private JFrame mainFrame;
    private int WIDTH=1500;
    private int HEIGHT=1100;

    public Easy1() {
        prepareGUI();
    }
    public static void main(String[] args) {
        Easy1 easy1 = new Easy1();
        easy1.showEventDemo();
    }
    private void prepareGUI() {
        mainFrame = new JFrame("Sasha Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2,3));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        mainFrame.setVisible(true);
    }
    private void showEventDemo() {
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("button 5");

        button1.setActionCommand("Button 1");
        button2.setActionCommand("Button 2");
        button3.setActionCommand("Button 3");
        button4.setActionCommand("Button 4");
        button5.setActionCommand("Button 5");

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(button5);



        mainFrame.setVisible(true);
    }

}