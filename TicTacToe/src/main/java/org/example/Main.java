package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.exit(0);

        Scanner scanner = new Scanner(System.in); // Taking in player input

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Choose a mode:");
        System.out.println("1. Singleplayer");
        System.out.println("2. Multiplayer");


        int choice = scanner.nextInt();
        if (choice == 1) {
            // Create a game board
            GameBoard gameBoard = new GameBoard(3, 3);
            while (true) {
                Scanner scanner1 = new Scanner(System.in); // Taking in player input
                Scanner scanner2 = new Scanner(System.in); // Taking in player input

                gameBoard.displayBoard(); // call and display gameBoard
                System.out.println("Player one, where would you like your placement? Type in (X, Y) coordinates: 0, 0");
                String input = scanner1.nextLine(); // Assign the empty string to the player input
                if (input.equals("quit")) {
                    break;
                }

                String[] parts = input.split(","); // Split the string based on comma
                int x = Integer.parseInt(parts[0].trim()); // Parse the parts into integers
                int y = Integer.parseInt(parts[1].trim()); // .trim() remove whitespace
                gameBoard.addMove(x, y);

                gameBoard.displayBoard(); // call and display gameBoard
                System.out.println("Player two, where would you like your placement? Type in (X, Y) coordinates: 0, 0");
                String input2 = scanner2.nextLine(); // Assign the empty string to the player input
                String[] parts2 = input2.split(","); // Split the string based on comma
                int a = Integer.parseInt(parts2[0].trim()); // Parse the parts into integers
                int b = Integer.parseInt(parts2[1].trim()); // .trim() remove whitespace

                gameBoard.addMove2(a, b);
            }
        }
    }

}