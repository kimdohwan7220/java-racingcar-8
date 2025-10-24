package racingcar.domain;


import java.util.function.Supplier;

public class DefaultPositionCondition implements PositionCondition {
    private static final int MOVE_THRESHOLD = 4;

    private final Supplier<Integer> randomNumberSupplier;

    public DefaultPositionCondition(Supplier<Integer> randomNumberSupplier) {
        this.randomNumberSupplier = randomNumberSupplier;
    }

    @Override
    public boolean canMove() {
        return randomNumberSupplier.get() >= MOVE_THRESHOLD;
    }
}
