/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author lvzhaozhou
 */

public class Lesson {
	String lessonTitle;
	int durationMinutes;
	boolean requiresLab;
	
	public Lesson(String lessonTitle,int durationMinutes,boolean requiresLab) {
		this.durationMinutes=durationMinutes;
		this.lessonTitle=lessonTitle;
		this.requiresLab=requiresLab;
	}
	
	public void outputLessonDetails() {
		System.out.println(lessonTitle+"\n"+durationMinutes+" min"+"\n"+"RequiresLab: "+requiresLab);
		System.out.println();
	}
}



