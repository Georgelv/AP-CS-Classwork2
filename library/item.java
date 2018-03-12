/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author lvzhaozhou
 */
public class item {
    
    private int Date;
    private String nameofAuthor;
    private int num;
    private String title;
    public boolean loan;
    private Date date;
    private String author;
    private boolean requested;
        private boolean onLoan;
        public Date dueDate;

    
    public item(String title, String author, int num, boolean loan, Date date,boolean requested) {
               this.title=title;
		this.author=author;
		this.num=num;
		this.loan=loan;
		this.date=date;
        
  }
    public void printDetails(){
        System.out.println("title:"+title+"\n"+"author:"+nameofAuthor+"reference number"+num);
        if(loan){
            System.out.println("This book can be loan");
        }
        else{
                    System.out.println("Nope this book will not be loan");

    }}
         private static Date addDays (Date date, int days){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);

        return cal.getTime();
    }
    
    public void Borrowing(Borrowerid a){
        boolean onLoan = true;
        Date today = new Date();
        Date dueDate = addDays(today, 14);
        
    }
 public void returning(){
     this.onLoan = false;
 }
        
        
    }

    
    

