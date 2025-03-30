//Exam class that extends Assessment class to calculate exam grades
public class Exam extends Assessment{
    private int questions;
    private int numMissed;
    private int pointsEach;


    //Constructor for Exam
    public Exam(int questions, int missed){
        this.questions = questions;
        this.numMissed = missed;
        this.pointsEach = 100/questions;

        //Calculates the exam grade
        int successfulAnswers = questions - missed;
        int grade = successfulAnswers * pointsEach;
        setScore(grade);

    }

    //Method to return the number of points each question is worth
    public int getPointsEach(){
        return this.pointsEach;
    }

    //Method to return the number of questions missed
    public int getNumMissed(){
        return this.numMissed;
    }


}
