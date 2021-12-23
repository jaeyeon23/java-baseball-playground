package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {
    private Ball ball;

    @BeforeEach
    void setUp() {
        ball = new Ball(1, 1);
    }

    @Test
    void strike() {
        BallStatus status = ball.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        BallStatus status = ball.play(new Ball(2, 1));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        BallStatus status = ball.play(new Ball(2, 3));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
    }
}
