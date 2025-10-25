package racingcar.domain;

public class Position {
    private int location;

    public Position(int startPosition) {
        this.location = startPosition;
    }

    public int getLocation() {
        return location;
    }

    public void moveForward() {
        location++;
    }
}
