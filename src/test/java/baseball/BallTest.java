package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 순서
 * com / user
 * 1, 4 / 1, 4 = strike
 * 1, 4 / 2, 4 = ball
 * 1, 4 / 2, 3 = nothing
 */
public class BallTest {
    private Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(1, 4);
    }

    @Test
    void nothing() {
        assertThat(ball.play(new Ball(2, 3))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        assertThat(ball.play(new Ball(2, 4))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        assertThat(ball.play(new Ball(1, 4))).isEqualTo(BallStatus.STRIKE);
    }
}
