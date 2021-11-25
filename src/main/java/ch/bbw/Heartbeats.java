package ch.bbw;

import java.util.Scanner;

/**
 * calculates the heartbeats of your life
 *
 */
public class Heartbeats {
    // Attribute
    private int heartbeatsPerMinutes;
    private double heartBeatsTotal;
    private final double minutesPerYear = 60 * 24 * 365.25 ;
    private int age;

    // Constructors
    public Heartbeats() {
        this.heartbeatsPerMinutes = 0;
        this.age = 0;
    }

    public Heartbeats(int heartbeatsPerMinutes, int age) {
        this.heartbeatsPerMinutes = heartbeatsPerMinutes;
        this.age = age;
    }
    // get- setter

    public void readIn() {
        // Eingabe - Scanner definieren
        Scanner keyboard = new Scanner(System.in);
        // Eingabe BPM
        System.out.println("Please enter the number of heartbeats per minute (bpm) :");
        heartbeatsPerMinutes = keyboard.nextInt();
        // Eingabe years
        System.out.println("Please enter an age in years:");
        age = keyboard.nextInt();
        // schliessen
        keyboard.close();

    }

    public void calculate() {
        heartBeatsTotal =  minutesPerYear * age * heartbeatsPerMinutes;
    }


    public String toString() {
        String ausgabe ="";
        ausgabe += (" Heartbeats per minutes: " + heartbeatsPerMinutes);
        ausgabe += (" Age: " + age);
        ausgabe += (" Heartbeats over all years: ");
        ausgabe += (String.format("%.0f", (double)minutesPerYear * (double)age * heartbeatsPerMinutes));
        ausgabe += (minutesPerYear);

        return ausgabe;
    }

    public static void main(String[] args) {
        // Objekt Heartbeats intanzieren
        Heartbeats bpt = new Heartbeats();
        // einlesen
        bpt.readIn();
        // berechnen
        bpt.calculate();
        // Ausgabe
        System.out.println(bpt.toString());
    }
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Please enter the number of heartbeats per minute:");
//        int heartbeatsPerMinutes = keyboard.nextInt();
//
//        System.out.println("Please enter an age in years:");
//        int age = keyboard.nextInt();
//
//        double minutesPerYear = 60 * 24 * 365.25;
//
//        System.out.println("Heartbeats per minutes: " + heartbeatsPerMinutes);
//        System.out.println("Age: " + age);
//        System.out.print("Heartbeats over all years: ");
//        System.out.println(String.format("%.0f", (double)minutesPerYear * (double)age * heartbeatsPerMinutes));
//        System.out.println(minutesPerYear);
//
//        keyboard.close();
//    }
}
