package ArraysOfObjects;

import java.util.Scanner;

public class ArraysOfObjects {
    public static void main(String[] args) {
        Player[] players = new Player[4]; // Initialize an array of players
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Input the player's name and number, on two separate lines.");
            String name = in.next(); // Input the name
            int num = in.nextInt(); // Input the jersey number
            players[i] = new Player(name, num); // Set player in the current position of the array of players to be a new player with the name and jersey number
        }
        boolean is10 = false;
        for (int i = 0; i < 4; i++) {
            System.out.println(players[i].toString());
            if (players[i].getJerseyNumber() == 10) {
                is10 = true; // Want to make sure that we know whether there is a 10 or not
                System.out.println(String.format("%s is the player with tne jersey number 10!", players[i].getName()));
            }
        }
        if (!is10)
            System.out.println("No player had the jersey number 10."); // If there's not a 10, then print this out
    }
}