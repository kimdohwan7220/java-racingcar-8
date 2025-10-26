package racingcar.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Name;

public class InputParser {
    private static final String EMPTY_INPUT_ERROR = "모든 자동차의 이름을 입력해주세요.";

    public static List<Name> inputParseDelimiter(String input) {

        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(EMPTY_INPUT_ERROR);
        }

        return Arrays.stream(input.split(","))
                .map(String::trim)
                .map(Name::new)
                .collect(Collectors.toList());
    }
}
