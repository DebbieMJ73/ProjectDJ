public class Pet {
    //private data fields
    private String name;

    //public Constructors
    public Pet() {
        this.setName("");
    }

    //public set or mutator for every private data field (except when the data field is read-only)
    public void setName(String newName){
        this.name = newName;
    }

    //public get or accessor method for every private data field(except if it is a secret)
    public String getName(){
        return this.name;

    }
    //public toString method that prints out all of the objects state
    public String toString(){
        String output = "Pet name: ";
        output += this.getName();
        return output;
    }

    //main
    public static void main(String[] args){
        //instantiate Pet
        Pet myPet1 = new Pet();
        myPet1.setName("Marco");
        Pet myPet2 = new Pet();
        myPet2.setName("Sandy");
        System.out.println("Pet information: \n" +  myPet2);
        System.out.println("Pet information: \n" + "Name: " + myPet1.getName() );
    }
}

