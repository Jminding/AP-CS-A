//import java.util.*;
//
//public class TicTacToeAI extends TicTacToe {
//    public static String[][] board1 = {{"_", "_", "_"},
//                                       {"_", "_", "_"},
//                                       {"_", "_", "_"}};
//    public static String[][] board = {{"_", "_", "_"},
//                                      {"_", "_", "_"},
//                                      {" ", " ", " "}};
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int mark = 0;
//        System.out.println("Welcome to Tic Tac Toe!  Surely you know how to play.  Right?");
//        int x = 0;
//        int y = 0;
//        while (true) {
//            System.out.printf("It is Player %s's turn!%n", mark % 2 == 0 ? 1 : 2);
//            if (mark % 2 != 0) {
//                System.out.print("Enter the X Coordinate of where you want to place your piece: ");
//                x = in.nextInt() - 1;
//                System.out.print("Enter the Y Coordinate of where you want to place your piece: ");
//                y = in.nextInt() - 1;
//            } else {
//                miniMax(0, false);
//            }
//            System.out.printf("(%s, %s)%n", x, y);
//            try {
//                if (board[x][y].equals("_") || board[x][y].equals(" ")) {
//                    board[x][y] = mark % 2 != 0 ? "X" : "O";
//                    mark++;
//                    printBoard();
////                    board1 = board;
//                } else {
//                    System.out.println("Spot already taken!");
//                }
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Bruh that's not even on the board what are you doing");
//            }
//            if (checkOver()) {
//                System.out.printf("Player %s has won!!%n", mark % 2 == 0 ? 1 : 2);
//                break;
//            } else if (checkTie()) {
//                System.out.println("It is... a tie!");
//                break;
//            }
//        }
//    }
//    public static void printBoard() {
//        for (int i = 0; i < 3; i++) System.out.println(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
//    }
//    public static boolean checkOver() {
//        for (int i = 0; i < 3; i++) {
//            if (!board1[i][0].equals("_") && !board1[i][0].equals(" "))
//                if (board1[i][0].equals(board1[i][1]) && board1[i][1].equals(board1[i][2]))
//                    return true;
//            if (!board1[0][i].equals("_") && !board1[0][i].equals(" "))
//                if (!board1[0][i].equals(board1[1][i]) && board1[1][i].equals(board1[2][i]))
//                    return true;
//        }
//        if (!board1[0][0].equals("_") && !board1[0][0].equals(" "))
//            if (board1[0][0].equals(board1[1][1]) && board1[1][1].equals(board1[2][2]))
//                return true;
//        if (!board1[0][2].equals("_") && !board1[0][2].equals(" "))
//            if (board1[0][2].equals(board1[1][1]) && board1[1][1].equals(board1[2][0]))
//                return true;
//        return false;
//    }
//    public static boolean checkTie() {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (board1[i][j].equals("_") || board1[i][j].equals(" ")) return false;
//            }
//        }
//        return true;
//    }
//    public static int[] getBestMove() {
//        int bestVal = -1000;
//        int[] bestMove = {-1, -1};
//
//        // Traverse all cells, evaluate minimax function
//        // for all empty cells. And return the cell
//        // with optimal value.
//        for (int i = 0; i < 3; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                // Check if cell is empty
//                if (board[i][j] == "_")
//                {
//                    // Make the move
//                    board[i][j] = player;
//
//                    // compute evaluation function for this
//                    // move.
//                    int moveVal = minimax(board, 0, false);
//
//                    // Undo the move
//                    board[i][j] = "_";
//
//                    // If the value of the current move is
//                    // more than the best value, then update
//                    // best/
//                    if (moveVal > bestVal)
//                    {
//                        bestMove.row = i;
//                        bestMove.col = j;
//                        bestVal = moveVal;
//                    }
//                }
//            }
//        }
//        return bestMove;
//    }
//    public static int miniMax(int depth, boolean isMax) {
//        int score = evaluateBoard();
//
//        // If Maximizer has won the game
//        // return his/her evaluated score
//        if (score == 10)
//            return score;
//
//        // If Minimizer has won the game
//        // return his/her evaluated score
//        if (score == -10)
//            return score;
//
//        // If there are no more moves and
//        // no winner then it is a tie
//        if (!isMovesLeft())
//            return 0;
//
//        // If this maximizer's move
//        if (isMax)
//        {
//            int best = -1000;
//
//            // Traverse all cells
//            for (int i = 0; i < 3; i++)
//            {
//                for (int j = 0; j < 3; j++)
//                {
//                    // Check if cell is empty
//                    if (board[i][j].equals("_") || board[i][j].equals(" ")) {
//                        // Make the move
//                        board[i][j] = "X";
//
//                        // Call minimax recursively and choose
//                        // the maximum value
//                        best = Math.max(best, miniMax(depth + 1, !isMax));
//
//                        // Undo the move
//                        board[i][j] = "_";
//                    }
//                }
//            }
//            return best;
//        }
//
//        // If this minimizer's move
//        else
//        {
//            int best = 1000;
//
//            // Traverse all cells
//            for (int i = 0; i < 3; i++)
//            {
//                for (int j = 0; j < 3; j++)
//                {
//                    // Check if cell is empty
//                    if (board[i][j].equals("_")) {
//                        // Make the move
//                        board[i][j] = "O";
//
//                        // Call minimax recursively and choose
//                        // the minimum value
//                        best = Math.min(best, miniMax(depth + 1, !isMax));
//
//                        // Undo the move
//                        board[i][j] = "_";
//                    }
//                }
//            }
//            return best;
//        }
//    }
//    public static int evaluateBoard() {
//        for (int row = 0; row < 3; row++) {
//            if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2])) {
//                if (board[row][0].equals("X"))
//                    return +10;
//                else if (board[row][0].equals("O"))
//                    return -10;
//            }
//        }
//
//        // Checking for Columns for X or O victory.
//        for (int col = 0; col < 3; col++) {
//            if (board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col])) {
//                if (board[0][col].equals("X"))
//                    return +10;
//
//                else if (board[0][col].equals("O"))
//                    return -10;
//            }
//        }
//
//        // Checking for Diagonals for X or O victory.
//        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
//            if (board[0][0].equals("X"))
//                return +10;
//            else if (board[0][0].equals("O"))
//                return -10;
//        }
//
//        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
//            if (board[0][2].equals("X"))
//                return +10;
//            else if (board[0][2].equals("O"))
//                return -10;
//        }
//
//        // Else if none of them have won then return 0
//        return 0;
//    }
//    public static Boolean isMovesLeft() {
//        for (int i = 0; i < 3; i++)
//            for (int j = 0; j < 3; j++)
//                if (board[i][j].equals(" ") || board[i][j].equals("_"))
//                    return true;
//        return false;
//    }
//}