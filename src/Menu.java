import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    JFrame frame;
    JButton[] button = new JButton[3];
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    //ImageIcon image = new ImageIcon("moon2.jpg");
    public Menu(){
        frame = new JFrame();
        frame.setTitle("Menu YinYang Game");
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        for(int i=0;i<3;i++){
            button[i] = new JButton();
        }

        label.setText(" Wellcome to Yin-Yang Games ");
        label.setBounds(70,20,500,70);
        label.setFont(new Font("Arial",Font.PLAIN,18));
        label.setForeground(Color.MAGENTA);
        //label.setDisabledIcon(image);
        panel.add(label);

        button[0].setText(" Start Game ");
        button[0].setBounds(125,130,140,40);
        button[0].setBackground(Color.MAGENTA);
        button[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null," Please enter a number (more than 3) as row : " );
                int num = Integer.parseInt(input);
                String input2 = JOptionPane.showInputDialog(null," Please enter a number (more than 3) as column : " );
                int  num2 = Integer.parseInt(input2);
                String input3 = JOptionPane.showInputDialog(null," Please enter a number as the random number : " );
                int  num3 = Integer.parseInt(input3);
                frame.dispose();
                new show(num,num2,num3);
            }
        });
        button[1].setText(" Guide ");
        button[1].setBounds(60,210,110,40);
        button[1].setBackground(Color.MAGENTA);
        button[2].setText(" Exit ");
        button[2].setBounds(220,210,110,40);
        button[2].setBackground(Color.MAGENTA);
        button[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                System.exit(0);
            }
        });

        for(int i=0;i<3;i++){
            panel.add(button[i]);
        }
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);
        panel.setBounds(40,40,400,400);

        frame.add(panel);
        frame.setBounds(400,160,500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
//    void help(){
//        JLabel l , l1 , l2 , l3 , l4;
//        l = new JLabel("The following two conditions must be met in the game : ");
//        l1 = new JLabel("\n\n The condition of two-by-two squares not being of the same color");
//        l2 = new JLabel("\n Continuity condition of white squares and black jams");
//        l3 = new JLabel("\n With every right click, if it is white or black, it will change to gray, and if it is black, it will not change");
//        l4 = new JLabel("\n With each left click, the gray color changes to white, and with a double left click, it changes to white, and with a double click, it changes to black")
//
//    }
}

