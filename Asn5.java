import java.util. ArrayList;

public class Asn5 {

    public static void main(String[] args){

        ArrayList<String> nameTeam = new ArrayList<String>(); //List of names for softball team
        nameTeam.add("Danielle");
        nameTeam.add("Keyshia");
        nameTeam.add("Angela");
        nameTeam.add("Alexis");
        nameTeam.forEach( (n) -> { System.out.println(n); });


        ArrayList<Integer> numberJersey = new ArrayList<Integer>(); //Team members possible jersey numbers
        numberJersey.add(12);
        numberJersey.add(24);
        numberJersey.add(36);
        numberJersey.add(48);
        numberJersey.forEach( (i) -> { System.out.println(i); });

        //Method to remove objects from the lists
        nameTeam.remove(1);
        nameTeam.forEach( (n) -> {System.out.println(n); });
        numberJersey.remove(3);
        numberJersey.forEach( (i) -> { System.out.println(i); });

        //Method to check if an item exists in the lists
        System.out.println(nameTeam.contains("Keyshia"));
        System.out.println(numberJersey.contains(36));







    }

}
