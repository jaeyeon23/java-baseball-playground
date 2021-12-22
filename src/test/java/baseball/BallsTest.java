package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 순서
 * com / user
 * 123 / 1, 4 = strike
 * 123 / 2, 4 = ball
 * 123 / 2, 3 = nothing
 */
public class BallsTest {
    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void strike_3() {
        PlayResult playResult = balls.play(new Balls(Arrays.asList(1, 2, 3)));
        assertThat(playResult.getStrike()).isEqualTo(3);
        assertThat(playResult.getBall()).isEqualTo(0);
    }

    @Test
    void strike() {
        BallStatus ballStatus = balls.play(new Ball(1, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        BallStatus ballStatus = balls.play(new Ball(1, 3));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        BallStatus ballStatus = balls.play(new Ball(1, 4));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

}
