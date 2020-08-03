package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int result = number;
        if (number < 0) {
            return 0;
        }
        if (number <= 1) {
            return 1;
        }
        result = result * getFactorial(number - 1);
        return result;
    }
}
