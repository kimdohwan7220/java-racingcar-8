package racingcar.view;

import java.util.List;
import racingcar.domain.Cars;

public class OutputView {
    private static final String RESULT_HEADER_MESSAGE = "실행 결과";

    public static void printResultHeader() {
        System.out.println("\n" + RESULT_HEADER_MESSAGE);  // 게임 시작 시 헤더
    }

    public static void printCarStatus(Cars cars) {
        cars.getStatusPosition().forEach(System.out::println);
        System.out.println();
    }

    public static void printWinners(Cars cars) {
        List<String> winners = cars.getWinnerNames();
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
