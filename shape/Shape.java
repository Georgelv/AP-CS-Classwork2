/*
 George Lyu
APCS S3C7
Mr. Daniel
This is a shape abstract class which employs equals method. 
 */
package shape;

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

    }
    
}
