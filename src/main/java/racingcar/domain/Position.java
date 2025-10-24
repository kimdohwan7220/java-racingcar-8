package racingcar.domain;

public class Position {
    private int location;

    public Position() {
        this.location = 0;
    }

    public int getLocation() {
        return location;
    }

    public void moveForward() {
        location++;
    }
}
