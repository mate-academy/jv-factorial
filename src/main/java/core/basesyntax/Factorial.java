package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        return computeFactorialNumber(1, number);
    }

    private int computeFactorialNumber(int composition, int number) {
        if (number <= 1) {
            return composition;
        }
        return computeFactorialNumber(composition * number, --number);
    }
}
