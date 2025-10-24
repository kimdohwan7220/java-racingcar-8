package racingcar.domain;

public class Name {
    private static final int MAX_LENGTH = 5;
    private final String carName;

    public Name(String name) {
        validateName(name);
        this.carName = name;
    }

    public String getCarName() {
        return carName;
    }

    private void validateName(String name) {
        validateNotBlank(name);
        validateMaxLength(name);
    }

    private void validateNotBlank(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름은 비어 있을 수 없습니다.");
        }
    }

    private void validateMaxLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("이름은 " + MAX_LENGTH + "자를 넘을 수 없습니다.");
        }
    }
}
