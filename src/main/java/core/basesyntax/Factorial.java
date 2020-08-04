package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int n) {
        return n == 0 ? 1 : n == 1 ? 1 : n * getFactorial(n - 1);
    }
}
