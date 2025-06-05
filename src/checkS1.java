import javax.swing.*;
import java.awt.*;

public class checkS1 {
    public boolean check(JButton[][] buttons , int a ,int b) {
        int blackCount;
        int whiteCount;

        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < b - 1; j++) {
                blackCount = 0;
                whiteCount = 0;
                for (int m = i; m < i + 2; m++) {
                    for (int n = j; n < j + 2; n++) {
                        if (buttons[m][n].getBackground() == Color.WHITE)
                            whiteCount++;
                        if (buttons[m][n].getBackground() == Color.BLACK)
                            blackCount++;
                    }
                }
                if(blackCount == 4 || whiteCount == 4)
                    //System.out.println("melo");
                    return false;
            }
        }
        //System.out.println("jalo");
        return true;
    }
}
