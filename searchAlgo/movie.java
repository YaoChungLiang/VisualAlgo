package searchAlgo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class movie extends Jpanel implements ActionListener{
    Timer tm  = new Timer(5,this);
    int x = 0, velx = 2;
    public void paintComponent(Graphic g){
        super.paintComponet(g);
        g.setColor(Color.RED);
        g.fillrect(x,30,50,30);

        tm.start();
    }

    public void actionPerformed(ActionEvent e){
        x = x + velx;
        repaint();
    }

    public void main(String args[]){
        movie m = new movie();
        JFrame jf = new JFrame();
        jf.setTitle("Kind of Movie ");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(m);
    }
}
