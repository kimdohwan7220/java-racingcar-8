package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = Cars.createCarList(List.of(
                new Name("pobi"),
                new Name("woni"),
                new Name("jun")
        ));
    }

    @DisplayName("자동차 객체 리스트 생성 성공")
    @Test
    void 자동차_리스트_생성() {

        List<String> statusList = cars.getStatusPosition();

        assertThat(statusList.size()).isEqualTo(3);

        assertThat(statusList).containsExactly("pobi : ", "woni : ", "jun : ");
    }

    @DisplayName("자동차 이동 테스트")
    @Test
    void 랜덤_자동차_이동() {

        List<String> beforeMove = cars.getStatusPosition();
        assertThat(beforeMove).containsExactly("pobi : ", "woni : ", "jun : ");

        cars.moveAllCars();
        List<String> afterMove = cars.getStatusPosition();

        assertThat(afterMove.stream().anyMatch(s -> s.contains("-"))).isTrue();
    }

    @DisplayName("우승자가 1명인 경우")
    @Test
    void 우승자_1명_반환() {

        Car car1 = new Car(new Name("pobi"));
        Car car2 = new Car(new Name("woni"));
        Car car3 = new Car(new Name("jun"));

        Cars testCars = new Cars(List.of(car1, car2, car3));

        car1.moveForward();
        car1.moveForward();
        car2.moveForward();

        List<String> winnerNames = testCars.getWinnerNames();

        assertThat(winnerNames).containsExactly("pobi");
    }

    @DisplayName("우승자가 2명 이상인 경우")
    @Test
    void 우승자_2명_반환() {
        Car car1 = new Car(new Name("pobi"));
        Car car2 = new Car(new Name("woni"));
        Car car3 = new Car(new Name("jun"));

        Cars testCars = new Cars(List.of(car1, car2, car3));

        car1.moveForward();
        car2.moveForward();

        List<String> winnerNames = testCars.getWinnerNames();

        assertThat(winnerNames).containsExactlyInAnyOrder("pobi", "woni");
    }
}
