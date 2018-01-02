/*
George Lyu
AP Computer Science 
S3C7
Mr. Daniel
This program sets up a game called Rock Paper Scissor. 
*/
 
package georgelyuholidayapplication;

/**
 *
 * @author lvzhaozhou
 */
import java. util.Scanner;
public class GeorgeLyuHolidayApplication {
 
    public static void main(String[] args) {
      Scanner console = new Scanner (System.in);
      String choice = console.nextLine();
        if (isValid(choice)) {
             
      
        int aiChoice = (int)(Math.random()*3);
        int personChoice = getVal(choice);
        System.out.println("you picked "+ choice);
        System.out.println("The computer picked "+ getAiChoice(aiChoice));
        System.out.println("You" + didPersonWin(personChoice, aiChoice));
    }
    else{
    System.out.println("please input a valid number, thx bro!");
}
    }
    public static String getAiChoice(int x){
        if (x==0) {
            return "Rock";
            
        }
        if (x == 1){
            return "Paper";
                    }
        if (x == 2){
            return "scissor";
        }
        return "IDK";
    }
    
    public static String didPersonWin(int pChoice, int computerChoice){
              if (pChoice == 0){
              if (computerChoice != 1){
                  if (computerChoice != 0){
                      return "Win";
                      
                  }
              return "tie";        
          }
          return "loose";
          
      }
      if (pChoice == 1){
              if (computerChoice != 0){
                  if (computerChoice != 1){
                      return "Win";
                      
                  }
              return "tie";        
          }
          return "loose";
          
      }
      if (pChoice == 2){
              if (computerChoice != 0){
                  if (computerChoice != 2){
                      return "Win";
                      
                  }
              return "tie";        
          }
          return "loose";
          
      }
      return "IDK";
    }
      public static boolean isValid(String string){
          if (string.equalsIgnoreCase("Rock")){
           return true;
        }
          if (string.equalsIgnoreCase("Paper")){
              return true;
         }
      if (string.equalsIgnoreCase("Scissor")){
      return true;
      }
      return false;
      
      
    }
     
      public static int getVal (String string){
          
      if (string.equalsIgnoreCase("Rock")){
          return 0;
      }
      if (string.equalsIgnoreCase("Paper")){
          return 1;
          
      }
      else {
          return 2;
      }
      
      }}
    

