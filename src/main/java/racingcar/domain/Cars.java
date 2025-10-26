package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.utils.RandomNumberGenerator;

public class Cars {
    private final List<Car> cars;
    private final PositionCondition positionCondition;

    private Cars(List<Car> cars) {
        this.cars = cars;
        this.positionCondition = new PositionCondition();
    }

    public void moveAllCars() {
        for (Car car : cars) {
            positionCondition.tryMove(car);
        }
    }

    private int getMaxCarPosition() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(max, car.getPosition());
        }
        return max;
    }

    public List<String> getCarsPosition() {
        return cars.stream()
                .map(Car::toString)
                .collect(Collectors.toList());
    }

}
