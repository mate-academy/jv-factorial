package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return getFactorial(number - 1) * number;
    }
}
