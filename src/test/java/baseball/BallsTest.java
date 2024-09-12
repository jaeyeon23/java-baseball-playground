package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

<<<<<<< HEAD
/**
 * 순서
 * com / user
 * 123 / 1, 4 = strike
 * 123 / 2, 4 = ball
 * 123 / 2, 3 = nothing
 */
=======
>>>>>>> 347becb651617049db525914544030977768a6c2
public class BallsTest {
    private Balls balls;

    @BeforeEach
    void setUp() {
        balls = new Balls(Arrays.asList(1, 2, 3));
    }

    @Test
    void strike_3() {
<<<<<<< HEAD
        PlayResult playResult = balls.play(new Balls(Arrays.asList(1, 2, 3)));
        assertThat(playResult.getStrike()).isEqualTo(3);
        assertThat(playResult.getBall()).isEqualTo(0);
=======
        PlayResult result = balls.play(new Balls(Arrays.asList(1, 2, 3)));
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isEqualTo(0);
>>>>>>> 347becb651617049db525914544030977768a6c2
    }

    @Test
    void strike() {
<<<<<<< HEAD
        BallStatus ballStatus = balls.play(new Ball(1, 1));
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
=======
        BallStatus status = balls.play(new Ball(1, 1));
        assertThat(status.isStrike()).isTrue();
>>>>>>> 347becb651617049db525914544030977768a6c2
    }

    @Test
    void ball() {
<<<<<<< HEAD
        BallStatus ballStatus = balls.play(new Ball(1, 3));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
=======
        BallStatus status = balls.play(new Ball(1, 3));
        assertThat(status.isBall()).isTrue();
>>>>>>> 347becb651617049db525914544030977768a6c2
    }

    @Test
    void nothing() {
<<<<<<< HEAD
        BallStatus ballStatus = balls.play(new Ball(1, 4));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

=======
        BallStatus status = balls.play(new Ball(1, 5));
        assertThat(status.isNothing()).isTrue();
    }
>>>>>>> 347becb651617049db525914544030977768a6c2
}
