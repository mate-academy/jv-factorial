package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }
}
