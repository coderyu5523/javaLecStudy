package ex09;

import javax.swing.*;
import java.awt.*;

public class ImageViewer extends JFrame {

    private JPanel panel;
    private JLabel label;


    private ImageViewer() {
        setTitle("image view");
        setSize(400, 500);
        setLayout(new BorderLayout());


        panel = new JPanel();
        label = new JLabel("Dog");
        ImageIcon icon = new ImageIcon("d://dog.png");
        label.setIcon(icon);

        JButton button1 = new JButton("<<");
        JButton button2 = new JButton("<");
        JButton button3 = new JButton(">");
        JButton button4 = new JButton(">>");
        add(button1, "South");
        add(button2, "South");
        add(button3, "South");
        add(button4, "South");


        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageViewer();
    }
}
