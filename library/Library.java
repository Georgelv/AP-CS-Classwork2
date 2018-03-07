/*
 * George Lyu
 S3C7
 APCS
 This program aims for organizing library.
 */
package library;

import java.util.Date;

/**
 *
 */
    
    public class Library{

    public static void main(String[] args) {
        item b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        item cd = new CD("And Justice for all", "Metallica", 567, false, new Date(), false, "Metal");
        cd.printDetails();
        
}}
    
