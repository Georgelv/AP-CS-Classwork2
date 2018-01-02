/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package georgelyuholidayapplication;

/**
 *
 * @author lvzhaozhou
 */
public class RockPaperScissor {
    
    
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
    
}
