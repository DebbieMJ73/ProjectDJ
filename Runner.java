import java.util.Scanner;

public class Runner {
    //main
    public static void main(String[] args) {

        //Instantiate Pet
        Pet myPet1 = new Pet();
        Pet myPet2 = new Pet();
        myPet2.setName("Sandy");
        myPet2.setAge(15);
        myPet2.setType("Dog");

        //Print pet information
        System.out.println( myPet1);
        System.out.println(myPet2 );

        //Get user input for  third pet with scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter pet's name:  ");
        String name = scan.nextLine();

        System.out.println("Enter pet's age from 1 to 100: ");
        int age = scan.nextInt();

        System.out.println("Enter pet's type (cat, dog, bird, etc.): ");
        String type = scan.next();


        //Create third pet
        Pet myPet3 = new Pet(name, age, type);
        System.out.println(myPet3);

        //Close the scanner
        scan.close();

    }
}
