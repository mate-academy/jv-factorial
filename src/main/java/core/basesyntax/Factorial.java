package core.basesyntax;

/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * getFactorial(--number);
    }
}
