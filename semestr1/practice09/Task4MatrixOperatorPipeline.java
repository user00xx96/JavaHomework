package semestr1.practice09;

public class Task4MatrixOperatorPipeline {
    public static void main(String[] args) {
        System.out.println("=============== КОНВЕЄР МАТРИЧНИХ ОПЕРАТОРІВ ================");

        double[][] data = {
                {1, 2},
                {3, 4}
        };
        EncapsulatedMatrix x0 = new EncapsulatedMatrix(data);

        data[0][0] = 100;
        System.out.println("Змінили зовнішній масив: data[0][0] = " + data[0][0]);
        System.out.println("А в матриці X0 елемент [0][0] = " + x0.getElement(0, 0));

        double[][] copy = x0.getGridCopy();
        copy[1][1] = -50;
        System.out.println("Змінили копію з getGridCopy(): copy[1][1] = " + copy[1][1]);
        System.out.println("А в матриці X0 елемент [1][1] = " + x0.getElement(1, 1));
        System.out.println();

        System.out.println("[ВХІДНА МАТРИЦЯ X0]:");
        System.out.println(x0);

        double[][] b = {
                {1, 0, 2},
                {0, 1, 1}
        };
        EncapsulatedMatrix matrixB = new EncapsulatedMatrix(b);
        MatrixPipeline pipeline = new MatrixPipeline("Головний конвеєр", 5);
        pipeline.addStage(new ScaleMatrixOperator(2.0));
        pipeline.addStage(new TransposeMatrixOperator());
        pipeline.addStage(new DiagonalShiftOperator(3.0));
        pipeline.addStage(new MultiplyByMatrixOperator(matrixB));

        EncapsulatedMatrix result = pipeline.runPipeline(x0);
        System.out.println("Перевірка: оператор DiagonalShift на матриці " + result.getRows() + "x" + result.getCols() + ":");
        DiagonalShiftOperator shift = new DiagonalShiftOperator(1.0);
        shift.executeSafely(result);

        System.out.println();
        System.out.println("Початкова матриця X0 після конвеєра не змінилась: ");
        System.out.println(x0);
        System.out.println("============================================================");
    }
}
