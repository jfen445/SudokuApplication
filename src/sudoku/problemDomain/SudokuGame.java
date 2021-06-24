package sudoku.problemDomain;

import java.io.Serializable;
import java.lang.management.GarbageCollectorMXBean;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState; // the sudoku board

    public static final GRID_BOUNDARY = 9; // state the max size for the grid

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtiliities.copyToNewArray(gridState);
    }
}
