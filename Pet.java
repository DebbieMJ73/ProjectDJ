
public class Pet {
    //private data fields
    private String name;
    private int age;
    private String type;



    //public Constructors
    public Pet(){
        this.name = "Pet name";
        this.age = 1;
        this.type = "Animal";
    }
    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;

    }

    //public set or mutator for every private data field (except when the data field is read-only)
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setType(String newType){
        this.type = newType;
    }


    //public get or accessor method for every private data field(except if it is a secret)
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getType(){
        return this.type;
    }

    //public method and if statement to allow the pet to speak
    public String speak() {
        String sound = "";

        if (this.type.equalsIgnoreCase("Dog")) {
            sound = " Bow-wow";
        }
        else if (this.type.equalsIgnoreCase("Cat")) {
            sound = "Meow";
        }
        else {
            sound = "Boo";
        }
        return sound;
    }

    //public toString method that prints out all of the objects state
    public String toString() {


         String output = "Pet information: \n";
         output += "Pet name: " + this.getName() + "\n";
         output += "Pet age: " + this.getAge() + "\n";
         output += "Pet type: " + this.getType() + "\n";
         output +=  "Pet sound: " + this.speak() + "\n";
        return output;
    }

}

