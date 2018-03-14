/*
 George Lyu
APCS S3C7
Mr. Daniel
This is a shape abstract class which employs equals and compare method. 
 */
package shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lvzhaozhou
 */
public abstract class Shape {
private String name;
    public Shape(String shapeName){
     name = shapeName;
    }
    public abstract double getParameter();
        
    public abstract double getArea();
        

    public static void main(String[] args) {
        Shape a = new Circle(4,"hh");
        Shape obj = new Circle(3,"j");
         
        
        System.out.println(a.getParameter());
        System.out.println(a.getArea());
        System.out.println(a.equals(obj));
        
              
        List b=new ArrayList();
        b.add(new Circle(4,"One"));
        b.add(new Circle(2,"Two"));
        b.add(new Circle(1,"Three"));
        Collections.sort(b);
        System.out.println(b);

    }
    
}
