/*
 * George Lyu S3C7
 APCS
 Mr.Daniel
 This is a program about library System.
 */
package library;

import java.util.Date;

/**
 * @author Daniel Gunn
 * Please implement the Book, LibraryItem and CD classes
 */
    
    public class Library{

    public static void main(String[] args) {
        Book b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        CD cd = new CD("And Justice for all", "Metallica", 567, false, new Date(), false, "Metal");
        cd.printDetails();
        
}}
    
