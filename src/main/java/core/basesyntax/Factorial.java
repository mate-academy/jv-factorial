package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number != 0) {
            return getFactorial(number - 1) * number;
        }
        return 1;
    }
}
