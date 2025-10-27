package racingcar.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TryCountTest {

    @DisplayName("시도 횟수가 1이상이 아닐 경우 - 실패")
    @Test
    void 시도_횟수_실패_예외() {
        assertThatThrownBy(() -> new TryCount(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("시도 횟수는 1회 이상이어야 합니다.");
    }

    @DisplayName("시도 횟수가 1이상인 경우 - 성공")
    @Test
    void 시도_횟수_성공_예외() {
        TryCount tryCount = new TryCount(3);
        assertThat(tryCount.getCount()).isEqualTo(3);
    }
}
