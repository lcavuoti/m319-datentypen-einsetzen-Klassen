package ch.bbw;

import java.util.Scanner;

/**
 * einfacher Rechner für die Grundoperationen
 */
public class Calculator {

    private double zahl1, zahl2, result;
    private String operation;
    private String output;



    public void sum() {

        result = zahl1 + zahl2;
    }

    public void subtrakt() {
        result = zahl1 - zahl2 ;
    }

    public void division() {
        if (zahl2!=0) {
            result = zahl1 / zahl2;
        } else {
            System.out.println("Division with divisor 0 is not allowed");
        }


    }

    public void readIn() {
        // Example sum
        Scanner keyboard = new Scanner(System.in);

        // read number from keyboard
        System.out.println("Please enter the first number:");
        zahl1 = keyboard.nextDouble();

        // read another number from keyboard
        System.out.println("Please enter a second Number:");
        zahl2 = keyboard.nextDouble();

        // read operation from keyboard
        System.out.println("Please operation (*/-+) :");
        operation = keyboard.next();

    }


    public void calculate() {

        if (operation.equals("+")) { result = zahl1 + zahl2 ;}
        else if (operation.equals("-")) { result = zahl1 - zahl2 ;}
        else if (operation.equals("*")) { result = zahl1 * zahl2 ;}
        else if (operation.equals("/")) {
            if (zahl2 != 0.0) {
                result = zahl1 / zahl2;
            }
        }
    }



    public String toString() {

        return output += "The result of the calculation: "+zahl1+ " "+operation+" " +zahl2 +"  = " + result;


    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.readIn();
        calc.calculate();
        System.out.println(calc.toString());

    }

}
