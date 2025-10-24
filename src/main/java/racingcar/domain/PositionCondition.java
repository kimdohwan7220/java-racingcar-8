package racingcar.domain;


import java.util.function.Supplier;

public class PositionCondition {
    private static final int MOVE_THRESHOLD = 4;
    private final Supplier<Integer> randomNumberSupplier;

    public PositionCondition(Supplier<Integer> randomNumberSupplier) {
        this.randomNumberSupplier = randomNumberSupplier;
    }

    public boolean canMove() {
        return randomNumberSupplier.get() >= MOVE_THRESHOLD;
    }
}
