package Homework5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args)
    {
        int n = 8;        
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        SolutionsFind(board, 0);
        System.out.printf("All solutions %s.\n", counter);
    }

    public static int counter = 0;

    public static boolean isFit(char[][] board, int row, int col)
    {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    
    public static void SolutionShow(char[][] board)
    {
        System.out.println("   A B C D E F G H ");
        int row = 0;
        for (char[] chars: board) {
            System.out.printf("%d %s\n", row, Arrays.toString(chars).replaceAll(",", ""));
            row++;
        }
        System.out.println();
    }

    
    public static void SolutionsFind(char[][] board, int row)
    {
        
        if (row == board.length) {
            SolutionShow(board);
            counter++;
            return;
        }
        for (int i = 0; i < board.length; i++)
        {
            
            if (isFit(board, row, i)) {
                board[row][i] = 'Q';
                SolutionsFind(board, row + 1);
                board[row][i] = '.';
            }
        }
    }
}
