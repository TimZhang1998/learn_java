/*
 * Main.java
 *
 * Created on 2018��1��16��, ����7:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package joptionpaneio;
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
       String Radius;
       String Perimeter;
       String Area;
       double radius;
       double perimeter;
       double area;
       Radius = JOptionPane.showInputDialog("����뾶 ");
       radius = Double.parseDouble(Radius);
       perimeter = 2 * Math.PI * radius;
       area = Math.PI * Math.pow(radius, 2);
       Radius = String.format("%.2f��",radius);
       Perimeter =  String.format("%.2f��",perimeter);
       Area = String.format("%.2f��",area);
       JOptionPane.showMessageDialog(null, "�뾶�� " + Radius + "\n�ܳ��� " + Perimeter + "\n����� " + Area, "���", JOptionPane.PLAIN_MESSAGE);
       System.exit(0);
    }
    
}
