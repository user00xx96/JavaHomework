package semestr1.practice10.Task4PolymorphicMatrixSpectralEngine;

public class NonZeroScaleOperator extends AbstractMatrixOperator implements InvertibleOperator {
    private double factor;

    public NonZeroScaleOperator(double factor) {
        super("Scale(x" + factor + ")");
        this.factor = factor;
    }

    @Override
    public boolean canApply(ImmutableMatrix2D m) {
        return factor != 0;
    }

    private ImmutableMatrix2D multiply(ImmutableMatrix2D m, double k) {
        double[][] a = m.getDataCopy();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] * k;
            }
        }
        return new ImmutableMatrix2D(a);
    }
    @Override
    protected ImmutableMatrix2D transform(ImmutableMatrix2D m) {
        return multiply(m, factor);
    }

    @Override
    public ImmutableMatrix2D applyInverse(ImmutableMatrix2D transformed) {
        return multiply(transformed, 1.0 / factor);
    }
}
