package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationUtilsTest {
    @Test
    @DisplayName("1~9 사이인지 체크")
    void checkNumber() {
        assertThat(ValidationUtils.isValidNum(9)).isTrue();
        assertThat(ValidationUtils.isValidNum(1)).isTrue();
        assertThat(ValidationUtils.isValidNum(10)).isFalse();
        assertThat(ValidationUtils.isValidNum(0)).isFalse();
    }
}
