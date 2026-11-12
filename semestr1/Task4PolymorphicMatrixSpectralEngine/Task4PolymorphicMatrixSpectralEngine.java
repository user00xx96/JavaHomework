package semestr1.practice10.Task4PolymorphicMatrixSpectralEngine;

public class Task4PolymorphicMatrixSpectralEngine {
    public static double round2(double value) {
        return Math.round(value * 100) / 100.0;
    }

    public static double round4(double value) {
        return Math.round(value * 10000) / 10000.0;
    }

    public static void printMatrix(ImmutableMatrix2D m) {
        for (int i = 0; i < m.getRows(); i++) {
            String line = "  [ ";
            for (int j = 0; j < m.getCols(); j++) {
                line = line + round4(m.get(i, j)) + "  ";
            }
            line = line + "]";
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        ImmutableMatrix2D x0 = new ImmutableMatrix2D(new double[][]{{3.0, 4.0}, {0.0, 5.0}});

        System.out.println("================ СПЕКТРАЛЬНИЙ КОНВЕЄР МАТРИЧНИХ ОПЕРАТОРІВ ================");
        System.out.println("[ПОЧАТКОВА МАТРИЦЯ X0 (" + x0.getRows() + "x" + x0.getCols() + " | Норма: " + round4(x0.getFrobeniusNorm())
                + " | Слід: " + round2(x0.getTrace()) + " | det: " + round2(x0.getDeterminant()) + ")]:");
        printMatrix(x0);
        AbstractMatrixOperator[] pipeline = {
                new NonZeroScaleOperator(2.0),
                new TransposeOperator(),
                new GivensRotationOperator(60.0)
        };

        System.out.println();
        System.out.println("--- ПРЯМИЙ ХІД КОНВЕЄРА (Forward Pass через final execute()) --");
        ImmutableMatrix2D current = x0;
        for (int i = 0; i < pipeline.length; i++) {
            ImmutableMatrix2D before = current;
            current = pipeline[i].execute(before);
            String line = (i + 1) + ". Оператор '" + pipeline[i].getOperatorName() + "'";
            if (pipeline[i] instanceof OrthogonalOperator ort) {
                if (ort.verifyNormInvariance(before, current)) {
                    line = line + " [Orthogonal: Норма " + round4(current.getFrobeniusNorm()) + " збережена]";
                }
                line = line + " -> det: " + round2(current.getDeterminant());
            } else {
                line = line + " -> Норма: " + round4(current.getFrobeniusNorm()) + " | det: " + round2(current.getDeterminant());
            }
            System.out.println(line);
        }
        System.out.println("[ЗАШИФРОВАНА МАТРИЦЯ Y ПІСЛЯ 3 ЕТАПІВ]:");
        printMatrix(current);

        System.out.println();
        System.out.println("--- ЗВОРОТНИЙ ХІД ВІДНОВЛЕННЯ (Inverse Pass через instanceof InvertibleOperator) ---");
        ImmutableMatrix2D restored = current;
        for (int i = pipeline.length - 1; i >= 0; i--) {
            if (pipeline[i] instanceof InvertibleOperator inv) {
                restored = inv.applyInverse(restored);
                System.out.println("<- Декодування для '" + pipeline[i].getOperatorName() + "' виконано...");
            }
        }

        System.out.println();
        System.out.println("[ВІДНОВЛЕНА МАТРИЦЯ X_restored]:");
        printMatrix(restored);
        double error = x0.maxAbsDifference(restored);
        System.out.println("Максимальна похибка відновлення |X0 - X_restored|: " + error);
        if (error < 1e-14) {
            System.out.println("БЕЗВТРАТНА ОБОРОТНІСТЬ ДОТРИМАНА!");
        }

        System.out.println();
        System.out.println("--- ОПЕРАТОР БЕЗ ОБОРОТНОСТІ (UpperTriangularProjection) ---");
        ImmutableMatrix2D m3 = new ImmutableMatrix2D(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 10}});
        System.out.println("Матриця 3x3 (det: " + round2(m3.getDeterminant()) + "):");
        printMatrix(m3);
        AbstractMatrixOperator projection = new UpperTriangularProjection();
        ImmutableMatrix2D upper = projection.execute(m3);
        System.out.println("Після проєкції (det: " + round2(upper.getDeterminant()) + "):");
        printMatrix(upper);
        if (projection instanceof InvertibleOperator) {
            System.out.println("Оператор оборотний");
        } else {
            System.out.println("Оператор НЕ реалізує InvertibleOperator — інформацію втрачено безповоротно.");
        }
        System.out.println("===========================================================================");
    }
}
