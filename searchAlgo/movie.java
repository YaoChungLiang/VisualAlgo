package searchAlgo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class movie extends JPanel implements ActionListener{
    Timer tm  = new Timer(1,this);   /*this stands for the movie*/
    System.out.println(this);
    int x = 0, velx = 2;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x,x,50,30);

        tm.start();
    }

    public void actionPerformed(ActionEvent e){
        if(x<0 || x>550){
            velx = -velx;
        }
        x = x + velx;
        repaint();
    }

    public static void main(String args[]){
        movie m = new movie();
        JFrame jf = new JFrame();
        jf.setTitle("Kind of Movie ");
        jf.setSize(600,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(m);
    }
}


