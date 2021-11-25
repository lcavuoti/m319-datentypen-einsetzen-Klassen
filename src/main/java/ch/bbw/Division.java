package ch.bbw;

import java.util.Scanner;

/**
 * ganzzahlige division
 */
public class Division {
    // Attribute
    private int dividend;
    private int divisor;
    private int result;
    private String output;

    // einlesen
    public void readIn() {
        // Example sum
        Scanner keyboard = new Scanner(System.in);

        // read number from keyboard
        System.out.println("Please enter the dividend:");
        dividend = keyboard.nextInt();

        // read another number from keyboard
        System.out.println("Please enter a divisor:");
        divisor = keyboard.nextInt();

        keyboard.close();

    }

    // rechnen
    public void calculate() {

        if (divisor !=0 ) {
            result = dividend / divisor;
        } else {
            System.out.println("Division with divisor 0 is not allowed");
        }

    }

    // Ausgabe
    public String toString() {

        return output += "The result of the division: "+dividend+ " " +divisor +"  =" + result;


    }

    public static void main(String[] args) {
        // erstellen eines Objekt
        Division division = new Division();
        // einlesen
        division.readIn();
        // calculate
        division.calculate();
        // ausgabe
        System.out.println( division.toString() );





//        // Example sum
//        Scanner keyboard = new Scanner(System.in);
//
//        // read number from keyboard
//        System.out.println("Please enter a number:");
//        int number1 = keyboard.nextInt();
//
//        // read another number from keyboard
//        System.out.println("Please enter a divisor:");
//        int divisor = keyboard.nextInt();
//
//        // output
//        System.out.println("Number 1 is: " + number1);
//        System.out.println("Divisor is: " + divisor);
//        if (divisor!=0) {
//            System.out.println(
//                    String.format("The result of the division (%d/%d) is %d",
//                            number1, divisor, number1 / divisor));
//        } else {
//            System.out.println("Division with divisor 0 is not allowed");
//        }
//
//        // output with inline if
//        System.out.println(
//                divisor==0
//                ? "Division with divisor 0 is not allowed"
//                : String.format("The result of the division (%d/%d) is %d",
//                        number1, divisor, number1 / divisor));
//
//        keyboard.close();
    }
}
