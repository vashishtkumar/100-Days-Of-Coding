public class NQueens {
    import java.util.*;

    // Leet code 51
class NQueens {

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> res = new ArrayList<>();
        solve(0, board, res, n);
        return res;
    }

    static void solve(int col, char[][] board, List<List<String>> res, int n) {
        if (col == n) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(col + 1, board, res, n);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    static boolean isSafe(int row, int col, char[][] board, int n) {
        // Check the left side of the current row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // Check the upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the lower diagonal on the left side
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 4;
        List<List<String>> queenArrangements = solveNQueens(N);
        int i = 1;
        for (List<String> arrangement : queenArrangements) {
            System.out.println("Arrangement " + i);
            for (String row : arrangement) {
                System.out.println(row);
            }
            System.out.println();
            i++;
        }
    }
}

}
