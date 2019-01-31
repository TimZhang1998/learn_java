/*
 * Main.java
 *
 * Created on 2018年1月23日, 下午6:40
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package bmiindex;
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
        String strHeight;
        String strWeight;
        double dHeight;
        double dWeight;
        double dBMI;
        strHeight = JOptionPane.showInputDialog("请输入身高(单位为米) ");
        strWeight = JOptionPane.showInputDialog("请输入体重(单位为千克) ");
        dHeight = Double.parseDouble(strHeight);
        dWeight = Double.parseDouble(strWeight);
        dBMI = dWeight / Math.pow(dHeight,2);
        JOptionPane.showMessageDialog(null, "您的身高是    " + String.format("%.2f;",dHeight) + "\n您的体重是    " + String.format("%.2f;",dWeight) + "\n您的BIM是      " + String.format("%.2f;",dBMI), "计算结果", JOptionPane.PLAIN_MESSAGE);
        if(dBMI <= 18.5)
        {
            JOptionPane.showMessageDialog(null, "您的身材过轻，请注意多吃饭，加油哦！", "评测结果与建议", JOptionPane.PLAIN_MESSAGE);
        }
        else if(18.5< dBMI && dBMI <= 23.9)
        {
            JOptionPane.showMessageDialog(null, "您的身材正常，请继续保持，加油哦！", "评测结果与建议", JOptionPane.PLAIN_MESSAGE);
        }
        else if(23.9 < dBMI && dBMI <= 27)
        {
            JOptionPane.showMessageDialog(null, "您的身材过重，请注意适当减肥，加油哦！", "评测结果与建议", JOptionPane.PLAIN_MESSAGE);
        }
        else if(27 < dBMI && dBMI <= 32)
        {
            JOptionPane.showMessageDialog(null, "您的身材肥胖，请注意适当减肥，加油哦！", "评测结果与建议", JOptionPane.PLAIN_MESSAGE);
        } 
        else if(32 < dBMI)
        {
            JOptionPane.showMessageDialog(null, "您的身材非常肥胖，请注意适当减肥，加油哦！", "评测结果与建议", JOptionPane.PLAIN_MESSAGE);
        }    
        System.exit(0);
    }   
}
