package semestr1.practice10.Task4PolymorphicMatrixSpectralEngine;


public abstract class AbstractMatrixOperator {
    private final String operatorName;

    public AbstractMatrixOperator(String operatorName) {
        this.operatorName = operatorName;
    }
    public String getOperatorName() {
        return operatorName;
    }

    public abstract boolean canApply(ImmutableMatrix2D m);

    protected abstract ImmutableMatrix2D transform(ImmutableMatrix2D m);

    public final ImmutableMatrix2D execute(ImmutableMatrix2D m) {
        if (m == null || !canApply(m)) {
            System.out.println("Оператор '" + operatorName + "' неможливо застосувати до цієї матриці");
            return null;
        }
        ImmutableMatrix2D result = transform(m);
        if (this instanceof OrthogonalOperator ort) {
            if (!ort.verifyNormInvariance(m, result)) {
                System.out.println("Увага: оператор '" + operatorName + "' не зберіг норму Фробеніуса!");
            }
        }
        return result;
    }
}
