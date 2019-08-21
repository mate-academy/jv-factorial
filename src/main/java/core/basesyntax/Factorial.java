package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number < 1) {
            return 1;
        }

        int result;
        if (number == 1) {
            return 1;
        }
        result = number * getFactorial(number - 1);
        return result;
    }
}
