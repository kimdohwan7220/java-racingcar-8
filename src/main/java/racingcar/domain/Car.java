package racingcar.domain;

public class Car {
    public static final String CAR_POSITION_MARK = "-";
    public static final int START_POSITION = 0;
    public final Name name;
    public final Position position;

    public Car(Name name) {
        this.name = name;
        this.position = new Position(START_POSITION);
    }

    public String getName() {
        return name.getCarName();
    }

    public int getPosition() {
        return position.getLocation();
    }

    public void moveForward() {
        position.moveForward();
    }

    @Override
    public String toString() {
        return name.getCarName() + " : " + CAR_POSITION_MARK.repeat(position.getLocation());
    }
}
