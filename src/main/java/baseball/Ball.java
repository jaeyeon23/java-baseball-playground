package baseball;

import java.util.Objects;

public class Ball {
    private final int position;
<<<<<<< HEAD
    private final BallNumber userNum;

    public Ball(int position, int userNum) {
        this.position = position;
        this.userNum = new BallNumber(userNum);
=======
    private final BallNumber number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = new BallNumber(number);
>>>>>>> 347becb651617049db525914544030977768a6c2
    }

    public BallStatus play(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
<<<<<<< HEAD
        if (ball.matchUserNum(userNum)) {
=======
        if (ball.isMatchNumber(this.number)) {
>>>>>>> 347becb651617049db525914544030977768a6c2
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

<<<<<<< HEAD
    private boolean matchUserNum(BallNumber userNum) {
        return this.userNum == userNum;
=======
    private boolean isMatchNumber(BallNumber userNumber) {
        return this.number == userNumber;
>>>>>>> 347becb651617049db525914544030977768a6c2
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
<<<<<<< HEAD
        return position == ball.position && userNum == ball.userNum;
=======
        return position == ball.position && number == ball.number;
>>>>>>> 347becb651617049db525914544030977768a6c2
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hash(position, userNum);
=======
        return Objects.hash(position, number);
>>>>>>> 347becb651617049db525914544030977768a6c2
    }
}
