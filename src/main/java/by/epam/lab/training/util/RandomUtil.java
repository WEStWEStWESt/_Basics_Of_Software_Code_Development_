package by.epam.lab.training.util;

import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random();
    private static final double MIN = 100.0;
    private static final double MAX = 999.0;

    public static int generateNumber() {
        return (random.nextInt((20) + 1) - 10);
    }

    public static int generatePositiveNumber() {
        return (random.nextInt(10) + 1);
    }

    public static double generateFloatPointNumber() {
        //Math.round(x * 1000.0) / 1000.0
        return (random.nextDouble() * ((MAX - MIN) + 1)) + MIN;
    }

}
