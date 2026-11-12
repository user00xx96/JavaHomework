package semestr1.practice10;

public class TransposeOperator extends AbstractMatrixOperator implements OrthogonalOperator {

    public TransposeOperator() {
        super("Transpose(A^T)");
    }

    @Override
    public boolean canApply(ImmutableMatrix2D m) {
        return true;
    }

    @Override
    protected ImmutableMatrix2D transform(ImmutableMatrix2D m) {
        double[][] t = new double[m.getCols()][m.getRows()];
        for (int i = 0; i < m.getRows(); i++) {
            for (int j = 0; j < m.getCols(); j++) {
                t[j][i] = m.get(i, j);
            }
        }
        return new ImmutableMatrix2D(t);
    }

    @Override
    public ImmutableMatrix2D applyInverse(ImmutableMatrix2D transformed) {
        return transform(transformed);
    }
}
