package semestr1.practice09;

public class MatrixPipeline {
    private final String pipelineName;
    private final AbstractMatrixOperator[] stages;
    private int stageCount;
    public MatrixPipeline(String pipelineName, int maxStages) {
        this.pipelineName = pipelineName;
        if (maxStages <= 0) {
            maxStages = 5;
        }
        this.stages = new AbstractMatrixOperator[maxStages];
        this.stageCount = 0;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public int getStageCount() {
        return stageCount;
    }
    public void addStage(AbstractMatrixOperator op) {
        if (op == null) {
            System.out.println("Не можна додати порожній оператор");
            return;
        }
        if (stageCount >= stages.length) {
            System.out.println("Конвеєр заповнений, оператор '" + op.getOperatorName() + "' не додано");
            return;
        }
        stages[stageCount] = op;
        stageCount++;
    }

    public EncapsulatedMatrix runPipeline(EncapsulatedMatrix initial) {
        EncapsulatedMatrix current = initial;
        for (int i = 0; i < stageCount; i++) {
            EncapsulatedMatrix next = stages[i].executeSafely(current);
            if (next != current) {
                System.out.println("---> Етап " + (i + 1) + ": Оператор '" + stages[i].getOperatorName() + "' виконано успішно:");
            } else {
                System.out.println("---> Етап " + (i + 1) + ": Оператор '" + stages[i].getOperatorName() + "' пропущено:");
            }
            current = next;
            System.out.println(current);
        }
        return current;
    }
}