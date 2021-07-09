package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length - 1; i++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                 }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];

        }
        return rsl;
    }

   /* public static boolean isWin(char[][] board) {
        boolean result = false;
        int size = 5;
        for (int i = 0; i < size; i++) {
            if (board[0][0] || board[0][size - 1] != 'X'))  {
                result = true;
                break;
            }
        }
        return result;
    }*/
}