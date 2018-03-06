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
public class item {
    
    private int Date;
    private String nameofAuthor;
    private int num;
    private String title;
    private boolean loan;
    private Date date;
    private String author;
    private boolean requested;
    
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

    }
        
        
    }
}
    
    

