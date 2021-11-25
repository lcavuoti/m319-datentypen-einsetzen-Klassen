package ch.bbw;

import java.util.Scanner;

public class SumMultipleInteger {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        int number = 0;
        int count = 0;

        // read ahead
        System.out.println("Please enter a number:");
        number = keyboard.nextInt();

        while (number != 0) {


            sum += number;
//            count += number != 0 ? 1 : 0;

            if (number != 0) {
                count += 1;
            }

            System.out.println("Please enter a number:");
            number = keyboard.nextInt();
        }

        do {
            System.out.println("Please enter a number:");
            number = keyboard.nextInt();

            sum += number;

            count += number != 0 ? 1 : 0; // conditional

            if (number != 0) {
//                count += 1;
                count = count + 1;
//                count++;
            }

        } while(number != 0) ;

        System.out.println(
            String.format("The sum of all numbers (%d) is %d", count, sum));
        System.out.println(
            String.format("The average of all numbers is %.2f: ", (double)sum / (double)count));

        keyboard.close();
    }
}
