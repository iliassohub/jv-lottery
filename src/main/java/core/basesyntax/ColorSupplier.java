package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Colors getRandomColor() {
        Colors[] values = Colors.values();
        int index = random.nextInt(values.length);
        return values[index];
    }
}
