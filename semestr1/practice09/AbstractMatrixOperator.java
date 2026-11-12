package semestr1.practice09;

public abstract class AbstractMatrixOperator {
    private final String operatorName;

    public AbstractMatrixOperator(String operatorName) {
        if (operatorName == null || operatorName.isEmpty()) {
            this.operatorName = "Невідомий оператор";
        } else {
            this.operatorName = operatorName;
        }
    }

    public String getOperatorName() {
        return operatorName;
    }

    public abstract boolean isApplicable(EncapsulatedMatrix input);


    public abstract EncapsulatedMatrix apply(EncapsulatedMatrix input);

    public final EncapsulatedMatrix executeSafely(EncapsulatedMatrix input) {
        if (input != null && isApplicable(input)) {
            return apply(input);
        }
        System.out.println("Увага: оператор '" + operatorName + "' не можна застосувати до цієї матриці, вона залишається без змін");
        return input;
    }

    @Override
    public String toString() {
        return operatorName;
    }
}
