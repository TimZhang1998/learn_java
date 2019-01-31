/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Azure
 */
public class Stack {

   private int c=5;
   private int[] a=new int[c];
   private int top=-1;

    
   public void push(int e)
   {
    if(isFull()) {
        c*=2;
        int[] b=new int[c];
        for(int i=0;i<a.length;i++)
            b[i]=a[i];
        a=b;}
    top++;
    a[top]=e;
   }
   
   public void pop()
   {if(isEmpty()) return;
        top--;
   }
   
   public boolean isEmpty()
   { return top==-1;
   }
   
    public boolean isFull()
   { return top==c-1;
   }
   
    public void display()
    {if(isEmpty()) System.out.println("the stack is empty");
    else System.out.println("the element(s) in stack are/is ");
    for(int i=top;i>=0;i--) System.out.println(a[i]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stack=new Stack();
        stack.push(23);
        stack.push(67);
        stack.pop();
        stack.push(58);
        stack.push(29);
        stack.push(61);
        stack.display();
    }
    
}
