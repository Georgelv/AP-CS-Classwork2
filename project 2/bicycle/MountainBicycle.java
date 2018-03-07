/*
 * @author George Lyu
APCS
Mr.Daniel
This program displays a checkpoint for bicycle and MountainBicycle.
 */
package bicycle;

/**
 *
 * @author lvzhaozhou
 */
public class MountainBicycle extends Bicycle{
    
    private int numofShifts;
    private boolean bigTyre;
            
    
    public MountainBicycle(int numofShifts, boolean bigTyre) {
        
        super();
        
     
            if(numofShifts>=5){
                System.out.println("This is a good MountainBicycle");
            }
            else{
            System.out.println("Sorry, this is not a MountainBicycle");
        }
        }
        
    }
    
    
    

