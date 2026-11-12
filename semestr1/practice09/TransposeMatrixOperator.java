package semestr1.practice09;

public class TransposeMatrixOperator extends AbstractMatrixOperator {
    public TransposeMatrixOperator() {
        super("Transpose(A^T)");
    }

    @Override
    public boolean isApplicable(EncapsulatedMatrix input) {
        return true;
    }

    @Override
    public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
        int m = input.getRows();
        int n = input.getCols();
        double[][] result = new double[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = input.getElement(i, j);
            }
        }
        return new EncapsulatedMatrix(result);
    }
}
