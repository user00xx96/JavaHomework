package semestr1.practice09;

public class EncapsulatedMatrix {
    private final int rows;
    private final int cols;
    private final double[][] grid;

    public EncapsulatedMatrix(double[][] source) {
        if (source == null || source.length == 0 || source[0] == null || source[0].length == 0) {
            throw new IllegalArgumentException("Матриця не може бути порожньою");
        }
        rows = source.length;
        cols = source[0].length;
        grid = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            if (source[i] == null || source[i].length != cols) {
                throw new IllegalArgumentException("Усі рядки мають бути однакової довжини");
            }
            for (int j = 0; j < cols; j++) {
                grid[i][j] = source[i][j];
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public double[][] getGridCopy() {
        double[][] copy = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = grid[i][j];
            }
        }
        return copy;
    }

    public double getElement(int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols) {
            throw new IndexOutOfBoundsException("Неправильний індекс: " + r + ", " + c);
        }
        return grid[r][c];
    }

    public boolean isSquare() {
        return rows == cols;
    }

    public double getTrace() {
        if (!isSquare()) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += grid[i][i];
        }
        return sum;
    }

    public double getFrobeniusNorm() {
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += grid[i][j] * grid[i][j];
            }
        }
        return Math.sqrt(sum);
    }

    public double getDeterminant() {
        if (!isSquare()) {
            return 0;
        }
        if (rows == 1) {
            return grid[0][0];
        }
        if (rows == 2) {
            return grid[0][0] * grid[1][1] - grid[0][1] * grid[1][0];
        }
        if (rows == 3) {
            double a = grid[0][0] * grid[1][1] * grid[2][2]
                    + grid[0][1] * grid[1][2] * grid[2][0]
                    + grid[0][2] * grid[1][0] * grid[2][1];
            double b = grid[0][2] * grid[1][1] * grid[2][0]
                    + grid[0][0] * grid[1][2] * grid[2][1]
                    + grid[0][1] * grid[1][0] * grid[2][2];
            return a - b;
        }
        return 0;
    }

    private static double round2(double value) {
        return Math.round(value * 100) / 100.0;
    }

    @Override
    public String toString() {
        String result = "Матриця (" + rows + " x" + cols + " | Норма Фробеніуса: " + round2(getFrobeniusNorm());
        if (isSquare()) {
            result += " | Слід: " + round2(getTrace());
            if (rows <= 3) {
                result += " | det: " + round2(getDeterminant());
            }
        }
        result += "):\n";
        for (int i = 0; i < rows; i++) {
            result += "  [";
            for (int j = 0; j < cols; j++) {
                result += "\t" + round2(grid[i][j]);
            }
            result += "\t]\n";
        }
        return result;
    }
}
