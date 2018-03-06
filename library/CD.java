/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author lvzhaozhou
 */
import java.util.Date;

public class CD extends item {
    
   private String quality;
    
    public CD(String title, String author, int num, boolean loan, Date date, boolean requested,String quality) {
        super(title, author, num, loan, date, requested);
        this.quality=quality;
        
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Music Quality: "+quality);
    }
    
    
}
