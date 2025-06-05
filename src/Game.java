import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class Game{
    int count=0;
    Scanner scanner = new Scanner(System.in);
    Random generator = new Random();
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    checkS1 checko = new checkS1();
    checkS2 ch2 = new checkS2();
    //Warning warning = new Warning();
    rightMouse mouse = new rightMouse();
    public Game(JButton[][] buttons,int a , int b,int c){
        while(true){
            int row =generator.nextInt(a);
            int col = generator.nextInt(b);
            int color = generator.nextInt(3);

            if (color == 1) {
                buttons[row][col].setBackground(Color.BLACK);
            } else if (color == 2) {
                buttons[row][col].setBackground(Color.WHITE);
            }//else
                //buttons[row][col].setBackground(Color.GRAY);
            count=0;
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    panel.add(buttons[i][j]);
                    if(buttons[i][j].getBackground() == Color.WHITE || buttons[i][j].getBackground() == Color.BLACK){
                        count++;
                    }
                }
            }
            if (count == c){
                break;
            }
        }
        frame.add(panel);
        panel.setBackground(Color.BLUE);
        panel.setLayout(new GridLayout(a,b));
        panel.setBounds(55,43,400,400);

        frame.setBounds(400,130,550,550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setVisible(true);


//
//        boolean ch = checko.check(buttons,a,b);
//        //boolean ch2 = checko.check(buttons,a,b);
//        if(ch == false){
////            try {
////                Thread.sleep(5000); // مکث 5 ثانیه
////            } catch (InterruptedException e) {
////                // برای پردازش خطاها
////                e.printStackTrace();
////            }
//            frame.dispose();
//            warning.warn(buttons,a,b);
//        }else if (ch == true){
//            frame.dispose();
//            warning.warn(buttons,a,b);
//        }
////           boolean ch2 = chi.check2(buttons,a,b);
////           if(ch2 == false){
////               warning.warn(buttons,a,b);
////           } else if (ch2 == true) {
////
////           }
////        }

//        JButton b2 = new JButton("Check");
//        frame.add(b2);
//        b2.setBounds(80,460,100,30);
//        b2.setBackground(Color.magenta);
//        b2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
                //frame.dispose();
                //show sh = new show(a,b);
                //sh.click(a,b);
                boolean ch;
                ch = checko.check(buttons,a,b);
                //boolean ch1;
                //ch1 = ch2.check2(buttons,a,b);
                //boolean ch2 = checko.check(buttons,a,b);
                if(ch == false){
//            try {
//                Thread.sleep(5000); // مکث 5 ثانیه
//            } catch (InterruptedException e) {
//                // برای پردازش خطاها
//                e.printStackTrace();
//            }
                    //frame.dispose();

                    JOptionPane.showMessageDialog(null,"Error coundion one is wrong");
                    frame.dispose();
                    new show(a,b,c);
                    //warning.warn(buttons,a,b);
                }else if (ch == true){
                   // frame.dispose();
                   // warning.cal();
                    //if(ch1 == false){
                        //JOptionPane.showMessageDialog(null,"Error coundion two is wrong");
                        //frame.dispose();
                        //new show(a,b,c);
                    //}else if (ch1 == true)
                    mouse.moo(buttons,a,b,c);
                }
//           boolean ch2 = chi.check2(buttons,a,b);
//           if(ch2 == false){
//               warning.warn(buttons,a,b);
//           } else if (ch2 == true) {
//
//           }
//        }
//        end(buttons,a,b);
    }
        //});
    public static int end(JButton[][] buttons,int a,int b){
        int num=0;
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                if (buttons[i][j].getBackground() != Color.gray){
                    num++;
                }
            }
        }
        if(num == a*b) {
            return 1;
        }
        else
            return 0;
    }
}


