/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylindertest;

/**
 *
 * @author Dell
 */
public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
    }
    
    public Cylinder(int x,int y,double r,double h){
        super(x,y,r);
        setHeight(h);
    }
    
    public void setHeight(double h){
        height=(h<0.0?0.0:h);
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getArea(){
        return 2*super.getArea()+getC()*getHeight();
    }
    
    public double getV(){
        return super.getArea()*getHeight();
    }
    
    public String toString(){
        return super.toString()+"; Height = "+getHeight();
    }
}
