package racingcar.view;

import java.util.List;
import racingcar.domain.Cars;

public class OutputView {

    public static void printCarStatus(Cars cars) {
        cars.getStatusPosition().forEach(System.out::println);
        System.out.println();
    }

    public static void printWinners(Cars cars) {
        List<String> winners = cars.getWinnerNames();
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
