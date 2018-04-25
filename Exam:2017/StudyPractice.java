/*
George Lyu
Mr.Daniel
S3C7
This is a question of 2017 APCS Exam
 */
package studypractice;

/**
 *
 * @author lvzhaozhou
 */
public interface StudyPractice {
    
String getProblem();
void nextProblem();
}
public class MultPractice implements StudyPractice{
      private int first;
      private int second;
public MultPractice(int num1, int num2){
    first = num1;
    second = num2;
}
public String getProblem(){
    return first+ "Times" +second;
}
public void nextProblem(){
     second++;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
