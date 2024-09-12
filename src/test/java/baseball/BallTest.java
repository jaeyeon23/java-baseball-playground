package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

<<<<<<< HEAD
/**
 * 순서
 * com / user
 * 1, 4 / 1, 4 = strike
 * 1, 4 / 2, 4 = ball
 * 1, 4 / 2, 3 = nothing
 */
=======
>>>>>>> 347becb651617049db525914544030977768a6c2
public class BallTest {
    private Ball ball;

    @BeforeEach
    void setUp() {
<<<<<<< HEAD
        ball = new Ball(1, 4);
    }

    @Test
    void nothing() {
        assertThat(ball.play(new Ball(2, 3))).isEqualTo(BallStatus.NOTHING);
=======
        ball = new Ball(1, 1);
    }

    @Test
    void strike() {
        BallStatus status = ball.play(new Ball(1, 1));
        assertThat(status).isEqualTo(BallStatus.STRIKE);
>>>>>>> 347becb651617049db525914544030977768a6c2
    }

    @Test
    void ball() {
<<<<<<< HEAD
        assertThat(ball.play(new Ball(2, 4))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        assertThat(ball.play(new Ball(1, 4))).isEqualTo(BallStatus.STRIKE);
=======
        BallStatus status = ball.play(new Ball(2, 1));
        assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        BallStatus status = ball.play(new Ball(2, 3));
        assertThat(status).isEqualTo(BallStatus.NOTHING);
>>>>>>> 347becb651617049db525914544030977768a6c2
    }
}
