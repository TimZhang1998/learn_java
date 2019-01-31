/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracttest;

import javax.swing.*;
/**
 *
 * @author Dell
 */
public class AbstractTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point point=new Point(7,11);
        Circle circle=new Circle(22,8,3.5);
        String out=point.getName() + ":"+point.toString() + "\n"+circle.getName() +
                ":" + circle.toString() + "\n";
        Shape[] array=new Shape[2];
        array[0]=point;array[1]=circle;
        for (Shape array1 : array) {
            out += "\n\n" + array1.getName() + ":" + array1.toString() + 
                    "\nArea= " + String.format("%.2f", array1.getArea());
        }
        JOptionPane.showMessageDialog(null, out,"结果",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        }
    
}
    

