import java.util.Scanner;
public class InchesConverter {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args) {
        // Variables declaration
        double inchMeasurement, ftMeasurement, cmMeasurement;
        Scanner keyboard = new Scanner(System.in);

        // Get the inches measurement input
        System.out.print("ENTER MEASUREMENT IN INCHES   :   ");
        inchMeasurement = keyboard.nextDouble();

        keyboard.close();

        // Computation and output for inches to feet
        ftMeasurement = inchMeasurement/12.00;
        System.out.printf("EQUIVALENT IN FEET            :   %.3f", ftMeasurement);
        System.out.println("");

        // Computer and ouput for inches to centimeters
        cmMeasurement = inchMeasurement * 2.54;
        System.out.printf("EQUIVALENT IN CENTIMETER      :   %.3f", cmMeasurement);
    }
}