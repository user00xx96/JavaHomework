package semestr1.practice09;

public class ScaleMatrixOperator extends AbstractMatrixOperator {
    private final double scaleFactor;

    public ScaleMatrixOperator(double scaleFactor) {
        super("Scale(x" + scaleFactor + ")");
        this.scaleFactor = scaleFactor;
    }

    @Override
    public boolean isApplicable(EncapsulatedMatrix input) {
        return true;
    }
    @Override
    public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
        double[][] data = input.getGridCopy();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = data[i][j] * scaleFactor;
            }
        }
        return new EncapsulatedMatrix(data);
    }
}
