/*
 * Main.java
 *
 * Created on 2018年1月9日, 下午7:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package test1;
import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);
        double number1,number2;
        double sum,product;
        /* print为静态方法，直接通过类进行调用 */
        System.out.print("输入第一个数：\n"); 
        /* nextDouble为动态方法，需要先实例化一个import对象，再通过对象来进行调用该方法 */
        number1 = input.nextDouble();
        System.out.print("输入第二个数：\n");
        number2 = input.nextDouble();
        sum = number1 + number2;
        product = number1 * number2;
        System.out.printf("和为%.2f,积为%.2f\n",sum,product);
    }
    
}
