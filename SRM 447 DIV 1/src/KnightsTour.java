import javafx.geometry.Pos;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class KnightsTour {
    public static int[] movX = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
    public static int[] movY = new int[]{1, 2, 2, 1, -1, -2, -2, -1};

    public int visitedPositions(String[] board) {
        char[][] b = new char[8][8];
        Position current = null;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                b[i][j] = board[i].charAt(j);
                if (b[i][j] == 'K') {
                    current = new Position(i, j);
                    b[i][j] = '*';
                }
            }
        }
        int counter = 0;
        while (current != null) {
            b[current.row][current.col] = '*';
            current = moveOn(current, b);
            counter++;
        }
        return counter;
    }

    private Position moveOn(Position current, char[][] board) {
        ArrayList<Position> possiblePositions = new ArrayList<>();
        for (int i = 0; i < movX.length; i++) {
            Position position = new Position(current.row + movX[i], current.col + movY[i]);
            if (position.isCorrect()) {
                if (board[position.row][position.col] == '.') {
                    position.setAccessibility(board);
                    possiblePositions.add(position);
                }
            }
        }

        Collections.sort(possiblePositions, new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                if (o1.accessebility == o2.accessebility) {
                    if (o1.row == o2.row) {
                        return o1.col - o2.col;
                    } else {
                        return o1.row - o2.row;
                    }
                } else {
                    return o1.accessebility - o2.accessebility;
                }
            }
        });

        if (possiblePositions.size() > 0) {
            return possiblePositions.get(0);
        } else {
            return null;
        }
    }

}


class Position {
    int row;
    int col;
    int accessebility = 0;

    Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isCorrect() {
        return row >= 0 && row <= 7 && col >= 0 && col <= 7;
    }

    public void setAccessibility(char[][] board) {
        for (int i = 0; i < KnightsTour.movX.length; i++) {
            Position position = new Position(this.row + KnightsTour.movX[i], this.col + KnightsTour.movY[i]);
            if (position.isCorrect()) {
                if (board[position.row][position.col] == '.') {
                    accessebility++;
                }
            }
        }
    }
}