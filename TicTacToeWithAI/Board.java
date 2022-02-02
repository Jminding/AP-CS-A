package TicTacToeWithAI;

public class Board {
    public char[][] board = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};

    /**
     * Makes a move
     * @param row:  row in which to put the mark
     * @param col:  column in which to put the mark
     * @param mark: the mark to use
     */
    public void move(int row, int col, Mark mark) {
        board[row][col] = mark.mark;
    }

    /**
     * Print the board
     */
    public void printBoard() {
        System.out.println("  1 2 3"); // Columns
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " "); // Rows
            System.out.println(board[i][0] + "|" + board[i][1] + "|" + board[i][2]);
        }
    }
}
