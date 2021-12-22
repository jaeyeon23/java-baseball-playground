package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;

    public Balls(List<Integer> comBalls) {
        List<Ball> ballList = mapBall(comBalls);
        this.answers = ballList;
    }

    private static List<Ball> mapBall(List<Integer> comBalls) {
        List<Ball> ballList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ballList.add(new Ball(i + 1, comBalls.get(i)));
        }
        return ballList;
    }

    public BallStatus play(Ball userBall) {
        return answers.stream()
                .map(answer -> answer.play(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(Balls userBalls) {
        PlayResult playResult = new PlayResult();
        for (Ball answer : answers) {
            playResult.report(userBalls.play(answer));
        }
        return playResult;
    }
}
