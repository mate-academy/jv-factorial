package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int value = 1;
        for (int i = 2; i <= number; i++) {
            value *= i;
        }
        return value;
    }
}
