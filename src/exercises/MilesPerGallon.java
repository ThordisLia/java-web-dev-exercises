package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main( String[] args) {
        double miles;
        double consumedGas;
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed?");
        consumedGas = input.nextDouble();
        System.out.println("You miles-per-gallon are " + miles / consumedGas);
    }
}
