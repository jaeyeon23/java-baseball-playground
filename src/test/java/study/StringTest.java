package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        // given
        String actual = "abc";

        // when
        actual = actual.replace("b", "d");

        // then
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        // given
        String actual = "1,2";

        // when
        String[] strArr = actual.split(",");

        // then
        assertThat(strArr).contains("1", "2");
    }

    @Test
    void split2() {
        // given
        String actual = "1";

        // when
        String[] strArr = actual.split(",");

        //then
        assertThat(strArr).containsExactly("1");
    }

    @Test
    void substring() {
        // given
        String actual = "(1,2)";

        // when
        String str = actual.substring(1, actual.length() - 1);

        // then
        assertThat(str).isEqualTo("1,2");
    }


    @Test
    @DisplayName("whohoho")
    void charAt() {
        // given
        int value = 1;
        String actual = "abc";

        // when
        char ch = actual.charAt(value);

        // then
        assertThat(ch).isEqualTo('b');
    }

    @Test
    @DisplayName("charAt에서 assertThatThrownBy를 사용하여 Exception 처리")
    void charAtException() {
        int index = 21;
        String str = "abc";

        assertThatThrownBy(() -> {
            char c = str.charAt(index);
            assertThat(c).isEqualTo('c');
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("index: %d", index);
    }

    @Test
    @DisplayName("charAt에서 assertThatExceptionOfType 사용하여 Exception 처리")
    void charAtException2() {
        int index = 21;
        String str = "abc";

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char c = str.charAt(index);
                    assertThat(c).isEqualTo('c');
                }).withMessageContaining("index: %d", index);
    }
}
