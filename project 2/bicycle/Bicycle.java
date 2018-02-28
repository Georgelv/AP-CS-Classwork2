/*
@author George Lyu
APCS
Mr.Daniel
This program displays a checkpoint for bicycle.
 */
package bicycle;

/**
 *
 * @author lvzhaozhou
 */
public class Bicycle {

    private int numofWheels;
    private double massofBicycle;   
    private boolean wheelGas;
            
    
    public Bicycle(){}
    
   
    public Bicycle(int wheels, double mass){
     numofWheels = wheels;
     massofBicycle = mass;
    
}
    public String checkpoint(int wheels, double mass){
        if (wheels==2||wheels==3){
        }
        return "Go to next Checkpoint!";
        
        
    }
    public String flatTire(){
        if (wheelGas==true){
            System.out.println("go");
            
        }
        return "Congratulations!";
    } 
    
    public static void main (String [] args){
        Bicycle w =new Bicycle(2,10);
        Bicycle f =new Bicycle();
        

           System.out.println(w.checkpoint(2,10));
           System.out.println(f.flatTire());

            }

}
