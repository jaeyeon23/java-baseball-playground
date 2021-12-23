package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;

    public Balls(List<Integer> balls) {
        List<Ball> answer = mapBalls(balls);
        this.answers = answer;
    }

    private static List<Ball> mapBalls(List<Integer> balls) {
        List<Ball> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            answer.add(new Ball(i + 1, balls.get(i)));
        }
        return answer;
    }

    public PlayResult play(Balls balls) {
        PlayResult playResult = new PlayResult();
        for (Ball answer : answers) {
            playResult.report(balls.play(answer));
        }
        return playResult;
    }

    public BallStatus play(Ball ball) {
        return answers.stream()
                .map(answer -> answer.play(ball))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
