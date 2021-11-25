package ch.bbw;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {

        // Example sum
        Scanner keyboard = new Scanner(System.in);

        // read number from keyboard
        System.out.println("Please enter a number:");
        int number1 = keyboard.nextInt();

        // read another number from keyboard
        System.out.println("Please enter another number:");
        int number2 = keyboard.nextInt();

        // output
        System.out.println("Number 1 is: " + number1);
        System.out.println("Number 2 is: " + number2);
        int result = number1 + number2;
        System.out.println(
            String.format("The sum of both numbers (%d+%d) is %d",
                number1, number2, result));

        keyboard.close();
    }
}
