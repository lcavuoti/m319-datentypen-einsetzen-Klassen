package ch.bbw;

import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {

        // Example sum
        Scanner keyboard = new Scanner(System.in);

        // read number from keyboard
        System.out.println("Please enter a number with type double:");
        double number1 = keyboard.nextDouble();

        // read another number from keyboard
        System.out.println("Please enter another number:");
        double number2 = keyboard.nextDouble();

        // output
        System.out.println("Number 1 is: " + number1);
        System.out.println("Number 2 is: " + number2);
        System.out.println(
            String.format("The sum of both numbers (%f+%f) is %f",
                number1, number2, number1+number2));

        // formatted output (numbers)
        System.out.println(
                String.format("The sum of both numbers (%.1f+%.1f) is %.1f",
                        number1, number2, number1+number2));

        // more on String.format with doubles
        //https://mkyong.com/java/how-to-format-a-double-in-java/

        keyboard.close();
    }
}
