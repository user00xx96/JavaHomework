package semestr1.practice10.Task4PolymorphicMatrixSpectralEngine;

public class GivensRotationOperator extends AbstractMatrixOperator implements OrthogonalOperator {
    private double angleDegrees;

    public GivensRotationOperator(double angleDegrees) {
        super("GivensRotation(" + angleDegrees + "°)");
        this.angleDegrees = angleDegrees;
    }

    @Override
    public boolean canApply(ImmutableMatrix2D m) {
        return m.getRows() >= 2;
    }

    private ImmutableMatrix2D rotate(ImmutableMatrix2D m, double degrees) {
        double angle = Math.toRadians(degrees);
        double c = Math.cos(angle);
        double s = Math.sin(angle);
        double[][] a = m.getDataCopy();
        for (int j = 0; j < m.getCols(); j++) {
            double top = m.get(0, j);
            double bottom = m.get(1, j);
            a[0][j] = c * top - s * bottom;
            a[1][j] = s * top + c * bottom;
        }
        return new ImmutableMatrix2D(a);
    }

    @Override
    protected ImmutableMatrix2D transform(ImmutableMatrix2D m) {
        return rotate(m, angleDegrees);
    }
    @Override
    public ImmutableMatrix2D applyInverse(ImmutableMatrix2D transformed) {
        return rotate(transformed, -angleDegrees);
    }
}
