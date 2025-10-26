package racingcar.domain;

public class TryCount {
    private final int count;
    private static final String INVALID_TRYCOUNT_ERROR = "시도 횟수는 1회 이상이어야 합니다.";

    public TryCount(int count) {
        validate(count);
        this.count = count;
    }

    private void validate(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(INVALID_TRYCOUNT_ERROR);
        }
    }

    public int getCount() {
        return count;
    }
}
