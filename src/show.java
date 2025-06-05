import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class show {
    JFrame frame = new JFrame("Ying-Yang Game");
    JPanel panel = new JPanel();
    JButton[][] button;
    int c;
    public show(int a , int b,int c){
        button = new JButton[a][b];
        this.c=c;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                button[i][j] = new JButton();
                button[i][j].setBackground(Color.GRAY);
                panel.add(button[i][j]);
            }
        }
        frame.add(panel);
        panel.setBackground(Color.BLUE);
        panel.setLayout(new GridLayout(a,b));
        panel.setBounds(55,43,400,400);

        frame.add(panel);
        frame.setBounds(400,130,550,550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setVisible(true);
        click(a,b,c);
        Back();
    }
    public void click(int a,int b,int c){
        JButton b1 = new JButton("Play");
        frame.add(b1);
        b1.setBounds(80,460,100,30);
        b1.setBackground(Color.magenta);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Game gm = new Game(button,a,b,c);
            }
        });
    }
    void Back(){
        JButton b2 = new JButton("Back");
        frame.add(b2);
        b2.setBounds(350,460,100,30);
        b2.setBackground(Color.magenta);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Menu();
            }
        });
    }
}
