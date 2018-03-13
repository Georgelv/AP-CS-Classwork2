/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author lvzhaozhou
 */
public class Circle extends Shape {

    private double radius;
    private double b;
    public Circle(double circleRadius, String circleName) {
        
        
        super(circleName);
        radius = circleRadius;
    }

    @Override
    public double getParameter() {
       return 2 * Math.PI * radius;
    }

 
    public double getArea() {
return Math.PI * radius * radius; 
    }
    public boolean equals(Circle obj){
        
        return (this.radius == obj.b);
    }

   
}
