/*
 * Main.java
 *
 * Created on 2018��1��23��, ����6:40
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
        strHeight = JOptionPane.showInputDialog("���������(��λΪ��) ");
        strWeight = JOptionPane.showInputDialog("����������(��λΪǧ��) ");
        dHeight = Double.parseDouble(strHeight);
        dWeight = Double.parseDouble(strWeight);
        dBMI = dWeight / Math.pow(dHeight,2);
        JOptionPane.showMessageDialog(null, "���������    " + String.format("%.2f;",dHeight) + "\n����������    " + String.format("%.2f;",dWeight) + "\n����BIM��      " + String.format("%.2f;",dBMI), "������", JOptionPane.PLAIN_MESSAGE);
        if(dBMI <= 18.5)
        {
            JOptionPane.showMessageDialog(null, "������Ĺ��ᣬ��ע���Է�������Ŷ��", "�������뽨��", JOptionPane.PLAIN_MESSAGE);
        }
        else if(18.5< dBMI && dBMI <= 23.9)
        {
            JOptionPane.showMessageDialog(null, "���������������������֣�����Ŷ��", "�������뽨��", JOptionPane.PLAIN_MESSAGE);
        }
        else if(23.9 < dBMI && dBMI <= 27)
        {
            JOptionPane.showMessageDialog(null, "������Ĺ��أ���ע���ʵ����ʣ�����Ŷ��", "�������뽨��", JOptionPane.PLAIN_MESSAGE);
        }
        else if(27 < dBMI && dBMI <= 32)
        {
            JOptionPane.showMessageDialog(null, "������ķ��֣���ע���ʵ����ʣ�����Ŷ��", "�������뽨��", JOptionPane.PLAIN_MESSAGE);
        } 
        else if(32 < dBMI)
        {
            JOptionPane.showMessageDialog(null, "������ķǳ����֣���ע���ʵ����ʣ�����Ŷ��", "�������뽨��", JOptionPane.PLAIN_MESSAGE);
        }    
        System.exit(0);
    }   
}
