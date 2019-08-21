package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        int n = 1;
        for (int i = 1; i <= number; i++) {
            n *= i;
        }
        return n;
    }

}
