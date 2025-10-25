package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class NameTest {

    @DisplayName("이름 공백 입력")
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "    "})
    void 이름_공백_입력(String name) {
        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 비어 있을 수 없습니다.");
    }

    @DisplayName("이름 null 입력")
    @Test
    void 이름_null_입력() {
        assertThatThrownBy(() -> new Name(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 비어 있을 수 없습니다.");
    }

    @DisplayName("이름 정상 입력")
    @ParameterizedTest
    @ValueSource(strings = {"pobi", "java", "Class", "ab", "A"})
    void 정상_입력(String name) {
        assertThat(new Name(name)).isInstanceOf(Name.class);
    }

    @DisplayName("이름 5자 초과 입력")
    @ParameterizedTest
    @ValueSource(strings = {"pobiii", "javaaaaa", "gooddddd"})
    void 이름이_5자를_넘는_입력(String name) {
        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 5자를 넘을 수 없습니다.");
    }
}
