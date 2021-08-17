package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    @DisplayName("야구 숫자 1~9 검증")
    void validate() {
        Assertions.assertThat(ValidationUtils.validNum(9)).isTrue();
        Assertions.assertThat(ValidationUtils.validNum(10)).isFalse();
        Assertions.assertThat(ValidationUtils.validNum(0)).isFalse();
    }
}
