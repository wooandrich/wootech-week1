package baseball.domain;

import baseball.resource.GameMessage;

public class BaseballResult {
    private int strike;
    private int ball;

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public String getStrikeMessage() {
        return getStrike() + GameMessage.GAME_STRIKE;
    }

    public String getBallMessage() {
        return getBall() + GameMessage.GAME_BALL;
    }

    public boolean isThreeStrike() {
        return getStrike() == 3;
    }

    @Override
    public String toString() {
        if (getStrike() > 0 && getBall() > 0) {
            return String.join(" ", getBallMessage(), getStrikeMessage());
        }

        if (getStrike() > 0 && getBall() == 0) {
            return getStrikeMessage();
        }

        if (getBall() > 0 && getStrike() == 0) {
            return getBallMessage();
        }

        return GameMessage.GAME_NOTHING;
    }
}
