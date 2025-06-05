import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class rightMouse {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    checkS1 c = new checkS1();
    checkS2 co = new checkS2();
    Game game ;
    public void moo(JButton[][] buttons,int a,int b,int w){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                //buttons[i][j] =new JButton();
                panel.add(buttons[i][j]);
                //buttons[i][j].setBackground(Color.GRAY);

                final int k = i;
                final int l = j;
                buttons[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Color c1 = buttons[k][l].getBackground();
                        if(e.getButton() == MouseEvent.BUTTON1){
                            if(buttons[k][l].getBackground() == Color.WHITE){
                                buttons[k][l].setBackground(Color.BLACK);
                                if(Game.end(buttons,a,b) == 1){
                                    JOptionPane.showMessageDialog(panel,"victory");
                                    new show(a,b,w);
                                    frame.dispose();
                                }

                            } else if (buttons[k][l].getBackground() == Color.BLACK) {
                                buttons[k][l].setBackground(Color.WHITE);
                                if(Game.end(buttons,a,b) == 1){
                                    JOptionPane.showMessageDialog(panel,"victory");
                                    new show(a,b,w);
                                    frame.dispose();
                                }
                            }else {
                                buttons[k][l].setBackground(Color.WHITE);
                                if(Game.end(buttons,a,b) == 1){
                                    JOptionPane.showMessageDialog(panel,"victory");
                                    new show(a,b,w);
                                    frame.dispose();
                                }
                            }
                        }
                        boolean sup = c.check(buttons,a,b);
                        if(sup == false){
                            JOptionPane.showMessageDialog(null,"Error coundion one is wrong");
                            buttons[k][l].setBackground(c1);
                        } else if (sup == true);

                        boolean sup1 = co.check2(buttons,a,b);
                        if(sup1 == false){
                            JOptionPane.showMessageDialog(null,"Error coundion one is wrong");
                            buttons[k][l].setBackground(c1);
                        }else if(sup1 == false);
                    }
                });
                buttons[k][l].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(e.getButton() == MouseEvent.BUTTON3){
                            if(buttons[k][l].getBackground() == Color.WHITE || buttons[k][l].getBackground() == Color.BLACK){
                                buttons[k][l].setBackground(Color.GRAY);
                            }
                        }
                        boolean cup = c.check(buttons,a,b);
                        if(cup == false){
                            JOptionPane.showMessageDialog(null,"Error coundion one is wrong");
                        } else if (cup==true);
                        boolean cup1 = co.check2(buttons,a,b);
                        if(cup1 == false){
                            JOptionPane.showMessageDialog(null,"Error coundion two is wrong");
                        }else if(cup1 == false);
                    }
                });
                buttons[k][l].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        buttons[k][l].setBorderPainted(true);
                        buttons[k][l].setBorder(javax.swing.BorderFactory.createLineBorder(Color.MAGENTA));
                    }
                    public void mouseExited(MouseEvent event){
                        buttons[k][l].setBorderPainted(false);
                    }
                });
            }
        }
        Back(a,b,w);
        Help();
        frame.add(panel);
        panel.setBackground(Color.BLUE);
        panel.setLayout(new GridLayout(a,b,2,2));
        panel.setBounds(55,43,400,400);

        frame.add(panel);
        frame.setBounds(400,130,550,550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setVisible(true);
    }
    void Back(int a , int b, int c){
        JButton b2 = new JButton("Back");
        frame.add(b2);
        b2.setBounds(350,460,100,30);
        b2.setBackground(Color.magenta);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new show(a,b,c);
            }
        });
    }
    void Help(){
        JButton b3 = new JButton("Help");
        frame.add(b3);
        b3.setBounds(80,460,100,30);
        b3.setBackground(Color.magenta);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                //متذ هلپ
            }
        });
    }
}
