/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrase;

/**
 *
 * @author lvzhaozhou
 */
public class Phrase {
    
    private String currentPhrase;
    public Phrase(String p){
         currentPhrase = p;
}
     public int findNthOccurrence(String str, int n){
         
     }
    public void replaceNthOccurrence(String str, int n, String repl){
       int index = findNthOccurence(String str, int n);
       if(index != 1){
          currentPhrase = currentPhrase.substring(0, index)+repl+currentPhrase.substring(index,str.length());
       }
        
    }
    
    public int findLastOccurrence(String str){
   int n = 1;
  while (findNthOccurrence(str, n+1) != -1)
  { n++;
  }
  return findNthOccurrence(str, n); }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
