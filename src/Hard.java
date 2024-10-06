import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hard {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JPanel borderpanel;
    private JPanel numberpanel;
    private JPanel panelpanel;
    private JPanel morepanel;

    private JMenuBar mb;
    private JMenu file, edit, help;
    private JTextArea ta; //typing area
    private int WIDTH=1500;
    private int HEIGHT=1100;

    public Hard() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Hard hard = new Hard();
        hard.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Sasha Learning SWING");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(0, 500, WIDTH-100, HEIGHT-300);
        mainFrame.add(mb);  //add menu bar
        mainFrame.setJMenuBar(mb); //set menu bar

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        borderpanel = new JPanel();
        numberpanel = new JPanel();
        panelpanel = new JPanel();
        morepanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,3)); //set the layout of the panel
        borderpanel.setLayout(new GridLayout(2,1));
        numberpanel.setLayout(new GridLayout(1,9));
        panelpanel.setLayout(new GridLayout(1,2));
        morepanel.setLayout(new GridLayout(2,1));

        panelpanel.add(controlPanel);
        panelpanel.add(borderpanel);

        mainFrame.add(morepanel);

        morepanel.add(panelpanel);
        morepanel.add(ta);//add typing area

        mainFrame.add(numberpanel, BorderLayout.SOUTH);

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JLabel top01 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top02 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top03 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top04 = new JLabel("Top 0", JLabel.CENTER);
        JLabel top05 = new JLabel("Top 0", JLabel.CENTER);

        JButton top1 = new JButton("Top 1");
        JButton top2 = new JButton("Top 2");
        JButton top3 = new JButton("Top 3");
        JButton top4 = new JButton("Top 4");

        JLabel topright = new JLabel("Top Right", JLabel.CENTER);
        JButton button1 = new JButton("1");

        JButton button11 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        JLabel button01 = new JLabel("0", JLabel.CENTER);
        JLabel button02 = new JLabel("0", JLabel.CENTER);
        JLabel button03 = new JLabel("0", JLabel.CENTER);
        JLabel button04 = new JLabel("0", JLabel.CENTER);
        JLabel button05 = new JLabel("0", JLabel.CENTER);


        controlPanel.add(top01);
        controlPanel.add(top1);
        controlPanel.add(top02);
        controlPanel.add(top2);
        controlPanel.add(top03);
        controlPanel.add(top3);
        controlPanel.add(top04);
        controlPanel.add(top4);
        controlPanel.add(top05);

        borderpanel.add(topright);
        borderpanel.add(button1);

        numberpanel.add(button01);
        numberpanel.add(button11);
        numberpanel.add(button02);
        numberpanel.add(button2);
        numberpanel.add(button03);
        numberpanel.add(button3);
        numberpanel.add(button04);
        numberpanel.add(button4);
        numberpanel.add(button05);

        mainFrame.setVisible(true);
    }
}
