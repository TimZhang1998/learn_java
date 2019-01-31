/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylindertest;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class CylinderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder test=new Cylinder(21,32,4.2,6.8);
        String out="X坐标为："+test.getX()+"\nY坐标为："+test.getY()+"\n半径为："+test.getR()+"\n高为："+test.getHeight();
        test.setX(30);test.setY(25);
        test.setR(5.2);test.setHeight(8.3);
        out+="\n\n圆柱体新的位置，半径，高度为\n"+test.toString();
        out+="\n\n底面圆直径为："+String.format("%.2f", test.getD())+"\n底面圆周长为："+String.format("%.2f", test.getC());
        out+="\n圆柱表面积为："+String.format("%.2f", test.getArea())+"\n圆柱体积为："+String.format("%.2f", test.getV());
                
        JOptionPane.showMessageDialog(null, out,"结果",JOptionPane.PLAIN_MESSAGE);
    }
    
}
