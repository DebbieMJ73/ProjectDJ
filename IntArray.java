import java.util.Arrays;
import java.util.Random;

public class IntArray{
    private int[] myArray; //Empty array to hold the data
    private int length; //The size of the array

    //Constructor
    public IntArray(int i){
       this.myArray = new int[i];
    }

    //Method to clear the array.
    public void clear(){
        this.myArray = new int[0];
    }
    //Method to fill the array with random numbers 1 and 6
    public void fillRand(){
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
           myArray[i] = rand.nextInt(6) + 1; // Random number between 1 and 6
        }

    }

    //Method to get value of an element
    public int get(int element) {
        return this.myArray[element];

    }

    //Method to check if the array is empty
    public boolean isEmpty(){
        //for (int i : myArray){
        if (this.myArray.length != 0)
        {
            return false;
        }
        else {
            return true;
        }

    }

    //Method to set the value of an element
    public void set(int element, int newValue){
        this.myArray[element] = newValue;

    }

    //Method to get the size of the array
    public int size(){
        return myArray.length;
    }

    //Method to sort the array
    public void sort(){
        Arrays.sort(this.myArray);
    }

    //toString to display the array
    public String toString(){

       return  "IntArray instance data: \n Elements: " + Arrays.toString(this.myArray) ;



    }
}
