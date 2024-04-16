package org.example;

public class GameBoard {

    private final char[][] grid; // 3d array grid
    private final int width;
    private final int height;

    // Player will place their move
    public void addMove(int row, int col) {
        char playerSymbol = 'O';
        grid[row][col] = playerSymbol;
    }

    // Player2 will place their move
    public void addMove2(int row, int col) {
        char playerSymbol = 'X';
        grid[row][col] = playerSymbol;
    }

    // Default Constructor
    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new char[height][width];
    }

    // Method for displaying gameBoard
    public void displayBoard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(grid[i][j] + " "); // Same line
            }
            System.out.println();
        }
    }

}
