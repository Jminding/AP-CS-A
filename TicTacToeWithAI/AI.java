package TicTacToeWithAI;

public class AI {
    public final Mark mark;
    public Board board;
    public char opponent;

    public AI(Mark x, Board b) {
        mark = x;
        board = b;
        opponent = mark.mark == 'X' ? 'O' : 'X';
    }

    /**
     * Analyzes the board to see whether there are any moves left
     * @param board: board to analyze
     * @return boolean: whether there are any moves left or not
     */
    public static Boolean hasMovesLeft(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '_') return true; // If there are any of "_" left then there is still room for a move
        return false;
    }

    /**
     * Get the best move, then make the move
     * @return board: the new board after the move is made
     */
    public Board makeMove() {
        int[] bestMove = bestMove(board.board);
        board.move(bestMove[0], bestMove[1], mark);
        System.out.printf("The AI has decided to put its mark on (%s, %s).%n", bestMove[0] + 1, bestMove[1] + 1);
        board.printBoard();
        return board;
    }

    /**
     * Finds the best move and returns its coordinates
     * @param board: the board to analyze
     * @return best: a pair of coordinates
     */
    public int[] bestMove(char[][] board) {
        int val = -1000;
        int[] best = {-1, -1};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    board[i][j] = mark.mark;
                    int moveVal = miniMax(board, 0, false);
                    board[i][j] = '_';
                    if (moveVal > val) {
                        best[0] = i;
                        best[1] = j;
                        val = moveVal;
                    }
                }
            }
        }
        return best;
    }

    /**
     * Finds the "score" of the board
     * @param board: the board to evaluate
     * @return score: the board's score
     */
    public int evaluate(char[][] board) {
        for (int row = 0; row < 3; row++) { // Check rows
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                if (board[row][0] == mark.mark) return 10;
                else if (board[row][0] == opponent) return -10;
            }
        }

        for (int col = 0; col < 3; col++) { // Check columns
            if (board[0][col] == board[1][col] &&
                    board[1][col] == board[2][col]) {
                if (board[0][col] == mark.mark) return 10;
                else if (board[0][col] == opponent) return -10;
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) { // Check diagonals: top left to bottom right
            if (board[0][0] == mark.mark) return 10;
            else if (board[0][0] == opponent) return -10;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) { // Check diagonals: top right to bottom left
            if (board[0][2] == mark.mark) return 10;
            else if (board[0][2] == opponent) return -10;
        }

        return 0; // No one has won
    }

    /**
     * Minimax is a game-theory algorithm for evaluating the best move based on a score or set of scores for the game board.
     * An AI using this algorithm will recursively loop through the board and check all the possible outcomes.
     * It assigns each move a score according to the outcomes that could happen as a result of making the move.
     * The move with the highest score is selected.
     * @param board: the board to perform minimax on
     * @param depth: the current recursion depth
     * @param max:   if it's at the max recursion depth
     * @return best: max or min value, according to whose turn it is
     */
    int miniMax(char[][] board, int depth, Boolean max) {
        int score = evaluate(board);
        if (score == 10) return score; // You (AI) won
        if (score == -10) return score; // Opponent won
        if (!hasMovesLeft(board)) return 0; // Tie
        if (max) { // Trying to maximize yourself
            int best = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        board[i][j] = mark.mark;
                        best = Math.max(best, miniMax(board, depth + 1, !max));
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        } else { // Trying to minimize your opponent
            int best = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        board[i][j] = opponent;
                        best = Math.min(best, miniMax(board, depth + 1, !max));
                        board[i][j] = '_';
                    }
                }
            }
            return best;
        }
    }
}

class Mark {
    public final char mark; // The actual mark, a char that is either 'X' or 'O'

    public Mark(char x) {
        mark = x;
    }
}
