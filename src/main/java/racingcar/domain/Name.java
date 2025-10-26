package racingcar.domain;

public class Name {
    private static final int MAX_LENGTH = 5;
    private final String carName;
    private static final String EMPTY_NAME_ERROR = "자동차 이름은 비어 있을 수 없습니다.";
    private static final String NAME_LONG_ERROR = "자동차 이름은 5자를 초과할 수 없습니다.";


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
            throw new IllegalArgumentException(EMPTY_NAME_ERROR);
        }
    }

    private void validateMaxLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(NAME_LONG_ERROR);
        }
    }
}
