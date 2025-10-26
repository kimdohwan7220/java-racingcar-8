package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String TRY_COUNT_INPUT_MESSAGE = "시도할 횟수는 몇 회인가요?";
    private static final String INVALID_NUMBER_ERROR = "시도 횟수는 숫자만 입력해야 합니다.";

    public static String inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,) 기준으로 구분):");
        return Console.readLine();
    }

    public static int inputTryCount() {
        System.out.println(TRY_COUNT_INPUT_MESSAGE);
        String input = Console.readLine();

        try {
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INVALID_NUMBER_ERROR);
        }
    }
}
