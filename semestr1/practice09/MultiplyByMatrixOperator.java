package semestr1.practice09;

public class MultiplyByMatrixOperator extends AbstractMatrixOperator {
    private final EncapsulatedMatrix rightMatrix;

    public MultiplyByMatrixOperator(EncapsulatedMatrix rightMatrix) {
        super("Multiply(A x B)");
        if (rightMatrix == null) {
            throw new IllegalArgumentException("Матриця B не може бути null");
        }
        this.rightMatrix = rightMatrix;
    }
    @Override
    public boolean isApplicable(EncapsulatedMatrix input) {
        return input.getCols() == rightMatrix.getRows();
    }

    @Override
    public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
        int m = input.getRows();
        int n = input.getCols();
        int p = rightMatrix.getCols();
        double[][] c = new double[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += input.getElement(i, k) * rightMatrix.getElement(k, j);
                }
                c[i][j] = sum;

            }
        }
        return new EncapsulatedMatrix(c);
    }
}
