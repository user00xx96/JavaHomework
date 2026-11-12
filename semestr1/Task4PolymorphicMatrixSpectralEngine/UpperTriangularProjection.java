package semestr1.practice10.Task4PolymorphicMatrixSpectralEngine;


public class UpperTriangularProjection extends AbstractMatrixOperator {

    public UpperTriangularProjection() {
        super("UpperTriangularProjection");
    }

    @Override
    public boolean canApply(ImmutableMatrix2D m) {
        return true;
    }
    @Override
    protected ImmutableMatrix2D transform(ImmutableMatrix2D m) {
        double[][] a = m.getDataCopy();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i > j) {
                    a[i][j] = 0;
                }
            }
        }
        return new ImmutableMatrix2D(a);
    }
}
