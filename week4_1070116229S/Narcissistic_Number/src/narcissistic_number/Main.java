/*
 * Main.java
 *
 * Created on 2018年3月6日, 下午6:41
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package narcissistic_number;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str_user_number;
        int user_number;
        str_user_number = JOptionPane.showInputDialog("请输入数字：");
        user_number = Integer.parseInt(str_user_number);
        String narcissistic_number = "\n";
        for(int i=100;i<=user_number;i++)
        {
            int number_1 = i % 10;
            int a = i / 10;
            int number_10 = a % 10;
            int b = a / 10;
            int number_100 = b;
            int sum = number_1 * number_1 * number_1 + number_10 * number_10 * number_10 + number_100 * number_100 * number_100;
            int j = 0;
            if(sum == i)
            {
                j++;
                narcissistic_number = narcissistic_number + String.valueOf(i) + ",    ";
                if (j % 5 == 0)
                {
                    narcissistic_number = narcissistic_number + "\n";
                }
            }    
        }
        JOptionPane.showMessageDialog(null, "narcissistic_number is " + narcissistic_number, "result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
}
