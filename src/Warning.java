//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Warning {
//    JFrame frame = new JFrame("Warning");
//    JPanel panel = new JPanel();
//    JLabel  label2 = new JLabel();
//    JLabel  label1 = new JLabel();
//    JLabel  label = new JLabel();
//    JButton b1 = new JButton("Play again");
//    public void warn(JButton[][] buttons , int a ,int b){
//
//        frame.getContentPane().setBackground(Color.RED);
//
//        label1.setText(" WARNING ");
//        label1.setBounds(105,15,500,70);
//        label1.setFont(new Font("Arial",Font.PLAIN,35));
//        label1.setForeground(Color.RED);
//        panel.add(label1);
//        label2.setText(" The condition of the tables not having the same color has been violated ");
//        label2.setBounds(10,60,500,70);
//        label2.setFont(new Font("Arial",Font.PLAIN,15));
//        label2.setForeground(Color.RED);
//        panel.add(label2);
//
//        label.setText(" please try again ");
//        label.setBounds(105,100,500,70);
//        label.setFont(new Font("Arial",Font.PLAIN,25));
//        label.setForeground(Color.RED);
//        panel.add(label);
//
//        panel.setBackground(Color.BLUE);
//        panel.setLayout(null);
//        panel.setBounds(40,40,400,400);
//
//        frame.add(panel);
//        frame.setBounds(400,160,500,500);
//        frame.setLayout(null);
//        frame.setVisible(true);
//
//
//        panel.add(b1);
//        b1.setBounds(135,170,100,30);
//        b1.setBackground(Color.GREEN);
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.dispose();
//                show sh = new show(a,b);
//                sh.click(a,b);
//            }
//        });
//
//    }
//}
