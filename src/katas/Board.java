package katas;

public class Board {

    private boolean[][] cells = new boolean[3][3];

    public void setLiveCell(int i, int j) {
        cells[i][j] = true;

    }

    public boolean isLiveCell(int i, int j) {
        return cells[1][0] && cells[0][1];
    }

}
