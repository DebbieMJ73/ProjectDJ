import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class Lab8 {
    public static void main(String[] args) {
        //Read and write the data from input file pay.csv
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        DecimalFormat df = new DecimalFormat("$#,##0.00");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile)))
        {
            String line;

            reader.readLine();
            //Write headers to output file
            writer.write("EmpID, Pay Rate, Hours worked, Weekly Pay");
            writer.newLine();

            //Process each line from the input file
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");// Split data by commas


                String empId = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);

                // Calculate weekly pay including overtime
                double weeklyPay;
                if (hoursWorked > 40) {
                    double overtime = hoursWorked - 40;
                    weeklyPay = (40 * payRate) + (overtime * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }
                // Format weekly pay
                String formattedPay = df.format(weeklyPay);

                //Output line
                String outputLine = empId + "," + payRate + "," + hoursWorked + "," + formattedPay;
                writer.write(outputLine);
                writer.newLine();


            }


            System.out.println("CSV file processed and written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());


        }
    }



}
