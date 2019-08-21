package core.basesyntax;

/**
 * Реализуйте метод getFactorial(int number), который вовзращает факториал числа.
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return getFactorial(number - 1) * number;
    }
}
