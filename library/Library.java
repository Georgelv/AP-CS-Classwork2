/*
 * George Lyu
   S3C7 APCS
   Mr.Daniel
   This program aims for organizing library.
 */
package library;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 */
    
    public class Library{

    public static void main(String[] args) {
        
        
        		ArrayList BookList=new ArrayList();

        item b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
                BookList.add(b);

        item cd = new CD("And Justice for all", "Metallica", 567, false, new Date(), false, "Metal");
        cd.printDetails();
                BookList.add(cd);

                Borrowerid a = new Borrowerid("George","Lyu",1);

        
        System.out.println("1. See the book list."+"\n"+"2. Check the borrower information.");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        while(selection!=3) {
        		if(selection==1) {
        
        		for(int i=0;i<BookList.size();i++) {
        			System.out.println(i+1+". ");
        			((item) BookList.get(i)).printDetails();
        		}
        		System.out.println("1. Borrowing 2. Returning" +"\n"+"3. Exit.");
        		selection = input.nextInt();
        		if(selection==1) {
        			System.out.println("Which book do you want to borrow?");
        			int choice3 = input.nextInt();
        			if(((item) BookList.get(choice3-1)).loan==false) {
        				((item) BookList.get(choice3-1)).Borrowing(a);
        				System.out.println("You've successfully borrowed that book.");
        				System.out.println("Due Date: "+((item) BookList.get(choice3-1)).dueDate.toString());
        				System.out.println();
        			}
        			else {
        				System.out.println("The book has been loaned and teh due day is "+((item) BookList.get(choice3-1)).dueDate.toString());
        				System.out.println();
        			}
        		}
        		System.out.println("1. See the book list."+"\n"+"2. Check the borrower information." +"\n"+"3. Exit.");
        		selection = input.nextInt();
        }
        else if(selection==2){
        		a.getBorrowerName();
        		a.getBorrowerID();
        		a.getEmailAddress();
        		a.printDetails();
        		System.out.println();
        		System.out.println("1. See the book list."+"\n"+"2. Check the borrower information." +"\n"+"3. Exit.");
        		selection = input.nextInt();
        
}}}}
    
