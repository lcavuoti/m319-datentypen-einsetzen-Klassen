package ch.bbw;

import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {

        // initialize from keyboard
        Scanner keyboard = new Scanner(System.in);
        String name;

        // read String from keyboard
        System.out.println("Gib deinen namen ein: ");
        name = keyboard.nextLine();
        System.out.print("Name: ");
        System.out.println(name);

        // read number from keyboard
        System.out.println("Gib eine Zahl ein: ");
        int number1 = keyboard.nextInt();
        System.out.print("Nummer: ");
        System.out.println(number1);
        // read number from keyboard
        System.out.println("Gib eine zweite Zahl ein: ");
        int number2 = keyboard.nextInt();
        System.out.print("Nummer: ");
        System.out.println(number2);

        // Summieren
        int resultat = number1 + number2;

        // combined output
        System.out.println( String.format("Name ist %s und die Zahl1: %d, Zahl2: %d, Resultat = %d",
                name, number1, number2, resultat) );
        // %s = String also Text
        // %d = decimal oder integer
        // %f = float, double oder Kommazahlen

        // or in two lines
        String output = String.format("Name ist %s und die Zahl ist %d", name, number1);
        System.out.println(output);

        keyboard.close();
    }

}
