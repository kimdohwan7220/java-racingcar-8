package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

    @DisplayName("자동차 이름 생성 성공 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "woni", "jun", "abcd"})
    void 자동차_이름_생성_성공(String nameStr) {
        Name name = new Name(nameStr);
        Car car = new Car(name);

        assertThat(car.getName()).isEqualTo(nameStr);
    }

    @DisplayName("자동차 이름 공백인 경우 생성 실패")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "     "})
    void 자동차_이름_생성_실패(String nameStr) {
        assertThatThrownBy(() -> new Car(new Name(nameStr)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("이름은 비어 있을 수 없습니다.");
    }
}
