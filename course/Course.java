/*
George Lyu
APCS
S3C7
Mr.Daniel
This is a program aiming for creating a course introduction.
 */
package course;

/**
 *
 * @author lvzhaozhou
 */
public class Course {
	String courseTitle;
	int maxStudent;
	int numberOfLessons;
	 Lesson[] courseLesson = new Lesson[50];
	Assessment courseAssessment;
	
	public Course(String courseTitle, int maxStudent, int numberOfLessons) {
		this.courseTitle=courseTitle;
		this.maxStudent=maxStudent;
		this.numberOfLessons=numberOfLessons;
	}
	
	public void addLesson(String lessonTitle,int durationMinutes,boolean requiresLab) {
		for(int i=0;i<courseLesson.length;i++) {
			if(courseLesson[i]==null) {
				courseLesson[i]= new Lesson(lessonTitle,durationMinutes,requiresLab);
				break;
			}
		}
		
		
	}
	
	public void addAssessment(String assessmentTitle,int maxMarks) {
		courseAssessment=new Assessment(assessmentTitle,maxMarks);
	}
	
	public void outputCourseDetails() {
		System.out.print("Course: ");
		System.out.println(courseTitle+"\n"+"Max Students: "+maxStudent);
		System.out.println();
		this.courseAssessment.outputAssessmentDetails();
		for(int i=0;i<this.courseLesson.length;i++) {
			if(this.courseLesson[i]!=null) {
			System.out.println("Lesson "+(i+1));
			this.courseLesson[i].outputLessonDetails();
			}
	}
	}
	
	public static void main(String[] args) {
		Course a = new Course("Computer",20,12);		
		a.addAssessment("Project1", 100);	
		a.addLesson("Inheritance", 40, false);
		a.addLesson("Abstract", 40, true);

		a.outputCourseDetails();
		
		
	}
}
