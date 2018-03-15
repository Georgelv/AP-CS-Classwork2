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

public class Assessment {
	String assessmentTitle;
	int maxMarks;
	
	public Assessment(String assessmentTitle,int maxMarks) {
		this.assessmentTitle=assessmentTitle;
		this.maxMarks=maxMarks;
	}
	
	public void outputAssessmentDetails() {
		System.out.println("Assessment: ");
		System.out.println(assessmentTitle+"\n"+"Max Marks: "+maxMarks);
		System.out.println();
	}
}

