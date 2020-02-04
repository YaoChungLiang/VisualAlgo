package searchAlgo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Arrays;

public class VisualBoxes extends JPanel implements ActionListener{
    int[] values;
    int target;
    int fW = 600, fH = 600, MinH = 50, MaxH = 550;
    Timer tm = new Timer(100, this);


    public VisualBoxes(int[] arr, int tar){
        values = arr;
        target = tar;
    }

    public void paintComponent(Graphics g, int[] arr){
        super.paintComponent(g);
        int x,y,w,h;
        Arrays.sort(arr);
        int n = arr.length, Max = arr[n-1], Min = arr[0];
        

        for(int i = 0; i < n ; i++){
            g.setColor(Color.RED);
            x = (int)(i * fW / (float) n);
            y = fH - ( (arr[i] - Min)/ (Max-Min) * (MaxH-MinH) + MinH);
            w = fW/n; 
            h =  (arr[i] - Min)/ (Max-Min) * (MaxH-MinH) + MinH;
            g.fillRect(x ,y, w, h);
        }
        tm.start();
    }
    
    public void actionPerformed(ActionEvent e){
        repaint();
    }


}
