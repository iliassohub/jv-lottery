package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = random.nextInt(1, 101);
        Colors color = colorSupplier.getRandomColor();
        Ball ball = new Ball(color, randomNumber);
        return ball;
    }
}
