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
    private String CourseTitle;
    private int MaxStudents;
    private int  NumberOfLessons;
   // Lesson[]CourseLesson = new Lesson[50];
    Lesson[] CourseLesson = new Lesson[50];
    Assessment CourseAssessment;
    
    
   
    
    public Course(String CourseNumber, int MaxStudents,int NumberOfLessons){
        this.CourseTitle=CourseTitle;
        this.MaxStudents=MaxStudents;
        this.NumberOfLessons=NumberOfLessons;
    } 
    
    public void addlesson(String LessonTitle, int DurationMinutes,boolean requireslab){
        for(int i=0;i < CourseLesson.length;i++){
            if (CourseLesson[i]!=null){
                CourseLesson[i] =new Lesson(LessonTitle, DurationMinutes, requireslab);
            }
            break;
        }
       
        
    }
    public void addassessment(String AssessmentTitle, int MaxMarks){
        Assessment d = new Assessment(AssessmentTitle, MaxMarks);
        
    }
    public void OutputCouseDetails(){
        
        System.out.println("CourseTitle"+ CourseTitle);
        System.out.println("MaxStudents"+MaxStudents);
        System.out.println("NumOfLessons"+NumberOfLessons);
        
        
    }
   public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
