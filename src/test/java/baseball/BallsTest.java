package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallsTest {
    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void strike_3() {
        PlayResult result = balls.play(new Balls(Arrays.asList(1, 2, 3)));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
    }

    @Test
    void strike() {
        BallStatus status = balls.play(new Ball(1, 1));
        assertThat(status.isStrike()).isTrue();
    }

    @Test
    void ball() {
        BallStatus status = balls.play(new Ball(1, 3));
        assertThat(status.isBall()).isTrue();
    }

    @Test
    void nothing() {
        BallStatus status = balls.play(new Ball(1, 5));
        assertThat(status.isNothing()).isTrue();
    }
}
