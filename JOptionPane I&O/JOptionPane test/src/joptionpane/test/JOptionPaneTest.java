 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane.test;
import javax.swing.JOptionPane;
/**
 *
 * @author Azure
 */
public class JOptionPaneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstNumber;
        String secondNumber;
        int number1;
        int number2;
        int sub;
        firstNumber = JOptionPane.showInputDialog("输入第一个数 ");
        secondNumber = JOptionPane.showInputDialog("输入第二个数 ");
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        sub = number1 + number2;
        JOptionPane.showMessageDialog(null,"结果是 " + sub,"结果",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
}
