package baseball;

import java.util.Objects;

public class Ball {
    private final int position;
    private final BallNumber userNum;

    public Ball(int position, int userNum) {
        this.position = position;
        this.userNum = new BallNumber(userNum);
    }

    public BallStatus play(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (ball.matchUserNum(userNum)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchUserNum(BallNumber userNum) {
        return this.userNum == userNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && userNum == ball.userNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, userNum);
    }
}
