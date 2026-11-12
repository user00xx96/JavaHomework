package semestr1.practice10;


public final class ImmutableMatrix2D {
    private final int rows;
    private final int cols;
    private final double[][] data;
    public ImmutableMatrix2D(double[][] source) {
        rows = source.length;
        cols = source[0].length;
        data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = source[i][j];
            }
        }
    }

    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }
    public double get(int r, int c) {
        return data[r][c];
    }

    public double[][] getDataCopy() {
        double[][] copy = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = data[i][j];
            }
        }
        return copy;
    }

    public double getTrace() {
        double sum = 0;
        for (int i = 0; i < rows && i < cols; i++) {
            sum = sum + data[i][i];
        }
        return sum;
    }

    public double getFrobeniusNorm() {
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + data[i][j] * data[i][j];
            }
        }
        return Math.sqrt(sum);
    }

    public double getDeterminant() {
        if (rows == 2 && cols == 2) {
            return data[0][0] * data[1][1] - data[0][1] * data[1][0];
        }
        if (rows == 3 && cols == 3) {
            return data[0][0] * data[1][1] * data[2][2]
                    + data[0][1] * data[1][2] * data[2][0]
                    + data[0][2] * data[1][0] * data[2][1]
                    - data[0][2] * data[1][1] * data[2][0]
                    - data[0][0] * data[1][2] * data[2][1]
                    - data[0][1] * data[1][0] * data[2][2];
        }
        System.out.println("Визначник рахується тільки для матриць 2x2 та 3x3");
        return 0;
    }

    public double maxAbsDifference(ImmutableMatrix2D other) {
        double max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double diff = Math.abs(data[i][j] - other.data[i][j]);
                if (diff > max) {
                    max = diff;
                }
            }
        }
        return max;
    }
}