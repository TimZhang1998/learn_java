/*
 * Main.java
 *
 * Created on 2018��1��9��, ����7:43
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
        /* printΪ��̬������ֱ��ͨ������е��� */
        System.out.print("�����һ������\n"); 
        /* nextDoubleΪ��̬��������Ҫ��ʵ����һ��import������ͨ�����������е��ø÷��� */
        number1 = input.nextDouble();
        System.out.print("����ڶ�������\n");
        number2 = input.nextDouble();
        sum = number1 + number2;
        product = number1 * number2;
        System.out.printf("��Ϊ%.2f,��Ϊ%.2f\n",sum,product);
    }
    
}
