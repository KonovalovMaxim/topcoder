import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BombSweeper {

    public double winPercentage(String[] board) {
        int bombsCount = 0;
        int safePlacesCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                if (isFree(board, i, j)) {
                    safePlacesCount++;
                }
                if (board[i].charAt(j) == 'B') {
                    bombsCount++;
                }
            }
        }
        return safePlacesCount /((double)bombsCount + (double) safePlacesCount) * 100;
    }

    public boolean isFree(String[] board, int x, int y) {
        int[] xcoords = new int[]{x - 1, x, x + 1};
        int[] ycoords = new int[]{y - 1, y, y + 1};
        for (int currentX : xcoords) {
            for (int currentY : ycoords) {
                boolean exists = currentX >= 0 && currentY >= 0 && currentX < board.length && currentY < board[currentX].length();
                if (currentX >= 0 && currentY >= 0 && currentX < board.length && currentY < board[currentX].length()) {
                    if (board[currentX].charAt(currentY) == 'B') {
						return false;
					}
                }
            }
        }
        return true;
    }
}
