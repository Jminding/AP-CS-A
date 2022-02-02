import java.util.*;

public class TicTacToe {
    public static String[][] board = {{"_", "_", "_"},
                                      {"_", "_", "_"},
                                      {" ", " ", " "}};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = 0;
        System.out.println("Welcome to Tic Tac Toe!  Surely you know how to play.  Right?");
        while (true) {
            System.out.printf("It is Player %s's turn!%n", mark % 2 == 0 ? 1 : 2);
            System.out.print("Enter the X Coordinate of where you want to place your piece: ");
            int x = in.nextInt() - 1;
            System.out.print("Enter the Y Coordinate of where you want to place your piece: ");
            int y = in.nextInt() - 1;
            try {
                if (board[x][y].equals("_") || board[x][y].equals(" ")) {
                    board[x][y] = mark % 2 == 0 ? "O" : "X";
                    mark++;
                    printBoard();
                } else {
                    System.out.println("Spot already taken!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bruh that's not even on the board what are you doing");
            }
            if (checkOver()) {
                System.out.printf("Player %s has won!!%n", mark % 2 == 0 ? 1 : 2);
                break;
            } else if (checkTie()) {
                System.out.println("It is... a tie!");
                break;
            }
        }
    }
    public static void printBoard() {
        for (int i = 0; i < 3; i++) System.out.println(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
    }
    public static boolean checkOver() {
        for (int i = 0; i < 3; i++) {
            if (!board[i][0].equals("_") && !board[i][0].equals(" "))
                if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]))
                    return true;
            if (!board[0][i].equals("_") && !board[0][i].equals(" "))
                if (!board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
                    return true;
        }
        if (!board[0][0].equals("_") && !board[0][0].equals(" "))
            if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
                return true;
        if (!board[0][2].equals("_") && !board[0][2].equals(" "))
            if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
                return true;
        return false;
    }
    public static boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("_") || board[i][j].equals(" ")) return false;
            }
        }
        return true;
    }

}