package katas;

public class Board {

    private boolean[][] cells = new boolean[3][3];

    public void setLiveCell(int i, int j) {
        cells[i][j] = true;

    }

    public boolean isLiveCell(int i, int j) {
        if (i < 0 || j < 0) {
            return false;
        }
        return laCelulaEstaViva(i, j);
    }

    public int obtenerNumerDeVecinosVivos(int x, int y) {
        int vecinosVivos = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (noEsLaCelulaQueSeCerifica(x, y, i, j) && esUnaCelulaViva(i, j)) {
                    vecinosVivos++;
                }
            }
        }
        return vecinosVivos;
    }

    private boolean noEsLaCelulaQueSeCerifica(int x, int y, int i, int j) {
        boolean xNoEsIgual = i != x;
        boolean yNoEsgual = j != y;
        return xNoEsIgual && yNoEsgual;
    }

    private boolean esUnaCelulaViva(int x, int y) {
        return esUnaCoordenadaValida(x, y) && laCelulaEstaViva(x, y);
    }

    private boolean laCelulaEstaViva(int x, int y) {
        return cells[x][y];
    }

    private boolean esUnaCoordenadaValida(int x, int y) {
        return x >= 0 && x < 3 && y >= 0 && y < 3;
    }

    public void setDeadCell(int x, int y) {
        cells[x][y] = false;

    }
}
