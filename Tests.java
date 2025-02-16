//Debbie Johnson
import java.util.Scanner;



public class Tests {
    private double ave;
    private int count;
    private int score;


    //public Constructors
    public Tests() {
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;


    }

    // public set and get methods for every private data field
    public double getAve() {
        return this.ave;
    }

    public int getCount() {
        return this.count;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    //public toString method that prints out all the objects state
    public String toString() {

        String output = "Result: \n";
        output += ("The average of the " + this.getCount() + " scores " + " entered is " + this.getAve());

        return output;


    }

    public void getAverage() {
        //Get user input for test scores
        Scanner scan = new Scanner(System.in);

        //Prompt user to enter test scores
        System.out.println("Please enter test scores (type -1 to quit): ");

        //Read test scores
        this.score = scan.nextInt();

        int  sum = 0;

        //while loop to accept score until -1 is entered
        while (this.score >= 1) {

            int sum1 = sum;
            sum1 += this.score;
            int i = this.count;
            i++;


            System.out.println("Please enter test scores (type -1 to quit): ");
            this.score = scan.nextInt();


            //Calculate average
            this.ave = (double) sum1 / i;

        }


    }

}