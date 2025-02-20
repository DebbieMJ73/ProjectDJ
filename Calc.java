public class Calc
{
    private double num1;
    private double num2;

    //public Constructor
    public Calc(){
        this.num1 = 0;
        this.num2 = 0;

    }

    //public set or mutator for every private data field (except when the data field is read-only)
    public void setNum1(double newNum1){
        this.num1 = newNum1;
    }

    public void setNum2(double newNum2){
        this.num2 = newNum2;
    }

    //public get or accessor method for every private data field(except if it is a secret)

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    //Calculator application methods
    //Method to add
    public double add(){
        return num1 + num2;
    }

    //Method to subtract
    public double subtract(){
        return num1 - num2;
    }

    //Method to multiply
    public double multiply(){
        return num1 * num2;
    }

    //Method to divide
    public double divide(){
        return num1/num2;
    }


    //public toString method that prints out all the objects state
    public String toString(){

        String output = "Displaying private data fields using toString(): \n";
        output += "Num 1: " + this.getNum1() + "\n";
        output += "Num 2: " + this.getNum2() + "\n";
        output += "Calling num1 get method: " + this.getNum1() + "\n";
        output += "Calling num2 get method: " + this.getNum2() + "\n";
        output += "The sum is: " + add() + "\n";
        output += "The difference is: " + this.subtract() + "\n";
        output += "The product is: " +this. multiply() + "\n";
        output += "The quotient is: " + String.format("%.2f",this.divide());

        return output;

    }
}
