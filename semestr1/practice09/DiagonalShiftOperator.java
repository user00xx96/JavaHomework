package semestr1.practice09;

public class DiagonalShiftOperator extends AbstractMatrixOperator {
    private final double lambda;

    public DiagonalShiftOperator(double lambda) {
        super("DiagonalShift(+" + lambda + "*I)");
        this.lambda = lambda;
    }

    @Override
    public boolean isApplicable(EncapsulatedMatrix input) {
        return input.isSquare();
    }
    @Override
    public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
        double[][] data = input.getGridCopy();
        for (int i = 0; i < data.length; i++) {
            data[i][i] = data[i][i] + lambda;
        }
        return new EncapsulatedMatrix(data);
    }
}
