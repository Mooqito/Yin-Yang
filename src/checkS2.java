import javax.swing.*;
import java.awt.*;

public class checkS2 {
    int count = 0;
    public boolean check2(JButton[][] buttons , int a , int b){
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0){
                    count++;
                } else if (buttons[i-1][j].getBackground() != Color.BLACK ) {
                    count++;
                }
                if(i==5){
                    count++;
                } else if (buttons[i+1][j].getBackground() != Color.BLACK) {
                    count++;
                }
                if(j==0){
                    count++;
                } else if (buttons[i][j-1].getBackground() != Color.BLACK ) {
                    count++;
                }
                if(j==5){
                    count++;
                } else if (buttons[i][j+1].getBackground() != Color.BLACK) {
                    count++;
                }
                if(count == 4)
                    return false;
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0){
                    count++;
                } else if (buttons[i-1][j].getBackground() != Color.WHITE ) {
                    count++;
                }
                if(i==5){
                    count++;
                } else if (buttons[i+1][j].getBackground() != Color.WHITE) {
                    count++;
                }
                if(j==0){
                    count++;
                } else if (buttons[i][j-1].getBackground() != Color.WHITE ) {
                    count++;
                }
                if(j==5){
                    count++;
                } else if (buttons[i][j+1].getBackground() != Color.WHITE) {
                    count++;
                }
                if(count == 4)
                    return false;
            }
        }
        return true;
    }
}
