package baseball;

public enum BallStatus {
<<<<<<< HEAD
    BALL, STRIKE, NOTHING;

    public boolean isNotNothing() {
        return this != NOTHING;
    }
=======
    STRIKE, BALL, NOTHING;
>>>>>>> 347becb651617049db525914544030977768a6c2

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
<<<<<<< HEAD
=======

    public boolean isNothing() {
        return this == NOTHING;
    }

    public boolean isNotNothing() {
        return this != NOTHING;
    }
>>>>>>> 347becb651617049db525914544030977768a6c2
}
