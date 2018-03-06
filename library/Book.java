/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Date;

/**
 *
 * @author lvzhaozhou
 */


public class Book extends item{
    private boolean requested;
    
    public  Book(String title, String author, int num, boolean loan, Date date,boolean requested){
    
super(title, author, num, loan, date,requested);
        this.requested=requested;



}
    public void printDetails(){
        super.printDetails();
        if(requested) {
			System.out.println("Sorry, you have to wait!!");
		}
		else {
			System.out.println("It's your book bro!!");
		}
	}
}
    



