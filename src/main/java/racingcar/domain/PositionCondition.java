package racingcar.domain;

import racingcar.utils.RandomNumberGenerator;

public class PositionCondition {
    private static final int MOVE_THRESHOLD = 4;
    private final RandomNumberGenerator rng;

    public PositionCondition() {
        this.rng = new RandomNumberGenerator();
    }

    public void tryMove(Car car) {
        if (rng.generate() >= MOVE_THRESHOLD) {
            car.moveForward();
        }
    }
}
