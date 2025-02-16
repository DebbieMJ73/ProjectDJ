public class Runner {
    public static void main(String[] arg) {


        //Instantiate an object to our Tests class using constructor
        Tests myScores = new Tests();
        System.out.println(myScores.toString());

        //Call getAverage method
        myScores.getAverage();
        System.out.println(myScores);
        System.out.println(myScores.getAve());



    }
}
