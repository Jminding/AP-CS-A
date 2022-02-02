package TicTacToeWithAI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static Board board = new Board();

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe!  Surely you know how to play.  Right?"); // If you don't know how to play Tic Tac Toe, I will be surprised
        char mark = 'X';
        do {
            System.out.print("Input the mark you want to have (X or O; X goes first): ");
            mark = in.next().charAt(0); // Just convert the input to a char since it's a one character input and there's no Scanner.nextChar()
            if (mark != 'X' && mark != 'O') System.out.println("Please input an X or an O!");
        } while (mark != 'X' && mark != 'O');
        AI ai = new AI(new Mark(mark == 'X' ? 'O' : 'X'), board); // Create a new AI
        boolean counter = mark == 'X';
        while (true) {
            System.out.println();
            System.out.printf("It is %s's turn!%n", counter ? "Player 1" : "the AI");
            board.printBoard();
            System.out.println();
            if (counter) {
                System.out.print("Enter the X Coordinate of where you want to place your piece: ");
                int x = in.nextInt() - 1; // I swear if you put in a non-integer instead of an integer to break the game
                System.out.print("Enter the Y Coordinate of where you want to place your piece: ");
                int y = in.nextInt() - 1;
                try {
                    if (board.board[x][y] == '_') {
                        board.move(x, y, new Mark(mark));
                        System.out.printf("Player 1 has put a mark at (%s, %s).%n", x + 1, y + 1);
                        board.printBoard();
                        counter = !counter;
                    } else {
                        System.out.println("Spot already taken!");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Bruh that's not even on the board what are you doing");
                }
            } else {
                System.out.println("The AI is thinking...");
                Thread.sleep(1000);
                board = ai.makeMove();
                counter = !counter;
            }
            if (gameOver()) {
                System.out.println();
                System.out.printf("%s has won!!%n", counter ? "The AI" : "Player 1");
                break;
            } else if (checkTie()) {
                System.out.println();
                System.out.println("It is... a tie!");
                break;
            }
            Thread.sleep(1000);
        }
    }

    /**
     * Checks to see if the game is over
     * @return boolean: true if the game is over, false if it isn't
     */
    public static boolean gameOver() {
        for (int i = 0; i < 3; i++) { // Check rows and columns
            if (!(board.board[i][0] == '_'))
                if (board.board[i][0] == board.board[i][1] && board.board[i][1] == board.board[i][2]) return true;
            if (!(board.board[0][i] == '_'))
                if (board.board[0][i] == board.board[1][i] && board.board[1][i] == board.board[2][i]) return true;
        }
        // Check top left to bottom right diagonal
        if (!(board.board[0][0] == '_'))
            if (board.board[0][0] == board.board[1][1] && board.board[1][1] == board.board[2][2]) return true;
        // Check top right to bottom left diagonal
        if (!(board.board[0][2] == '_'))
            return board.board[0][2] == board.board[1][1] && board.board[1][1] == board.board[2][0];
        return false; // Otherwise no one has won yet, just return false
    }

    /**
     * Checks the game for a tie by checking for any remaining open spots
     * @return boolean: false if there are open spots, true if there aren't any, and it's now a tie
     */
    public static boolean checkTie() {
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) if (board.board[i][j] == '_') return false;
        return true;
    }
}
