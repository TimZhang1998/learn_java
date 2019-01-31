/*
 * DataSort.java
 *
 * Created on 2018年3月13日, 下午6:40
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package datasort;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DataSort {
    
    /** Creates a new instance of DataSort */
    public DataSort() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a =new int[5];
        inputData(a);
        outputData("Before sort:",a);
        sortData(a);
    }
    
    private static void inputData(int[] a)
    {
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Pls input number "+(i+1));
            a[i]=keyboard.nextInt();
        }
    }
    
    private static void outputData(String info,int[] a)
    {
        System.out.println(info);
        for(int d:a)
        {
            System.out.print(d+" ");
        }
        System.out.println();
    }
    //selection sort
    private static void sortData(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int maxInd=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[maxInd])maxInd=j;
            }
            if(maxInd!=i){
                int t=a[i];
                a[i]=a[maxInd];
                a[maxInd]=t;
            }
            outputData("Round "+(i+1),a);
        }
    }
    
}
