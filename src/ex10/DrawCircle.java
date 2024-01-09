package ex10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawCircle extends JFrame implements MouseListener {
    public DrawCircle() {
        addMouseListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.fillOval(e.getX() - 30, e.getY() - 30, 90, 90);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }


    public static void main(String[] args) {

        DrawCircle d = new DrawCircle();


    }


}
