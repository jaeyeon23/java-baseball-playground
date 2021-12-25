package baseball;

public class PlayResult {
    private int strike = 0;
    private int ball = 0;

<<<<<<< HEAD
    public void report(BallStatus ballStatus) {
        if (ballStatus.isStrike()) {
            this.strike += 1;
        }
        if (ballStatus.isBall()) {
=======
    public PlayResult() {

    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            this.strike += 1;
        }
        if (status.isBall()) {
>>>>>>> 347becb651617049db525914544030977768a6c2
            this.ball += 1;
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
